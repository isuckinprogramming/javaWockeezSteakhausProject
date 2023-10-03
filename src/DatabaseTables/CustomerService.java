package DatabaseTables;

import DatabaseObjectTemplates.DBEntity;

public class CustomerService implements DBEntity {

  public static String 
    tableName = "customerservice",
    employeeIdColumn = "employeeid",
    customerIdColumn  = "customerid",
    reservationIdColumn = "reservationid";

  public static int NUMBER_OF_COLUMNS = 3;

  @Override
  public String getStringSQLQuery() {
    return 
      "CREATE TABLE "+tableName+"(\r\n" + //
      "  "+employeeIdColumn+" INT,\r\n" + //
      "  "+customerIdColumn+" INT,\r\n" + //
      "  "+reservationIdColumn+" INT,\r\n" + //
      "  FOREIGN KEY("+ customerIdColumn +") REFERENCES "+Customer.tableName+"("+Customer.CustomerIDColumn+"), \r\n" + //
      "  FOREIGN KEY("+ employeeIdColumn +") REFERENCES "+Employees.tableName+"("+Employees.employeeidColumn+"), \r\n" + //
      "  FOREIGN KEY("+ reservationIdColumn +") REFERENCES "+Reservations.tableName+"("+Reservations.reservationIdColumn+")\r\n" + //
      ")\r\n";
  }

  @Override
  public String getTableName() {
    return tableName;
  }
  
}
