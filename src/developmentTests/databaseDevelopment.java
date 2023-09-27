package developmentTests;

import SystemObjects.DatabaseInitialize;
import databaseTables.Reservations;

public class databaseDevelopment {

  public static void main(String[] args) {
    
    DatabaseInitialize.createProjectDatabaseInsideServer();
    
    // create table inside the created project database 
    // will throw an exception if the table exist or other MySQL query problems
    DatabaseInitialize.createTableInsideDatabase(new Reservations());


  }
  
}
