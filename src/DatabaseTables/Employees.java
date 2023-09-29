package DatabaseTables;

import java.sql.ResultSet;
import java.util.Random;

import DatabaseObjectTemplates.DBEntity;
import SystemObjects.DatabaseInitialize;


public class Employees implements DBEntity {

    private String tableName = "employees";

    // column names
    // all lower characters because mysql converts them into lower characters
    public final String
    employeeidColumn = "employeeid",
    firstnameColumn = "firstname",
    lastnameColumn = "lastname",
    positionColumn = "position",
    contactNumberColumn= "contact_num",
    passwordColumn = "password",
    isEmployedCurrentlyColumn = "isemployedcurrently",
    isAdminAuthorityLevel ="isadminauthoritylevel"; 

    @Override
    public String getStringSQLQuery() {
        return "CREATE TABLE " + tableName + "(\r\n" + //
                "  " + employeeidColumn + " INT AUTO_INCREMENT Primary Key,\r\n" + //
                "  " + firstnameColumn + "  VARCHAR(25) NOT NULL DEFAULT 'to be updated', \r\n" + //
                "  " + lastnameColumn + " VARCHAR(25) NOT NULL DEFAULT 'to be updated', \r\n" + //
                "  " + positionColumn + " \r\n" + //
                "    ENUM('UNVERIFIED','MANAGER','ACCOUNTANT','CLERK','SECURITY_STAFF','ROOM_KEEPER')\r\n" + //
                "    DEFAULT 'UNVERIFIED' \r\n" + //
                "    NOT NULL, \r\n" + //
                "  " + contactNumberColumn + " INT DEFAULT -1 NOT NULL,\r\n" + //
                "  " + passwordColumn +" VARCHAR(25) NOT NULL DEFAULT 'to be updated',\r\n" + //
                "  " + isEmployedCurrentlyColumn + " BOOLEAN NOT NULL DEFAULT TRUE,\r\n" + //
                "  " + isAdminAuthorityLevel +" BOOLEAN NOT NULL DEFAULT FALSE\r\n" + //
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
            String firstName ,
            String lastName ,
            String password , 
            int contactNumber ,
            EmployeePosition position
    ) {

        int generatedId = generateRandomEmployeeId();

        String[] allQueries = {

                // general settings when registering an employee
                getEmployeeIdInsertionQuery(generatedId),
                getFirstnameUpdateQuery(generatedId, firstName),
                getLastnameUpdateQuery(generatedId, lastName),
                getPasswordUpdateQuery(generatedId, password),
                getContactnumberUpdateQuery(generatedId, contactNumber),
                getEmployeePositionUpdateQuery(generatedId, position),

                // default settings when the user is an admin
                //isemployeeworking should be set to true by default entry
                // getIsEmployeeWorkingUpdateQuery(generatedId, true),

                getIsAdminAuthorityUpdateQuery(generatedId, true)
        };

        boolean result = tableQueryExecutor(allQueries);
        return result;
    }
    
