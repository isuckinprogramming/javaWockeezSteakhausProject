package DatabaseTables;

import java.sql.Connection;

import DatabaseObjectTemplates.DBEntity;

public class Orders implements DBEntity {

    @Override
    public String getStringSQLQuery() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getStringSQLQuery'");
        return "CREATE TABLE Orders (\r\n" + //
                "  OrderId INT AUTO_INCREMENT primary key,  \r\n" + //
                "  CustomerID INT, \r\n" + //
                "  item_ID INT, \r\n" + //
                "  itemPrice INT, \r\n" + //
                "  FOREIGN KEY(CustomerID) REFERENCES Customers(CustomerID),\r\n" + //
                "  FOREIGN KEY(item_ID) REFERENCES MenuItems(item_ID)\r\n" + //
                ")";
    }

    @Override
    public void CreateTable(Connection connection) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CreateTable'");
    }

    @Override
    public void truncateTable() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'truncateTable'");
    }
    
}
