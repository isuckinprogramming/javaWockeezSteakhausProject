package SystemObjects;

import java.sql.Connection;

/**
 * This class will operate with static context because there 
 * is no need to initialize an object of this class more than 
 * once.
 * 
 * 
 * @author Borgs
 * */ 
public class DatabaseInitialize {

  private static boolean isDatabaseInitialize = false;

  public static boolean isProjectDatabaseCreatedInsideServer() {

    return false;
  }

  public static boolean isTableCreatedInsideProjectDatabase(String tableName) {
    
    return false;
  }


  public static Connection createConnectionToServer() {

    return null;
  }

  public static void createProjectDatabaseInsideServer() {
  
  
  }
  
  public static void createTableInsideDatabase(String tableCreationQuery) {

  }

  public static void useProjectDatabase() {

  }
}

