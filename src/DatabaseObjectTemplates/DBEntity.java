
package DatabaseObjectTemplates;

/**
 * 
 *Standard interface for entity inside database.  
 *Classes that will represent a table inside the database
 * */ 
public interface DBEntity {
  
  /**
   * 
   * Returns the string associated when creating a database table to 
   * represent and contain data regarding entitys. 
   * 
   * @return String represemntation of creating of SQL query to create table.
   */
  public String getStringSQLQuery();
  
  /***
   * 
   * @return tableName string that represents the name of the table this class represents.
  */ 
  public String getTableName();
}
