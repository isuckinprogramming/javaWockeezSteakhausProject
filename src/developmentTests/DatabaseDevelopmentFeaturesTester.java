package developmentTests;

import SystemObjects.DatabaseInitialize;

import java.sql.ResultSet;

import com.mysql.cj.exceptions.CJCommunicationsException;


import DatabaseObjectTemplates.DBEntity;
import DatabaseTables.Customer;
import DatabaseTables.EmployeePosition;
import DatabaseTables.Employees;
import DatabaseTables.Reservations;

/**
 * Class holds all methods to test the fucntions and classes
 * that operate on the project database.
 * 
 * **/ 
public class DatabaseDevelopmentFeaturesTester {

  public static void main(String[] args) {

    projectCreationOfDatabaseDefaultSetup();

    // testingEmployeeRegistration();

    testingReadFunctionsForEmployees();
  }
  

  private static void testingReadFunctionsForEmployees() {
  
    
    Employees employeeTable = new Employees();

    try {
      ResultSet allWorkingEmployees = employeeTable.getNamesOfWorkingEmployees();


      while (allWorkingEmployees.next()) {
        System.out.println(
          "first name: " + allWorkingEmployees.getString( employeeTable.firstnameColumn ) +       
          " last name: " +allWorkingEmployees.getString( employeeTable.lastnameColumn )
        );
      }
    } catch(Exception e) {

    }


    
  }


  /**
   * Testing The employee Registration for 
   * admin and employee.
   * 
   * */ 
  public static void testingEmployeeRegistration() {

    Employees employeeTable = new Employees();

    employeeTable.registerAdminUser( 
      "mother", 
      "packer", 
      "testing", 
      123_456_7890, 
        EmployeePosition.MANAGER);

    employeeTable.registerEmployee( 
      "ngieeewng", 
      "buggghsssh", 
      "bzzsttsssts", 
      123_456_7890, 
      EmployeePosition.ROOM_KEEPER);

    employeeTable.registerEmployee( 
      "this employee", 
      "should be removed", 
      "by the next query", 
      123_456_7890, 
        EmployeePosition.SECURITY_STAFF);
  }
    

  /**
   *Function to test out removal of employee entry and turning an employee 
   into NonWorking status. 
   * 
   *  
   **/ 
  public static void testingEntryRemovalAndTurnEmployeeIntoNotWorking() {

    Employees employeeTable = new Employees();

    employeeTable.turnEmployeeIntoNotWorking(51924);
    employeeTable.turnEmployeeIntoNotWorking(41862);
    employeeTable.turnEmployeeIntoNotWorking(51924);
    employeeTable.turnEmployeeIntoNotWorking(58868);
    
    employeeTable.removeEmployeeFromRecords(39005);
      
  } 
  
  /***
   * NOTE : FUNCTION MUST BE CALLED FIRST DURING PROGRAM START-UP
   * Create the project database and tables. The tables are 
   * empty by default. 
   * 
   * */ 
  private static void projectCreationOfDatabaseDefaultSetup() {

    try {

      DatabaseInitialize.createProjectDatabaseInsideServer();

      /***
       *create table inside the created project database 
       *will throw an exception if the table exist or other MySQL query problems
       *DatabaseInitialize.createTableInsideDatabase(new Reservations());
      */

      DBEntity[] allStrongTableEntities = {
          new Employees(),
          new Customer(),
          new Reservations()
      };

      // this method will create all tables for the project.
      DatabaseInitialize.createAllProjectTables(allStrongTableEntities);

      /**
       *creating the weak entities will be for last because they 
      *won't be created unless all tables that they are referencing is
      *created first.
      *DatabaseInitialize.createAllProjectTables( allWeakTableEntities); 
      */

    } catch (CJCommunicationsException exception) {
      System.out.println("MYSQL SERVER NOT STARTED.");
      exception.printStackTrace();
    }
  
  
  
  }

}
