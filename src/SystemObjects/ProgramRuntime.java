package SystemObjects;

import DatabaseObjectTemplates.DBEntity;
import DatabaseTables.Customer;
import DatabaseTables.Employees;
import DatabaseTables.Reservations;

/***
 * Class contains the method to run when program starts and
 * handles the runtime methods of the Program.
 * 
 * Run main method of the Class to start the program.
 * */ 
public class ProgramRuntime {
  

  public static void main(String[] args) {

    ProgramRuntime programRunning = new ProgramRuntime();
    programRunning.start();

  }

  private void start() {

    startUpDatabaseSettings();

    Employees employeeTable = new Employees();
    ProgramUser currentProgramUser = new ProgramUser(employeeTable, true);

  }
  
  private void startUpDatabaseSettings() {
    DatabaseInitialize.createConnectionToServer();

    DBEntity[] projectTables = {new Employees(), new Customer(), new Reservations()};
    DatabaseInitialize.createAllProjectTables( projectTables );
  }



}
