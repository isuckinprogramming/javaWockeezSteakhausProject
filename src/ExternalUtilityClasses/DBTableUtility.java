package ExternalUtilityClasses;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.crypto.Data;

import DatabaseTables.Reservations;
import SystemObjects.DatabaseInitialize;

public class DBTableUtility {
  
  public static void main(String[] args) throws Exception {


    DatabaseInitialize.createConnectionToServer();
    DatabaseInitialize.createProjectDatabaseInsideServer();
    DatabaseInitialize.executeMySQLQueryInProjectDatabase("use " + DatabaseInitialize.getProjectDatabaseName());
    ResultSet testSet = DatabaseInitialize.executeMySQLQueryForResultSet("SELECT * FROM " +Reservations.tableName);
    testingMethod(testSet);
  }

  public static void testingMethod( ResultSet rs ) {
    // The Connection is obtained

    // It creates and displays the table


    JTable table;
    try {
      table = new JTable(buildTableModel(rs));

      // int numOfColumn = table.getColumnCount(); 
      // for (int index = 0; index < numOfColumn; index++) {
      //   table.getColumnModel().getColumn(index).setMinWidth(250);
      // }
      
      // dont let user set details for tables when viewing data
      table.setEnabled(false);

      // Closes the Connection

      
      // JScrollPane scrollpane = new JScrollPane(table);
      // JFrame resultFrame = new JFrame();
      // resultFrame.setSize(1000, 1000  );
      // resultFrame.setContentPane(scrollpane);
      // resultFrame.setVisible(true);
      
      JOptionPane.showMessageDialog(null, new JScrollPane(table));
    } catch (SQLException e) {
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
