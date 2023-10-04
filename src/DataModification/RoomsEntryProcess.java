package DataModification;

import DatabaseTables.CustomerService;
import DatabaseTables.Rooms;
import SystemObjects.DatabaseInitialize;

public class RoomsEntryProcess {

  public RoomsEntryProcess(
      int roomid,
      boolean isavailable

  ) {

    this.roomid = roomid;
    this.isavailable = isavailable;
  }

  int roomid;
  boolean isavailable;

  public static void main(String[] args) {

    RoomsEntryProcess test = new RoomsEntryProcess(
        6969, true);

    test.testingInputDataToRoomsTable();
  }

  protected void testingInputDataToRoomsTable() {

    DatabaseInitialize.DatabaseStart();
    DatabaseInitialize.executeMySQLQueryInProjectDatabase(getDataInsertionQuery());
  }

  public String getAllConcatenatedRoomsDetails() {

    return " ( " +
        roomid + " ,  " +
        isavailable + " ) ";
  }

  public String getDataInsertionQuery() {
    return "INSERT INTO " + Rooms.tableName +
        getAllConcatenationOfColumns() +
        " VALUES " + getAllConcatenatedRoomsDetails();
  }

  public String getAllConcatenationOfColumns() {
    return " ( " +
        Rooms.roomIdColumn + " , " +
        Rooms.availableColumn + " ) ";
  }

}
