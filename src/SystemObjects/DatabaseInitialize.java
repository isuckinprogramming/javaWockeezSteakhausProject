package SystemObjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *                                                
 * 
 * This class will operate with static context because there 
 * is no need to initialize an object of this class more than 
 * once.
 * 
 * 
 * 
 * @author Borgs
 * */ 
public class DatabaseInitialize {

  private static String useProjDB = "CREATE DATABASE cce104_project_javawakeez_steakhauz_db";
  private static boolean isDatabaseInitialize = false;
  private static String projectDatabaseName = "cce104_project_javawakeez_steakhauz_db";

  public static boolean isProjectDatabaseCreatedInsideServer(Connection serverConnection) {

    boolean projectCreatedAlready = false;
    String showAllDB = "show databases";

    try {

      Statement statement = serverConnection.createStatement();

      ResultSet allDB = statement.executeQuery(showAllDB);

      while (allDB.next()) {

        String currentDbName = allDB.getString("Databases");

        if ( currentDbName.equals( getProjectDatabaseName() ) ) {

          projectCreatedAlready = true;
          break;
        }
      }

    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return projectCreatedAlready;
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
  
    String dbMainLocation = "jdbc://localhost:3306/";
    String user = "root";
    String password = "";

    Connection test = null;
    try {

      test = DriverManager.getConnection(
      "jdbc:mysql://localhost:3306/",
      "root",
      "");
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

      if( isProjectDatabaseCreatedInsideServer(serverCon) ){
        // TODO code if database does not exist inside server 
      }

    } catch (SQLException e) {

      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  
  }
  
  public static void createTableInsideDatabase(String tableCreationQuery) {

  }

  public static void useProjectDatabase() {

  }
}

