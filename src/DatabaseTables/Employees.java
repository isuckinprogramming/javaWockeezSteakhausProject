package DatabaseTables;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import javax.swing.JOptionPane;

import DatabaseObjectTemplates.DBEntity;
import SystemObjects.DatabaseInitialize;


public class Employees implements DBEntity {

    public static final String tableName = "employees";

    // column names
    // all lower characters because mysql converts them into lower characters
   
    public static final String
        // primary key
        employeeidColumn = "employeeid",
        
        firstnameColumn = "firstname",
        lastnameColumn = "lastname",
        
        positionColumn = "position",
        contactNumberColumn = "contact_num",
        
        passwordColumn = "password",
        
        // flags
        isEmployedCurrentlyColumn = "isemployedcurrently",
        isAdminAuthorityLevel = "isadminauthoritylevel";

    public static final int NUMBER_OF_COLUMNS = 8;
    

    /***
     * 
     * Returns a MySQL query in String form to be executed to create the table. 
     * <br></br>
     * From the DBEntity interface. 
     * 
     * @return String representation of the MySQL query to create the table.
     * 
     * */ 
    @Override
    public String getStringSQLQuery() {
        return 
        "CREATE TABLE " + tableName + "(\r\n" + //
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

    public Object[] registerAdminUser( 
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

        if (!result) {
            // should remove failed inserted data
            removeEmployeeFromRecords(generatedId);
        }

        return new Object[] {
            result,
            generatedId
        };
    }
    
    /**
     * Executes multiple MySQL queries inside the database. Returns 
     * a boolean varible to represent if there 
     * 
     * @param allQueries An Array of MySQL Strings to be executed by batch. 
     * @return false if a single query causes an exception. 
    */ 
    private boolean tableQueryExecutor(String[] allQueries) {

        boolean isQueryExecutionValid = true;

        for (String employeeEntryQuery : allQueries) {

            try {

                isQueryExecutionValid = DatabaseInitialize.executeMySQLQueryInProjectDatabase(employeeEntryQuery);

            } catch (Exception e) {

                e.printStackTrace();
                return false;
            }
        }
        return isQueryExecutionValid;
    }

    /***
     * Translates the EmployeePosition Enum into a number that can be used to input an appropriate enum 
     * in the Employees table.
     * @param position An instance of the EmployeePosition to indicate job position of the Employee
     * @return Number that represents the Enum position inside the Employees table
    */ 
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
    
    /***
     * Creates an entry into the Employees table for an Employee without Admin authority.
     *  <br></br>
     * The method should be used when there are no admin employee inside the Employees
     * table because only admin employee can add other employees.
     * @param firstName First name of the Employee
     * @param lastName Last name of the Employee
     * @param password Password of the Employee, to be used when Employee logs in again.
     * @param contactNumber Contact number of the employee
     * @param position Job position of the Employee 
     * @return true if the operation is succesful, and false if there are problems in the code or the parameters. 
    */ 
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

        if (result) {
            JOptionPane.showMessageDialog(
            null,
            "Employee is successfully registered! Your id is " + generatedId,
            "SUCCESSFUL EMPLOYEE REGISTRATION",
            JOptionPane.INFORMATION_MESSAGE
        );
        }

        return result;
    }


    // ---------------------------------
    // ------READ FUCNTIONS-------------
    // ---------------------------------
    // Read functions will be added later depending on the use case
    // requirements of the program.

    public boolean checkForRegisteredAdmin() {
    
        try {
            String mysqlQuery = 
            "SELECT "+ employeeidColumn +" FROM " + getTableName() +
            " WHERE " + isAdminAuthorityLevel + " = 1 AND " + isEmployedCurrentlyColumn + " = 1"; 

            ResultSet setOfAdminEmployees = DatabaseInitialize.executeMySQLQueryForResultSet(mysqlQuery);
            
            if( setOfAdminEmployees.next() ){
                return true;
            }
            return false;
        } catch (Exception e) {
    
            e.printStackTrace();
            return false; 
        }
    }


    /**
     * Retrieves first and last names from the Employees table.
     * 
     * @return ResultSet with FirstName and LastName of Employees from DB table
    */ 
    public ResultSet getNamesOfWorkingEmployees() {
        String getAllNamesOfEmployees = "SELECT " + firstnameColumn +
                ", " + lastnameColumn +
                " FROM " + getTableName() +
                " WHERE " + isEmployedCurrentlyColumn + " = true";

        return DatabaseInitialize.executeMySQLQueryForResultSet(getAllNamesOfEmployees);
    }


