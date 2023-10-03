package SystemObjects;

import java.sql.ResultSet;
import java.util.Scanner;

import javax.swing.JOptionPane;

import DatabaseTables.EmployeePosition;
import DatabaseTables.Employees;
import GUI.EmployeeRegistration;
import GUI.LoginForm;

/***
 * Represents the user of the program and receives the data
 * intended for the user of the program.
 * */ 
public class ProgramUser {

  // CONSTANTS
  private final int 
    VIEW_ALL = 1,
    VIEW_NON_WORKING = 2,
    VIEW_WORKING = 3,
    VIEW_ADMIN = 4,
    VIEW_NON_ADMIN = 5;


  // utility varibles
  private Scanner inputTaker = new Scanner(System.in);

  // variables for current program user status
  private boolean isAdminEmployee = false;
  private boolean isLogInSuccesful = false;
  private int employeeIdOfCurrentUser = -1;
  public Employees EmployeeTableReference;

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
   * @param isCLIVersion Boolean variable to determin whether to use
   * the CLI Version of the program. If false, the GUI version of the 
   * program is used.
   * 
  */ 
  public ProgramUser(Employees EmployeeTable, boolean isCLIVersion) {

    if (isCLIVersion) {
      programCLIVersion(EmployeeTable);
    } else {
      programGUIVersion(EmployeeTable);
    }

  }
  
  private void programCLIVersion(Employees EmployeeTable) {

    if (!EmployeeTable.checkForRegisteredAdmin()) {
      // Call for register user as admin function
      registerAnAdminCLIVersion(EmployeeTable);
    }

    // log in functions, choose which to use
    logInCredentialsCLIVersion(EmployeeTable);
  }
  
  // TODO Create code for GUI version of the Program  
  private void programGUIVersion(Employees EmployeeTable) {


    if (!EmployeeTable.checkForRegisteredAdmin() ) {
      EmployeeRegistration registerEmployee = new EmployeeRegistration( this,EmployeeTable );
    } else {

      LoginForm logInFormInstance = new LoginForm(this, EmployeeTable);
    }
    
  }
  
  public void programResourcesManagementCLIVerion() {

    String message = "PLEASE SELECT AN ACTION TO DO : " + 
    "\n 1. VIEW ALL EMPLOYEE DATA == " + VIEW_ALL +
    "\n 2. VIEW NON-WORKING EMPLOYEE DATA == " + VIEW_NON_WORKING +
    "\n 3. VIEW WORKING EMPLOYEE DATA == " + VIEW_WORKING +
    "\n 4. VIEW ADMIN EMPLOYEE DATA == " + VIEW_ADMIN +
    "\n 5. VIEW NON-ADMIN EMPLOYEE DATA == " + VIEW_NON_ADMIN +
        "\nEnter corresponding number";
    
    String userChoice = promptForStringInputInCLI(message);

  }

