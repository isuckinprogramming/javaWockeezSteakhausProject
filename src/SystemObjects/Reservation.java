package SystemObjects;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import DatabaseObjectTemplates.DBEntity;

public class Reservation implements DBEntity {

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
  public void CreateTable(Connection connection) {
    
    try {
      Statement statement = connection.createStatement();
      
      statement.execute( getStringSQLQuery() );
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  @Override
  public void truncateTable() {
    // NO IMPLEMENTATION YET.
  }
  
  // 
}
