package DatabaseTables;

import java.sql.ResultSet;
import java.util.GregorianCalendar;
import java.util.Random;

import DatabaseObjectTemplates.DBEntity;
import SystemObjects.DatabaseInitialize;


public class Employees implements DBEntity {

    private String tableName = "employees";

    @Override
    public String getStringSQLQuery() {
        return "CREATE TABLE " + tableName + "(\r\n" + //
                "  EmployeeID INT AUTO_INCREMENT Primary Key,\r\n" + //
                "  FirstName  VARCHAR(25) NOT NULL DEFAULT 'to be updated', \r\n" + //
                "  LastName VARCHAR(25) NOT NULL DEFAULT 'to be updated', \r\n" + //
                "  Position \r\n" + //
                "    ENUM('UNVERIFIED','MANAGER','ACCOUNTANT','CLERK','SECURITY_STAFF','ROOM_KEEPER')\r\n" + //
                "    DEFAULT 'UNVERIFIED' \r\n" + //
                "    NOT NULL, \r\n" + //
                "  contact_num INT DEFAULT -1 NOT NULL,\r\n" + //
                "  password VARCHAR(25) NOT NULL DEFAULT 'to be updated',\r\n" + //
                "  isEmployedCurrently BOOLEAN NOT NULL DEFAULT TRUE,\r\n" + //
                "  isAdminAuthorityLevel BOOLEAN NOT NULL DEFAULT FALSE\r\n" + //
                ")";
    }

    @Override
    public String getTableName() {
        return tableName;
    }

    // ---------------------------------
    // ------CREATION FUCNTIONS--------
    // ---------------------------------

    public boolean registerAdminUser( 
            String userName , 
            String password , 
            String firstName ,
            String lastName , 
            int contactNumber ,
            EmployeePosition position
    ) {

        int generatedId = generateRandomEmployeeId();

        // insert first entry into table, the employeeid will be used to referenced the current entry.
        String employeeIdInsertionEntry = "INSERT INTO " + getTableName() + "(employeeid) VALUES ( " + generatedId + " )";

        String updateStatementStart = "update " + getTableName() + " ";
        String whereCondition = "WHERE employeeid = " + generatedId;

        // update MySQL statement to update the row where employeeid is inserted.
        String firstnameEntry = updateStatementStart + " set firstname = \"" + firstName + "\" " + whereCondition;
        String lastnameEntry = updateStatementStart + " set lastname = \"" + lastName + "\" " + whereCondition;
        String contact_numEntry = updateStatementStart + " set contact_num = \"" + contactNumber + "\" " + whereCondition;
        String passwordEntry = updateStatementStart + " set password = \"" + password + "\" " + whereCondition;

        // default conditions when the user is the first employee to be registered
        String isemployedcurrentlyEntry = 
            updateStatementStart +
            " set isemployedcurrently = " + true + " "
            + whereCondition;

        String isadminauthorityEntry = 
            updateStatementStart +
            " set isadminauthoritylevel = " + true + " "
            + whereCondition;


        int positionNumber = 0;
        switch (position) {
            case UNVERIFIED:
                positionNumber = 1;
                break;
            case MANAGER : positionNumber = 2;
                break;
            case ACCOUNTANT:
                positionNumber = 3;
                break;
            case CLERK: positionNumber = 4;
                break;
            case ROOM_KEEPER:
                positionNumber = 5;
                break;
            case SECURITY_STAFF:
                positionNumber = 6;
                break;
            default:
                break;
        }
        

        String positionEntry = 
            updateStatementStart +
            " set position = " + positionNumber + " "
            + whereCondition;
                

        String[] allQueries = {
                employeeIdInsertionEntry,
                firstnameEntry,
                lastnameEntry,
                contact_numEntry,
                passwordEntry,
                isemployedcurrentlyEntry,
                isadminauthorityEntry,
                positionEntry
        };
        
        for (String employeeEntryQuery : allQueries) {

            try {
                DatabaseInitialize.executeMySQLQueryInProjectDatabase(employeeEntryQuery);
            } catch (Exception e) {

                e.printStackTrace();
                return false;
            }   
        }
        return true;
    }

    private int generateRandomEmployeeId() {
        return new Random().nextInt(100_000);
    }

    
    public void registerEmployee() {

    }

    // ---------------------------------
    // ------READ FUCNTIONS--------
    // ---------------------------------

    public ResultSet getNamesOfWorkingEmployees() {

        return null;
    }

    public ResultSet getNamesOfNonWorkingEmployees() {

        return null;
    }

    public boolean isEmployeeWorking(String employeeName) {
        return false;
    }

    public boolean isEmployeeNonWorking(String employeeName) {
        return false;
    }

    // log in function
    public boolean isUserRegisteredInsideEmployeeDatabase() {

        return false;
    }

    // ---------------------------------
    // ------UPDATE FUCNTIONS--------
    // ---------------------------------

    public void addAdminUser() {

    }

    public void setEmployeeAsNotWorking() {

    }

    public void setEmployeeAsWorking() {

    }

    // ---------------------------------
    // ------DELETION FUCNTIONS--------
    // ---------------------------------

    public void clearAllEmployeeData() {

    }

}
