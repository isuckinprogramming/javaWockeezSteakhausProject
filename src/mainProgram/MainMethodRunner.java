package mainProgram;

import javax.swing.JOptionPane;

import com.mysql.cj.exceptions.CJCommunicationsException;

import DatabaseObjectTemplates.DBEntity;
import DatabaseTables.Customer;
import DatabaseTables.CustomerService;
import DatabaseTables.Employees;
import DatabaseTables.Reservations;
import DatabaseTables.Rooms;
import SystemObjects.DatabaseInitialize;
import SystemObjects.ProgramUser;

/***
 * Class contains the method to run when program starts and
 * handles the runtime methods of the Program.
 * 
 * Run main method of the Class to start the program.
 * */ 
public class MainMethodRunner {
  

  public static void main(String[] args) {

    MainMethodRunner programRunning = new MainMethodRunner();
    programRunning.start();

  }

  private void start() {

    projectCreationOfDatabaseDefaultSetup();

    Employees employeeTable = new Employees();
    boolean isUsingCLI = false;

    ProgramUser currentProgramUser = new ProgramUser(employeeTable, isUsingCLI);
  }

  
  /***
   * NOTE : FUNCTION MUST BE CALLED FIRST DURING PROGRAM START-UP
   * Create the project database and tables. The tables are 
   * empty by default. 
   * 
   * */ 
  private static void projectCreationOfDatabaseDefaultSetup() {

    try {
      /***
       *create table inside the created project database 
       *will throw an exception if the table exist or other MySQL query problems
       *DatabaseInitialize.createTableInsideDatabase(new Reservations());
      */
      DatabaseInitialize.DatabaseStart();

      DBEntity[] allStrongTableEntities = {
        new Employees(),
        new Reservations() // Create Reservation first before the Customer   
      };

      DBEntity[] allWeakTableEntities = {
        new Customer(), // Create Customer after Reservation
        new Rooms(),
        new CustomerService() // Create Customer Service after Creating Employees, Customer, Reservation
      };

      // this method will create all tables for the project.
      DatabaseInitialize.createAllProjectTables(allStrongTableEntities);

      /**
       *creating the weak entities will be for last because they 
      *won't be created unless all tables that they are referencing is
      *created first.
      */
      DatabaseInitialize.createAllProjectTables( allWeakTableEntities); 

    } catch (CJCommunicationsException exception) {
      System.out.println("MYSQL SERVER NOT STARTED.");
      JOptionPane.showMessageDialog(null,
          "MYSQL SERVER NOT STARTED. Try Starting MySQL Server first.",
          "Database Initialization Error",
       JOptionPane.ERROR_MESSAGE);
      exception.printStackTrace();
    }
  }
}
