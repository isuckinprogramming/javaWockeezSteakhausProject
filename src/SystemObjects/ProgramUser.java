package SystemObjects;

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
  public ProgramUser( Employees EmployeeTable ) {

  }


  private void CheckForAdmin() {

  }

  // program entry functions
  public void logInCredentialsCLIVersion() {
  
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
