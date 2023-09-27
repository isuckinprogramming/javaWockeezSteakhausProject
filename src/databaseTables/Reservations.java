package DatabaseTables;

import DatabaseObjectTemplates.DBEntity;

public class Reservations implements DBEntity {

  private String tableName = "Reservations";

  @Override
  public String getStringSQLQuery() {
    return "CREATE TABLE Reservations (  \r\n" + //
        "  ReservationID INT AUTO_INCREMENT Primary Key, \r\n" + //
        "  ReservationDateTime DATETIME NOT NULL, \r\n" + //
        "  PartySize INT DEFAULT 1,\r\n" + //
        "  TableNumber INT NOT NULL, \r\n" + //
        "  Status ENUM('Confirmed','Pending','Cancelled') DEFAULT 'pending'\r\n" + //
        ")";
  }

  @Override
  public String getTableName() {
    // TODO Auto-generated method stub
    return tableName;
  }
  // 
}
