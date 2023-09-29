package DatabaseTables;

import DatabaseObjectTemplates.DBEntity;

public class Employees implements DBEntity {

    private String tableName = "employees";

    @Override
    public String getStringSQLQuery() {
        return 
        "CREATE TABLE " + tableName + "(\r\n" + //
        "  EmployeeID INT AUTO_INCREMENT Primary Key,\r\n" + //
        "  FirstName  VARCHAR(25) NOT NULL, \r\n" + //
        "  LastName VARCHAR(25) NOT NULL, \r\n" + //
        "  Position \r\n" + //
        "    ENUM('undecided','Waitstaff','Chef',' Manager')\r\n" + //
        "    DEFAULT 'undecided' \r\n" + //
        "    NOT NULL, \r\n" + //
        "  contact_num INT DEFAULT -1 NOT NULL,\r\n" + //
        "  password VARCHAR(25) NOT NULL,\r\n" + //
        "  isEmployedCurrently BOOLEAN NOT NULL DEFAULT TRUE,\r\n" + //
        "  isAdminAuthorityLevel BOOLEAN NOT NULL DEFAULT FALSE\r\n" + //
        ")";
    }

    @Override
    public String getTableName() {
        return tableName;
    }
}
