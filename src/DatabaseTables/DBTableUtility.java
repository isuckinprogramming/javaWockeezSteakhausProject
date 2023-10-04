package DatabaseTables;

import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import GUI.TableDisplayer1;
import SystemObjects.DatabaseInitialize;

public class DBTableUtility {
  
  public static void main(String[] args) throws Exception {
    testViewingAllTableData();
  }
  
  private static void testViewingAllTableData() {

    DatabaseInitialize.createConnectionToServer();
    DatabaseInitialize.createProjectDatabaseInsideServer();
    DatabaseInitialize.executeMySQLQueryInProjectDatabase("use " + DatabaseInitialize.getProjectDatabaseName());

    String start = "SELECT * FROM ";
    ResultSet reservationSet = DatabaseInitialize.executeMySQLQueryForResultSet(start + Reservations.tableName);
    ResultSet customerSet = DatabaseInitialize.executeMySQLQueryForResultSet(start + Customer.tableName);
    ResultSet employeeSet = DatabaseInitialize.executeMySQLQueryForResultSet(start + Employees.tableName);
    ResultSet customerServiceSet = DatabaseInitialize.executeMySQLQueryForResultSet(start + CustomerService.tableName);
    ResultSet roomSet = DatabaseInitialize.executeMySQLQueryForResultSet(start + Rooms.tableName);

    ResultSet[] setOfAllData = { reservationSet, customerSet, customerServiceSet, roomSet, employeeSet };

    // TableDisplayer1 testingNewTableDisplayer = new TableDisplayer1(buildTableModel(testSet));
    // for (ResultSet dataSet : setOfAllData) {
    //   displayResultSetDataToJFrame(dataSet);
    // }
  }
  
  public static void displayAllDataFromTable( String tablename ) {
    
    ResultSet resultSet = DatabaseInitialize.executeMySQLQueryForResultSet("SELECT * FROM " + tablename);
    displayResultSetDataToJFrame(resultSet, tablename);
  }

  private static TableDisplayer1 dataDisplayerTest;
  public static void displayResultSetDataToJFrame( ResultSet rs, String jframeTitle ) {
    
    try {
      // TableDisplayer1 table = new TableDisplayer1(buildTableModel(rs));
      // dataDisplayerTest = new TableDisplayer1(buildTableModel(rs));
      // dataDisplayerTest.setTitle(jframeTitle);
      EventQueue.invokeLater(
          () -> {
            TableDisplayer1 frame;
            try {
              frame = new TableDisplayer1(buildTableModel(rs));
            frame.setTitle(jframeTitle);
            frame.setVisible(true);
            } catch (SQLException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
            }

          } );
      // table.setTitle(jframeTitle);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }  
  }


  public static DefaultTableModel buildTableModel(ResultSet rs)
      throws SQLException {

    ResultSetMetaData metaData = rs.getMetaData();

    // names of columns
    Vector<String> columnNames = new Vector<String>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
      columnNames.add(metaData.getColumnName(column));
    }

    // data of the table
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    while (rs.next()) {
      Vector<Object> vector = new Vector<Object>();
      for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
        vector.add(rs.getObject(columnIndex));
      }
      data.add(vector);
    }
    DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);

    return tableModel;
  }
}
