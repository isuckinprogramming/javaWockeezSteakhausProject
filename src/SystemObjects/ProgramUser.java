package SystemObjects;

import java.util.Scanner;

import DatabaseTables.Employees;

/***
 * Represents the user of the program and receives the data
 * intended for the user of the program.
 * */ 
public class ProgramUser {
  
  private boolean isAdminEmployee = false;
  private boolean isLogInSuccesful = false;


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

    // if( !EmployeeTable.checkForRegisteredAdmin() ) {
    //   // Call for register user as admin function 
    // }

    if(isCLIVersion) {
      logInCredentialsCLIVersion( EmployeeTable );
    } else {
      logInCredentialsGUIVersion();
    }
  }


  // program entry functions
  public void logInCredentialsCLIVersion(Employees EmployeeTable) {

    try {
      Scanner inputTaker = new Scanner(System.in);

      System.out.println("Enter employee id: ");

      String userInput = inputTaker.nextLine();
      int convertedInput = Integer.parseInt(userInput);

      System.out.println("Enter password: ");
      String passwordinput = inputTaker.nextLine();

      Object[] resultsFromVerification = EmployeeTable.verifyEmployeeIdAndPassword(
          convertedInput, passwordinput);

      isLogInSuccesful = (boolean) resultsFromVerification[0];

      String message = (isLogInSuccesful) ? "LOG IN SUCCESSFUL" : "log in failed";
      System.out.println(message);
      inputTaker.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  public void logInCredentialsGUIVersion() {

  }
  

  public void signUpFeedbackToProgramUser() {
  
  
  }

  public void logInfeedbackToProgramUser() {
  
  
  }


  // admin actions 
  public void registerAnEmployee() {

  }
  
  public void registerAnAdmin() {

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
