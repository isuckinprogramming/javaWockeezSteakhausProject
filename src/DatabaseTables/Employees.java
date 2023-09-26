package DatabaseTables;

import java.sql.Connection;

import DatabaseObjectTemplates.DBEntity;

public class Employees implements DBEntity {

    @Override
    public String getStringSQLQuery() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getStringSQLQuery'");
    
        return "CREATE TABLE Employees (\r\n" + //
                "  \r\n" + //
                "  EmployeeID INT AUTO_INCREMENT Primary Key,\r\n" + //
                "  FirstName  VARCHAR(25) NOT NULL, \r\n" + //
                "  LastName VARCHAR(25) NOT NULL, \r\n" + //
                "  Position \r\n" + //
                "    ENUM('undecided','Waitstaff','Chef',' Manager')\r\n" + //
                "    DEFAULT 'undecided' , \r\n" + //
                "  contact_num INT DEFAULT -1\r\n" + //
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
