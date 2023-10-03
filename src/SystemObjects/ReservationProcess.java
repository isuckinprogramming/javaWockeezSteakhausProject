package SystemObjects;

import DatabaseTables.Reservations;

public class ReservationProcess {


  public ReservationProcess(
    int reservId,
    String startTime,
    String endTime,
    int partySize,
      int roomIdColumn) {

    this.reservId = reservId;
    this.startTime = startTime;
    this.endTime = endTime;
    this.partySize = partySize;
    this.roomIdColumn = roomIdColumn;
  }

  
  int reservId;
  String startTime;
  String endTime;
  int partySize;
  int roomIdColumn;


  public static void main(String[] args) {
    
    ReservationProcess test = new ReservationProcess(
      454444,
      "2023-02-01 04:20:00",
      "2023-02-02 04:20:00",
      69,
      69
    );

    test.testingInputDataToReservation();
  }

  private void testingInputDataToReservation() {

    DatabaseInitialize.createConnectionToServer();
    DatabaseInitialize.executeMySQLQueryInProjectDatabase("use " + DatabaseInitialize.getProjectDatabaseName());
    DatabaseInitialize.executeMySQLQueryInProjectDatabase(getDataInsertionQuery());
    
  }

  private static String testAllReservationDetails() {

    String startTime = "\"2023-12-01 13:33:00\"";
    String endTime = "\"2023-12-02 02:00:00\"";
    int partySize = 69;
    int roomIdColumn = 69;
    return startTime + " , " + endTime + " , " + partySize + " , " + roomIdColumn;

  }
  
  public String getAllConcatenatedReservationDetails() {
  
    return " ( "+reservId + " , \""+ startTime + "\" , \"" + endTime + "\" , " + partySize + " , " + roomIdColumn + " ) ";
  }

  public String getDataInsertionQuery() {

    return "INSERT INTO " + Reservations.tableName +  getAllConcatenationOfColumns() + " VALUES " + getAllConcatenatedReservationDetails();
  }
  
  public String getAllConcatenationOfColumns() {
    return
      " ( " +
      Reservations.reservationIdColumn + " , " +
      Reservations.startColumn + " , " +
      Reservations.endColumn + " , " +
      Reservations.partySizeColumn + " , " +
      Reservations.roomIdColumn + " ) ";
  }
}
