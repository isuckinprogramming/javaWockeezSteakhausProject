package developmentTests;

import SystemObjects.DatabaseInitialize;

import com.mysql.cj.exceptions.CJCommunicationsException;


import DatabaseObjectTemplates.DBEntity;
import DatabaseTables.Customer;
import DatabaseTables.Employees;
import DatabaseTables.Menuitems;
import DatabaseTables.Reservations;
import DatabaseTables.Transactions;

public class databaseDevelopment {

  public static void main(String[] args) {

    try {
          
    DatabaseInitialize.createProjectDatabaseInsideServer();
    
    // create table inside the created project database 
    // will throw an exception if the table exist or other MySQL query problems
    // DatabaseInitialize.createTableInsideDatabase(new Reservations());


    DBEntity[] allStrongTableEntities = {
        new Employees(),
        new Customer(),
        new Menuitems(),
        new Reservations()
    };

    DBEntity[] allWeakTableEntities = {
        new Transactions()
    };


    // this method will create all tables for the project.
    DatabaseInitialize.createAllProjectTables( allStrongTableEntities );

    // creating the weak entities will be for last because they 
    // won't be created unless all tables that they are referencing is
    // created first.
    // DatabaseInitialize.createAllProjectTables( allWeakTableEntities);
    }
    catch ( CJCommunicationsException exception) {
      System.out.println( "MYSQL SERVER NOT STARTED.");
      exception.printStackTrace();
    }

  }
  
}
