package DatabaseTables;

import DatabaseObjectTemplates.DBEntity;

public class Customer implements DBEntity {

    private String tableName = "customers";
    @Override
    public String getStringSQLQuery() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getStringSQLQuery'");
        return 
        "  CREATE TABLE "+ tableName +" (\r\n" + //
        "  CustomerID INT AUTO_INCREMENT Primary Key,\r\n" + //
        "  FirstName VARCHAR(25) NOT NULL, \r\n" + //
        "  LastName VARCHAR(25) NOT NULL, \r\n" + //
        "  Email VARCHAR(70) NOT NULL ,\r\n" + //
        "  Phone INT(10) NOT NULL ,\r\n" + //
        "  ReservationID INT, \r\n" + //
        "  FOREIGN KEY (ReservationID) REFERENCES Reservations(ReservationID) \r\n" + //
        ")";
    }

    @Override
    public String getTableName() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getTableName'");
        return tableName;        
    }
    
}
