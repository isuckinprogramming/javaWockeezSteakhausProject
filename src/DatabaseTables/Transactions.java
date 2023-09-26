package DatabaseTables;

import java.sql.Connection;

import DatabaseObjectTemplates.DBEntity;

public class Transactions implements DBEntity {

    @Override
    public String getStringSQLQuery() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getStringSQLQuery'");
        return "CREATE TABLE Transactions (\r\n" + //
                "  Transac_id INT AUTO_INCREMENT Primary Key, \r\n" + //
                "  CustomerID INT , \r\n" + //
                "  OrderDateTime DATETIME NOT NULL, \r\n" + //
                "  TableNumber INT NOT NULL ,\r\n" + //
                "  TotalAmount INT NOT NULL , \r\n" + //
                "  OrderId INT NOT NULL, \r\n" + //
                "  Handler INT NOT NULL,\r\n" + //
                "  FOREIGN KEY(CustomerID) REFERENCES Customers( CustomerID ),\r\n" + //
                "  FOREIGN KEY(OrderId) REFERENCES Orders(OrderId),\r\n" + //
                "  FOREIGN KEY(Handler) REFERENCES Employees(EmployeeID)\r\n" + //
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