    private boolean tableQueryExecutor(String[] allQueries) {
        
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

    private int getEmployeePositionNumber(EmployeePosition position) {
        int employePositionNumber = -1;
       
        switch (position) {
            case UNVERIFIED:
                employePositionNumber = 1;
                break;
            case MANAGER:
                employePositionNumber = 2;
                break;
            case ACCOUNTANT:
                employePositionNumber = 3;
                break;
            case CLERK:
                employePositionNumber = 4;
                break;
            case ROOM_KEEPER:
                employePositionNumber = 5;
                break;
            case SECURITY_STAFF:
                employePositionNumber = 6;
                break;
            default:
                break;
        }

        return employePositionNumber;
    }

    private int generateRandomEmployeeId() {
        return new Random().nextInt(100_000);
    }

    public void turnEmployeeIntoAdmin(int employeeid) {
        
    
    }
    
    public boolean registerEmployee(
            String firstName ,
            String lastName ,
            String password , 
            int contactNumber ,
            EmployeePosition position
    ) {

        int generatedId = generateRandomEmployeeId();

        String[] allQueries = {

                // general settings when registering an employee
                getEmployeeIdInsertionQuery(generatedId),
                getFirstnameUpdateQuery(generatedId, firstName),
                getLastnameUpdateQuery(generatedId, lastName),
                getPasswordUpdateQuery(generatedId, password),
                getContactnumberUpdateQuery(generatedId, contactNumber),
                getEmployeePositionUpdateQuery(generatedId, position),

                // default settings when the user is an employee
                // isemployeeworking is set to 
                // getIsEmployeeWorkingUpdateQuery(generatedId, true)

                // database table by default should fill isadminauthoritylevel with false
                // getIsAdminAuthorityUpdateQuery(generatedId, false)
        };

        boolean result = tableQueryExecutor(allQueries);
        return result;
    }


    // ---------------------------------
    // ------READ FUCNTIONS--------
    // ---------------------------------

    public ResultSet getNamesOfWorkingEmployees() {
        String getAllNamesOfEmployees = 
        "SELECT " + firstnameColumn +
        ", " + lastnameColumn +
        " FROM " + getTableName() + 
        " WHERE " + isEmployedCurrentlyColumn + " = true";
        
        return DatabaseInitialize.executeMySQLQueryForResultSet(getAllNamesOfEmployees);
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

    public boolean turnEmployeeIntoWorking(int employeeid) {
        
        try {

            DatabaseInitialize.executeMySQLQueryInProjectDatabase(
                getIsEmployeeWorkingUpdateQuery(employeeid, true)
            );

        } catch (Exception e ) {
            e.printStackTrace();
            return false;
        }
        
        return true;


    }

    public boolean turnEmployeeIntoNotWorking(int employeeid) {
        
        
        try {

            String[] notWorkingUpdateQueries = {
                getIsAdminAuthorityUpdateQuery( employeeid ,false),
                getIsEmployeeWorkingUpdateQuery( employeeid ,false)
            };
            
            tableQueryExecutor(notWorkingUpdateQueries);

        } catch (Exception e ) {
            e.printStackTrace();
            return false;
        }
        
        return true;
    }


    private String getEmployeeIdInsertionQuery(int generatedId) {
        return "INSERT INTO " + getTableName() + "(employeeid) VALUES ( " + generatedId + " )";
    }
    
    private String getUpdateStatementStart() {
        return "update " + getTableName() + " ";
    }

    private String  getWhereCondition(int employeeid ) {
        return " WHERE employeeid = " + employeeid+ " ";
    }

    private String getFirstnameUpdateQuery(int employeeid, String firstname) {
        return getUpdateStatementStart() +  " set firstname = \"" + firstname + "\" " + getWhereCondition(employeeid);
    }


    private String getLastnameUpdateQuery(int employeeid, String lastname) {
        return getUpdateStatementStart() +  " set lastname = \"" + lastname + "\" " + getWhereCondition(employeeid);
    }


    private String getPasswordUpdateQuery(int employeeid, String password) {
        return getUpdateStatementStart() +  " set password = \"" + password + "\" " + getWhereCondition(employeeid);
    }

    private String getContactnumberUpdateQuery(int employeeid, int contactnumber) {
        return getUpdateStatementStart() +  " set contact_num = " + contactnumber + " " + getWhereCondition(employeeid);
    }
    
    private String getIsAdminAuthorityUpdateQuery(int employeeid,boolean validity) {
        return getUpdateStatementStart() +  " set isadminauthoritylevel = " + validity + " " + getWhereCondition(employeeid);
    }

    private String getIsEmployeeWorkingUpdateQuery(int employeeid,boolean validity) {
        return getUpdateStatementStart() +  " set isemployedcurrently = " + validity + " " + getWhereCondition(employeeid);
    }

    private String getEmployeePositionUpdateQuery(int employeeid,EmployeePosition position) {
        return getUpdateStatementStart() +  " set position = " + getEmployeePositionNumber( position ) + " " + getWhereCondition(employeeid);
    }

    // ---------------------------------
    // ------DELETION FUCNTIONS--------
    // ---------------------------------

    public void clearAllEmployeeData() {
        // I don't think this function should exist.
    }

    /**
     * Creates a MySQL query for deleting a row(Employee or Employee Entry) associated with an Employeeid value.
     * @param employeeid The id of the employee
     * @return
    */ 
    public String getRemoveEmployeeEntryQuery(int employeeid) {
        return "delete from " + getTableName() + " " + getWhereCondition(employeeid);
    }
    
    public boolean removeEmployeeFromRecords(int employeeid) {
        
        try {
            DatabaseInitialize.executeMySQLQueryInProjectDatabase(
                getRemoveEmployeeEntryQuery(employeeid)
            );

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


}
