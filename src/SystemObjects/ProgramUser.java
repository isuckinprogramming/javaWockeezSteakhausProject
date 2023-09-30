package SystemObjects;

import java.util.Scanner;

import DatabaseTables.EmployeePosition;
import DatabaseTables.Employees;

/***
 * Represents the user of the program and receives the data
 * intended for the user of the program.
 * */ 
public class ProgramUser {
  
  private boolean isAdminEmployee = false;
  private boolean isLogInSuccesful = false;
  private Scanner inputTaker= new Scanner (System.in);

  /***
   *Creates an instance of the ProgramUser. The program user must
   be verified through a log-in process. Which is why an instance of 
   the Employees Class is needed. 
   <br></br> 
    
   * @param EmployeeTable Instance of the Employees Class which is 
   * needed for the Log-in verification process or if there is no  
   * registered Employee. The program user goes through the Admin 
   * Registration Process before going through a Log-in Verification 
   * process.
  */ 
  public ProgramUser(Employees EmployeeTable, boolean isCLIVersion) {

    if( !EmployeeTable.checkForRegisteredAdmin() ) {
      // Call for register user as admin function
      registerAnAdminCLIVersion(EmployeeTable);
    }

    if(isCLIVersion) {
      logInCredentialsCLIVersion( EmployeeTable );
    } else {
      logInCredentialsGUIVersion();
    }
  }


  // program entry functions
  public void logInCredentialsCLIVersion(Employees EmployeeTable) {

    try {

      int employeeidEntry = employeeIdLogInEntry();
      String passwordinput = promptForStringInputInCLI("Enter password: ");


      Object[] resultsFromVerification = verifyCredentialsInsideDatabase(
          EmployeeTable, employeeidEntry, passwordinput);


      logInResponse((boolean) resultsFromVerification[0]);

      // call this method again if results are false
      if (!isLogInSuccesful) {
        System.out.println("wrong password or invalid Admin Employee ID.");
        logInCredentialsCLIVersion(EmployeeTable);
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private int employeeIdLogInEntry() {

    boolean isEmployeeIdValid = false;
    int convertedEmployeeIdInput = -1;

    do {

      try {

        String userInput = promptForStringInputInCLI("Enter employee id: ");

        convertedEmployeeIdInput = Integer.parseInt(userInput);
        isEmployeeIdValid = true;

      } catch (NumberFormatException e) {
        System.out.println(
            "please enter numbers to represent your Employee Id.\n" +
                "NOTE: Improper inputs will repeat this prompt and returns back to entry of Employee Id.\n");
      }
      
    } while (!isEmployeeIdValid);
    return convertedEmployeeIdInput;  
  }
  


  private Object[] verifyCredentialsInsideDatabase(
      Employees EmployeeTable,
      int employeeidInput,
      String passwordInput
    ) throws Exception {
      return EmployeeTable.verifyEmployeeIdAndPassword(
        employeeidInput, passwordInput
      );
  }

  private void logInResponse( boolean validity) {
  
    isLogInSuccesful = validity;
    String message = (isLogInSuccesful) ? "LOG IN SUCCESSFUL" : "log in failed";
    System.out.println(message);
  }





  public void logInCredentialsGUIVersion() {


  }
  
  private String promptForStringInputInCLI(String message) {
    System.out.println( message);
    return inputTaker.nextLine();
  }
  
  public void presentEmployeeDetailsCLIVersion( int employeeid ) {
  
  
  
  }




  public void signUpFeedbackToProgramUser() {
  
  
  }

  public void logInfeedbackToProgramUser() {
  
  
  }


  // admin actions 
  public void registerAnEmployee() {

  }
  
  public void registerAnAdminCLIVersion(Employees employeeTable) {

    String firstnameEntry = promptForStringInputInCLI("ADMIN EMPLOYEE REGISTRATION\nFirst name : ");
    String lastnameEntry = promptForStringInputInCLI("Last name : ");
    String passwordEntry = promptForStringInputInCLI("Password : ");
    String contactNumberRaw = promptForStringInputInCLI("Contact number :");
    int convertedNumber = Integer.parseInt(contactNumberRaw);

    EmployeePosition positionChoice = employeeJobPositionEntryCLIVersion();

    Object[] resultsFromRegistration = employeeTable.registerAdminUser(
        firstnameEntry,
        lastnameEntry,
        passwordEntry,
        convertedNumber,
        positionChoice
      );

    if ((boolean) resultsFromRegistration[0]) {

      System.out.println(
          "Employee Registration Successful!\nYour Employee ID is " +
              (int) resultsFromRegistration[1]);
    } else {
      System.out.println("registration failed\nTry again.");
      registerAnAdminCLIVersion(employeeTable);
    }
  }
  
  private EmployeePosition employeeJobPositionEntryCLIVersion() {

    int convertedChoice = -1;
    
    do {

      try {
        String positionChoice = promptForStringInputInCLI(
        "Choose Position in Organization : \n" +
        "UNVERIFIED == 1\n" +
        "MANAGER == 2\n" +
        "ACCOUNTANT == 3\n" +
        "CLERK == 4\n" +
        "SECURITY_STAFF == 5\n" +
        "ROOM_KEEPER == 6\n" + 
        "Please enter numeric values within the Choices: " +
        "\n NOTE : Prompt repeats itself over and over again in wrong input."
        );

        convertedChoice = Integer.parseInt(positionChoice);
      }
      catch (NumberFormatException e) {
        // exception when the String can't be converted into a number  
        convertedChoice = -1;
      }
      catch (Exception e) {
        convertedChoice = -1;
      }

    } 
    while (convertedChoice > 6 || convertedChoice < 1);
    
    switch (convertedChoice) {
      case 1:
        return EmployeePosition.UNVERIFIED;
      case 2:
        return EmployeePosition.MANAGER;
      case 3:
        return EmployeePosition.ACCOUNTANT;
      case 4:
        return EmployeePosition.CLERK;
      case 5:
        return EmployeePosition.SECURITY_STAFF;
      case 6:
        return EmployeePosition.ROOM_KEEPER;
      default:
        return EmployeePosition.UNVERIFIED;
    }
  }
  
  public void registerAnAdmin(
      int employeeIdOfToBeAdminEmployee,
      int employeeidOfInitiatingAdmin ) {

  }

  //employee actions 
  //admin also inherits the action capabilities of the employee
  public void createReservationForCustomer() {
  
  
  }

  public void createCustomerEntry() {

  }

  public void changeReservationStatus() {
 
 
  }



}
