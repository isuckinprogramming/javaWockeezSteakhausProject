package SystemObjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
  
    // I am thinking of making the variables for connection in to 
    // variables inside the class that can be modified and changed 
    // depending on changes

    String dbMainLocation = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "";

    Connection test = null;
    try {

      test = DriverManager.getConnection(
      dbMainLocation,
      user,
      password );
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return test;
  }

  public static void createProjectDatabaseInsideServer() {

    try {

      Connection serverCon = createConnectionToServer();
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
   * @param tableEntity is a Class that implements the DBEntity interface.
  */ 
  public static void createTableInsideDatabase(DBEntity tableEntity) {

    tableEntity.getStringSQLQuery();
  }

  public static void useProjectDatabase() {

  }
}

