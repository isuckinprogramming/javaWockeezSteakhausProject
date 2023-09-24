package DatabaseObjectTemplates;

import java.sql.Connection;

/**
 * 
 *Standard interface for entity inside database.  
 * */ 
interface DBEntity {
  
  /**
   * 
   * Returns the string associated when creating a database table to 
   * represent and contain data regarding entitys. 
   * 
   * @return String represemntation of creating of SQL query to create table.
   */
  public String getStringSQLQuery();
  
  /***
   * Statement to create table of entity.
   * 
   * @param connection Connection object that is directly connected to project,
   * when overriding this method, Connection param must be used to create the 
   * table.
   * NOTE: NO NEED TO CREATE SEPARATE CONNECTION. PASS THE REFERENCE OF THE CONNECTION.
  */ 
  public void CreateTable(Connection connection);

  /**
   * Clear initial contents of table.
   * */ 
  public void truncateTable();
}
