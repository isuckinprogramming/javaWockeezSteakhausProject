package SystemObjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import DatabaseObjectTemplates.DBEntity;

/**
 *
 * Class holds methods for operating with the Project Database.
 * <br></br>
 * Creation of: <br></br> 
 * 1.Project Databases , <br></br>
 * 2.Database Tables inside Project Database, <br></br>
 * 3.Support functions to Check Database And Table Status. <br></br>
 * 
 * This class will operate with static context because there 
 * is no need to initialize an object of this class more than 
 * once.
 * 
 * @author Borgs
 * */ 
public class DatabaseInitialize {

  private static String createProjDB = "CREATE DATABASE cce104_project_javawakeez_steakhauz_db";
  private static boolean isDatabaseInitialize = false;
  private static String projectDatabaseName = "cce104_project_javawakeez_steakhauz_db";


  private static Connection serverConnection = null;
  private static boolean isServerConnectionCreated = false;
  private static boolean isMySQLServerAccessible = true;

  /***
   * Checks if the Project Database is created inside a server. Returns a boolean variable.
   * <br></br>
   * @param serverConnection Connection object that must be connected to a MySQL server.
   * @return true if the project DB is created, false if it is not created or there were problems encountered.
  */ 
  public static boolean isProjectDatabaseCreatedInsideServer(Connection serverConnection) {

    String showAllDB = "show databases";

    try {

      Statement statement = serverConnection.createStatement();

      ResultSet allDB = statement.executeQuery(showAllDB);

      while (allDB.next()) {

        String currentDbName = allDB.getString("Database");

        if (currentDbName.equals(getProjectDatabaseName())) {

          isDatabaseInitialize = true;
          return true;
        }

      }
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (Exception e) {
      // back up incase something happens 
      e.printStackTrace();
    }

    return false;
  }

  /**
   * The method returns a reference of the static class variable that represents 
   * the name of the database that is used for this project.
   * <br></br>
   * @return String representation of the name of the database used for the Project.
  */ 
  public static String getProjectDatabaseName() {
    return projectDatabaseName;
  }
  
  /****
   *Checks the project database if there is a table with the same name.
   *  <br></br>
   * @param tableName String representation of table name. All characters must be 
   * in lowercase, since all tablenames in a MySQL database is in lowercase.
   * 
   * @return true, if the table exist inside the project database.
   * <br></br>
   * The method will return false, either if the table exist inside the project 
   * database or if there are problems during the checking process.
  */ 
  public static boolean isTableCreatedInsideProjectDatabase(String tableName) {
    
    if (! ( isMySQLServerAccessible && isDatabaseInitialize ) ) {
      // base case for when the mysql server and database is unitialized
      return false;
    }

    String showAllTables = "show tables";
    String columnName = "Tables_in_" + getProjectDatabaseName();
    try {

      Statement statement = serverConnection.createStatement();
      statement.execute( "use "+ projectDatabaseName );
      ResultSet allTables = statement.executeQuery(showAllTables);

      while (allTables.next()) {

        String currentTableName = allTables.getString(columnName);

        if ( currentTableName.equals( tableName )) {

          return true;
        }

      }
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (Exception e) {
      // back up incase something happens 
      e.printStackTrace();
    } 
    return false;
  }


  /** 
   * Connection uses port 3306 and JDBC Driver 8.1.0 to connect 
   * to MySQL server. 
   * <br></br>
   * Method is mainly used to create a Connection to the server 
   * will be assigned to a Connection variable, which is static and located 
   * inside class. 
   * <br></br>
   * If this method is already called before, it will return a reference to 
   * the static Connection variable that was given a Connection to the server 
   * during the previous method calls.
   * <br></br>
   * @return Connection object that is connected to mysql server.
   * This method will return null if there are problems in regards 
   * to connecting with the MySQL server. 
   * 
   * <br></br>
   * NOTE : SHOULD ADD A METHOD SIGNATURE TO INDICATE NULL RETURN VALUE.
  */ 
  public static Connection createConnectionToServer() {

    if (isServerConnectionCreated) {
      return serverConnection;
    }
    /**
     *I am thinking of making the variables for connection in to 
    variables inside the class that can be modified and changed 
    depending on changes 
    */

    String dbMainLocation = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "";

    try {

      serverConnection = DriverManager.getConnection(
          dbMainLocation,
          user,
          password);

      isServerConnectionCreated = true;
      isMySQLServerAccessible = true;
    } catch (com.mysql.cj.jdbc.exceptions.CommunicationsException e) {

      System.out.println("MySQL server is not running or Wrong Port used for Connection");

      JOptionPane.showMessageDialog(null,
          "MySQL server is not started or wrong port used (default port 3306 is used.",
          "Connection to MySQL server failed",
          JOptionPane.ERROR_MESSAGE);

      isMySQLServerAccessible = false;
      // optional to print stack trace or not
      // e.printStackTrace();

    } catch (SQLException e) {

      // TODO Auto-generated catch block
      e.printStackTrace();
      return null;
    }

    return serverConnection;
  }

  
  /**
   * Creates the project database inside the server.
   * <br></br>
   * The method uses the uses the Connection instance 
   * that is created from calling the method to 
   * create a Connection object with the MySQL server.
   * <br></br>
   * If the MySQL server cannot be accessed and/or the 
   * the Connection Object associated with the server 
   * is not successfully created, then this method will 
   * not create the Project Database.
   * <br></br>
   * NOTE : SUBJECT TO CHANGE.
   * <br></br>
   * As of development, this method does not print to the 
   * terminal the stacktrace for exceptions, and prints 
   * only simplified and vague messages of the problem. 
   * 
  */
  public static void createProjectDatabaseInsideServer() {

    if (!isMySQLServerAccessible) {
      // stop fucntion if mysql server is inaccessible
      return;
    }

    try {

      Connection serverCon = createConnectionToServer();
      if (serverCon == null) {
        // end the function or throw an error, this is 
        // because the mysql server is not started
        // there is an error when during the process of creating 
        // connection 
        JOptionPane.showMessageDialog(
          null,
          "Could not create project database because there is no valid Connection to Server"
          , "Project Database Creation failed",
          JOptionPane.ERROR_MESSAGE
        );
        return;
      }

      Statement statement = serverCon.createStatement();

      if (isProjectDatabaseCreatedInsideServer(serverCon)) {
        // TODO code if database does not exist inside server
        System.out.println("Project database already created inside server.");
      } else {

        statement.execute(createProjDB);
        System.out.println("Project database succesfully created inside Server.");
      }

    } catch (SQLException e) {

      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }
  
  /***
   * Method creates the table represented by the class representing the DBEntity
   *  <br></br>
   * The method retrieves the MySQL query for the creation of the database table
   * through the getStringSQLQuery() method of that is specified inside the 
   * DBEntity interface.
   *  <br></br>
   * 
   * @param tableEntity is a Class that implements the DBEntity interface.
  */ 
  public static void createTableInsideDatabase(DBEntity tableEntity) {

    if (!isMySQLServerAccessible) {
      // stop function if mysql server is not accessible
      return;
    }

    // check if table is already created inside database.
    if (isTableCreatedInsideProjectDatabase(tableEntity.getTableName())) {

      JOptionPane.showMessageDialog(
          null,
            "The table " + tableEntity.getTableName()
            + " already exist inside " + getProjectDatabaseName() + " database."
          ,
          "Database Table Creation",
          JOptionPane.WARNING_MESSAGE,
          null);

      return;
    }



    try {

      Connection serverCon = createConnectionToServer();
      Statement statement = serverCon.createStatement();
      
      statement.execute("USE " + projectDatabaseName);

      statement.execute(tableEntity.getStringSQLQuery());

      System.out.println(
          "The table " + tableEntity.getTableName() +
          " is successfully created inside the " +
          getProjectDatabaseName() + " database."
      );
    }
    catch (SQLException e) {
      // exception when there are problems in mysql queries 
      e.printStackTrace();
    } 
    catch (Exception e) {
      // back up catch block for unexpected exception
      e.printStackTrace();
    }
    
  }

  public static void useProjectDatabase() {

  }

  public static void createAllProjectTables( DBEntity[]  allTableEntities ) {

    for (DBEntity databaseEntity : allTableEntities) {
      createTableInsideDatabase(databaseEntity);
    }
  }
}

