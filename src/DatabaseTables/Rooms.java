package DatabaseTables;

import DatabaseObjectTemplates.DBEntity;

public class Rooms implements DBEntity {

  public static final String 
    tableName = "rooms",
    roomIdColumn = "roomid",
    availableColumn = "available";

  public static final int NUMBER_OF_COLUMNS = 2;
    
  @Override
  public String getStringSQLQuery() {
    return 
     "CREATE TABLE " + tableName + "(\r\n" + //
      "  "+roomIdColumn+" INT PRIMARY KEY AUTO_INCREMENT ,\r\n" + //
      "  "+availableColumn+" BOOLEAN NOT NULL DEFAULT true\r\n" + //
      ")";    


  }

  @Override
  public String getTableName() {
    return tableName;
  }
  
}
