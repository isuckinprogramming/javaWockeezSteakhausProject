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

  public static boolean isProjectDatabaseCreatedInsideServer(Connection serverConnection) {

    String showAllDB = "show databases";

    try {

      Statement statement = serverConnection.createStatement();

      ResultSet allDB = statement.executeQuery(showAllDB);

      while (allDB.next()) {

        String currentDbName = allDB.getString("Database");

        if (currentDbName.equals(getProjectDatabaseName())) {

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


  public static String getProjectDatabaseName() {
    return projectDatabaseName;
  }
  
  public static boolean isTableCreatedInsideProjectDatabase(String tableName) {
    
    return false;
  }


  /**
   * 
   * 
   * Connection uses port 3306 and JDBC Driver 8.1.0 to connect 
   * to MySQL server. 
   * <br></br>
   * S
   * @return Connection object that is connected to mysql server.
  */ 
  public static Connection createConnectionToServer() {

    if( isServerConnectionCreated ) {
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

    }
     catch (SQLException e) {
      
      // TODO Auto-generated catch block
      e.printStackTrace();
      return null;
    } 

    return serverConnection;
  }

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
}