  // program entry functions
  public void logInCredentialsCLIVersion(Employees EmployeeTable) {

    try {

      int employeeidEntry = employeeIdLogInEntryCLIVersion();
      String passwordinput = promptForStringInputInCLI("Enter password: ");

      Object[] resultsFromVerification = verifyCredentialsInsideDatabase(
          EmployeeTable, employeeidEntry, passwordinput);

      logInResponseCLIVersion((boolean) resultsFromVerification[0]);

      // call this method again if results are false
      if (!isLogInSuccesful) {
        System.out.println("wrong password or invalid Admin Employee ID.");
        logInCredentialsCLIVersion(EmployeeTable);
      }

      determineWhetherUserIsAdminOrNot(  (ResultSet) resultsFromVerification[1], EmployeeTable );

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void determineWhetherUserIsAdminOrNot(ResultSet employeeData, Employees employeeTable) {
    
    try {
      
      String admin = employeeData.getString(employeeTable.isAdminAuthorityLevel);
      
      isAdminEmployee = (admin.equals("1")) ? true : false;
      
      employeeIdOfCurrentUser = 
        Integer.parseInt(
          employeeData.getString(employeeTable.employeeidColumn)
        );

      String username = 
        employeeData.getString(employeeTable.firstnameColumn) + " " +
        employeeData.getString(employeeTable.lastnameColumn);

      String message =
        (isAdminEmployee) ? 
        "User "+ username +" is an Admin Employee" : 
        "User " + username + " is an Employee not granted Admin Rights.";
      
      System.out.println(message);

      JOptionPane.showMessageDialog(null,
          message,
          "Employee Authority Notification",
         JOptionPane.INFORMATION_MESSAGE);

    } catch(Exception e ) {
      e.printStackTrace();
    }
    
  }
  

  private int employeeIdLogInEntryCLIVersion() {

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
      
  return EmployeeTable.verifyEmployeeIdAndPassword(employeeidInput, passwordInput);
  
  }

  private void logInResponseCLIVersion( boolean validity) {
  
    isLogInSuccesful = validity;
    String message = (isLogInSuccesful) ? "LOG IN SUCCESSFUL" : "LOG IN FAILED";
    
    System.out.println(message);

    JOptionPane.showMessageDialog(
        null,
        message,
        "Log In Status",
       JOptionPane.INFORMATION_MESSAGE);
  }



  /**
   * To be implemented here when the GUI Skeleton is fixed and ready.
   * 
   * */ 
  public boolean logInCredentialsGUIVersion(
    Employees EmployeeTable,
    int employeeid,
    String password
  ) {

   try {

      Object[] resultsFromVerification = verifyCredentialsInsideDatabase(
          EmployeeTable, employeeid, password);

      // logInResponseCLIVersion((boolean) resultsFromVerification[0]);
      isLogInSuccesful = (boolean) resultsFromVerification[0];
      
      // call this method again if results are false
      if (isLogInSuccesful) {

        // will set the flag if user is admin or not
        determineWhetherUserIsAdminOrNot(
          (ResultSet) resultsFromVerification[1],
            EmployeeTable
        );

        JOptionPane.showMessageDialog(
          null, 
          "Log-in is Successful. Welcome!!!!",
          "Employee Log-in SUCCESS",
          JOptionPane.INFORMATION_MESSAGE);
        return true;
      } else {

        JOptionPane.showMessageDialog(
          null, 
          "Log-in is unsuccessful. Wrong Password or Employee ID",
          "Employee Log-in Unsuccessful",
          JOptionPane.INFORMATION_MESSAGE);
        return false;
      }

      
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }
  
  private String promptForStringInputInCLI(String message) {
    System.out.println( message);
    return inputTaker.nextLine();
  }
  
  public void presentEmployeeDetailsCLIVersion( int employeeid ) {
  
  }



/****
 *  Method to register an admin employee through gui
 * @param employeeTable
 * @param firstnameEntry
 * @param lastnameEntry
 * @param passwordEntry
 * @param contactNumberRaw
 * @param positionNumber
 * @return
*/ 
  public boolean registerAnEmployeeGUIVerion(
    Employees employeeTable,
    String firstnameEntry ,
    String lastnameEntry , 
    String passwordEntry ,
    String contactNumberRaw ,
    int positionNumber    
  ) {

    int convertedNumber = Integer.parseInt(contactNumberRaw);

    Object[] resultsFromRegistration = employeeTable.registerAdminUser(
        firstnameEntry,
        lastnameEntry,
        passwordEntry,
        convertedNumber,
        convertNumberIntoJobPosition(positionNumber)
      );

    if ((boolean) resultsFromRegistration[0]) {

      JOptionPane.showMessageDialog(null,
          "Employee Registration Successful!\nYour Employee ID is " + (int) resultsFromRegistration[1],
          "Admin Employee Registration",
          JOptionPane.INFORMATION_MESSAGE);
      return true;

    } else {

      JOptionPane.showMessageDialog(null,
          "registration failed\nTry again.",
          "Admin Employee Registration",
          JOptionPane.INFORMATION_MESSAGE);
      
      // call method to start the registration process again. 
      // registerAnEmployeeGUIVerion()
      return false;
    }
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
        "\n NOTE : Prompt repeats itself over and over again in wrong input.");

        convertedChoice = Integer.parseInt(positionChoice);
      } catch (NumberFormatException e) {
        // exception when the String can't be converted into a number  
        convertedChoice = -1;
      } catch (Exception e) {
        convertedChoice = -1;
      }

    } while (convertedChoice > 6 || convertedChoice < 1);

    return convertNumberIntoJobPosition(convertedChoice);
  }
  
  public EmployeePosition convertNumberIntoJobPosition( int number ) {
    switch (number) {
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

}
