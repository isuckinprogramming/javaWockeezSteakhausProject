package DatabaseTables;

import DatabaseObjectTemplates.DBEntity;

public class Customer implements DBEntity {

    public static final String
        tableName = "customers",
        CustomerIDColumn = "customerid",
        FirstNameColumn = "firstname",
        LastNameColumn = "lastname",
        EmailColumn = "email",
        contactNumberColumn = "contactnumber",
        ReservationIDColumn = "reservationid";
    
    public static final int NUMBER_OF_COLUMNS = 6;

    @Override
    public String getStringSQLQuery() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getStringSQLQuery'");
        return 
        "  CREATE TABLE "+ tableName +" (\r\n" + //
        "  "+CustomerIDColumn+" INT AUTO_INCREMENT Primary Key,\r\n" + //
        "  "+FirstNameColumn+" VARCHAR(25) NOT NULL, \r\n" + //
        "  "+LastNameColumn+" VARCHAR(25) NOT NULL, \r\n" + //
        "  "+EmailColumn+" VARCHAR(70) NOT NULL ,\r\n" + //
        "  "+contactNumberColumn+" INT(10) NOT NULL ,\r\n" + //
        "  "+ReservationIDColumn+" INT, \r\n" + //
        "  FOREIGN KEY ("+ReservationIDColumn+") REFERENCES "+Reservations.tableName + "(" + Reservations.reservationIdColumn + ")\r\n" + //
        ")";
    }

    @Override
    public String getTableName() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getTableName'");
        return tableName;        
    }
    
}