    /***
     * Retrieves data from the Employees table that is related to the Employee id.
     * 
     * @param employeeid ID of the Employee 
     * @param columnname Name of the Column to Retrieve data from 
     * @return The data from the column which the employeeid corresponds
    */ 
    public String getEmployeeData(int employeeid, String columnname) {

        String result = "";

        try {

            String mysqlQuery = " SELECT " + columnname + " FROM " + getTableName() + getWhereCondition(employeeid);
            ResultSet resultSetFromQuery = DatabaseInitialize.executeMySQLQueryForResultSet(mysqlQuery);

            result = resultSetFromQuery.getString(columnname);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return result;
    }


    /***
     * Returns all data from a column inside the table.
     * 
     * @param columnname Name of the Column from which data will be retrieved from.
     * @return ResultSet containing all data from the Column.
    */ 
    public ResultSet getAllDataFromEmployees(String columnname) {

        try {

            String mysqlQuery = " SELECT " + columnname + " FROM " + getTableName();
            ResultSet result = DatabaseInitialize.executeMySQLQueryForResultSet(mysqlQuery);

            return result;

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }

    }
    
    /***
     * 
     * Retrieves data from the table, uses the Employee ID to identify 
     * which row to Retrieve and Return as a ResultSet.
     * 
     * @param employeeid Employee ID that will be used to identify which row to retrieve data from.
     * @return ResultSet associated with a Single Row that Corresponds with Employee ID. 
    */ 
    public ResultSet getAllDataOfEmployee(int employeeid) {

        String mysqlQuery = " SELECT * FROM " + getTableName() + getWhereCondition(employeeid);

        try {

            ResultSet result = DatabaseInitialize.executeMySQLQueryForResultSet(mysqlQuery);
            return result;

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }

    }

    /***
     * Checks if an Employee ID is flagged as working or not, returns 
     * a representative boolean variable. 
     * @param employeeid Employee Id to be used as an Identifier.
     * @return True if Employee ID is flagged as Working , false if Flagged as non-working.
    */ 
    public boolean isEmployeeWorking(int employeeid) {

        String mysqlQuery = "SELECT " + isEmployedCurrentlyColumn +
                " FROM " + getTableName() +
                getWhereCondition(employeeid);

        try {

            ResultSet result = DatabaseInitialize.executeMySQLQueryForResultSet(mysqlQuery);

            if (result.next()) {

                String data = result.getString(1);
                System.out.println("\ndata from result " + data);

                return (data.equals("1")) ? true : false;
            }
            return false;

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    /***
     * Checks if an Employee is Non-Working. Reverses the result from checking if an employee is working
     * @param employeeid Employee ID of Non-Working Employee
     * @return True if Employee is not working else returns false.
    */
    public boolean isEmployeeNonWorking(int employeeid) {
        return ! isEmployeeWorking(employeeid);
    }

    /***
     * Verifies if Employee is registered inside the Employees table 
     * by matching the Employee id and password. 
     * 
     * @return Object[] if the provided Employee Id and password has a match inside the employee table.
     * <br></br> 
     * The first of the objects is a boolean variable representing the resulf of matching the employee id 
     * and the password inside the Employees table.
     * <br></br>
     * The second of the objects is a ResultSet variable representing the data of the employee
     * that is found inside the table.
     * 
    */ 
    public Object[] verifyEmployeeIdAndPassword(int employeeid, String password) {

        String mysqlQuery = 
            "SELECT * FROM " + getTableName() +
            " WHERE " +
                employeeidColumn+ " = " + employeeid + " AND " +
                passwordColumn + "= \"" + password + "\" AND " +
                isEmployedCurrentlyColumn + " = 1 ";
        
        try {

            ResultSet matchSetInEmployeesTable = DatabaseInitialize.executeMySQLQueryForResultSet(mysqlQuery);
            if (matchSetInEmployeesTable.next()) {
            
                /*
                redundant code - NOT NEEDED ANYMORE, HERE FOR REFERENCE
                System.out.println( "Employee Registered : " + employeeid + " with password " + password + " \nEmployee data: ");
                for (int index = 1; index < numberOfColumns; index++) {
                    System.out.print( matchSetInEmployeesTable.getString(index) + "  ");
                }
                */

                return new Object[]{ true, matchSetInEmployeesTable  } ;
            }
        return new Object[] { false, null };
            
        } catch(SQLException e) {
            e.printStackTrace();
            return new Object[]{ false,null  };
        }
        
    }

    // ---------------------------------
    // ------UPDATE FUCNTIONS--------
    // ---------------------------------

    public void addAdminUser() {

    }


    /***
     * Flag an employee into WORKING STATE. The employee id is
     * used to identify which Employee will be flagged as Working.
     * 
     * @return True if the operation is successful and False if problems 
     * occurs during process.
     * */
    public boolean turnEmployeeIntoWorking(int employeeid) {

        try {

            DatabaseInitialize.executeMySQLQueryInProjectDatabase(
                    getIsEmployeeWorkingUpdateQuery(employeeid, true));

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;

    }

    /***
     * Flagged a registered employee as Non-Working. Essentially fired or 
     * temporarily removed from service. 
     * <br></br>
     * Internally, method sets the Working and Authority of the employee to false.
     * 
     * @param employeeid ID of Employee to be Flagged as Non-Working 
     * @return True if operation proceeds without any problems. False 
     * if there are problems.
    */ 
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


//---------------------------------------------
//-------------MySQL Query functions ----------
//---------------------------------------------
// functions that return MySQL Query Strings
// since MySQL Strings are reused all over the 
// place, functions are necessary to implement reusability.

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
    private String getRemoveEmployeeEntryQuery(int employeeid) {
        return "delete from " + getTableName() + " " + getWhereCondition(employeeid);
    }
    

    /***
     * Removes an Employee in the Employees Table.  This method 
     * must only be used under circumstances where removal of employee 
     * won't cause other dependent table problems. 
     * <br></br> 
     * In cases wherein removing an employee entry because they are fired. 
     * Flagging an Employee as Non-Working should be the preffered method 
     * to prevent correlated data to be deleted.
     * <br></br>
     * To prevent the Data of employees who are removed from service
     * from ever appearing in other Queries, Filtering out 
     * the out-of-service employees should be the preffered method
     * over removing the employee entry.
     * <br></br>
     * There are columns indicating the WORKING STATUS of the 
     * employee, this column can be used to filter out the 
     * Employees removed from service.
     * <br></br>
     * @param employeeid Id of the Employee to be removed
     * @return True if operation successful else false.  
     *  
     * */ 
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
