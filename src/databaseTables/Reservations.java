package DatabaseTables;

import DatabaseObjectTemplates.DBEntity;

public class Reservations implements DBEntity {

  public static final String 
    tableName = "reservations",
    reservationIdColumn = "ReservationID",
    startColumn = "starting time",
    endColumn = "ending time",
    partySizeColumn = "PartySize",
    roomIdColumn = "roomId",
    statusColumn = "status";

  public static final int
    RESERVATION_CONFIRMED = 1,
    RESERVATION_PENDING = 2,
    RESERVATION_CANCELLED = 3;
  
  public static final int NUMBER_OF_COLUMNS = 6;
  


  @Override
  public String getStringSQLQuery() {
    return "CREATE TABLE " + tableName + " (  \r\n" + //
        "  " +reservationIdColumn+" INT AUTO_INCREMENT Primary Key, \r\n" + //
        "  " + startColumn + " DATETIME NOT NULL, \r\n" + //
        "  " + endColumn+ " DATETIME NOT NULL, \r\n" + //
        "  " +partySizeColumn+" INT DEFAULT 1 NOT NULL,\r\n" + //
        "  " +roomIdColumn+" INT NOT NULL, \r\n" + //
        "  " +statusColumn+" ENUM('Confirmed','Pending','Cancelled') DEFAULT 'pending'\r\n" + //
        ")";
  }

  @Override
  public String getTableName() {
    // TODO Auto-generated method stub
    return tableName;
  }
  // 
}
