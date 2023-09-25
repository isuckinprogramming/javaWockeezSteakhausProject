
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class App {
    public static void main(String[] args) throws Exception {

        testingOutJDBC();
        // CreateDatabaseTables();
    }

    public static void CreateDatabaseTables() {

        String createDatabase = "CREATE DATABASE javaWackiezProject";

        String useProjDatabase = "USE javaWackiezProject";

        String menuTableString = 
            "CREATE TABLE MenuItems ( \r\n" + //
            "  item_ID INT AUTO_INCREMENT NOT NULL PRIMARY KEY,\r\n" + //
            "  itemName VARCHAR(255) NOT NULL ,\r\n" + //
            "  itemDescription Varchar(255) NOT NULL,\r\n" + //
            "  itemPrice INT NOT null , \r\n" + //
            "  categories ENUM (\r\n" + //
            "    'undecided',\r\n" + //
            "    'Appetizers',\r\n" + //
            "    'Dessert',\r\n" + //
            "    'HeavyDish',\r\n" + //
            "    'LightDish',\r\n" + //
            "    'NonAlcoholicDrinks',\r\n" + //
            "    'AlcoholicDrinks'    \r\n" + //
            "  ) NOT NULL DEFAULT 'undecided'\r\n" + //
            ")";

        String reservationsTableQuery =
            "CREATE TABLE Reservations (  \r\n" + //
            "  ReservationID INT AUTO_INCREMENT Primary Key, \r\n" + //
            "  ReservationDateTime DATETIME NOT NULL, \r\n" + //
            "  PartySize INT DEFAULT 1,\r\n" + //
            "  TableNumber INT NOT NULL, \r\n" + //
            "  Status ENUM('Confirmed','Pending','Cancelled') DEFAULT 'pending'\r\n" + //
            ");\r\n" + //
                        "";
        
        String customersTableQuery = "";
        
        String transactionsTableQuery = "";


        try {

            Connection mainDb = CreateConnectionToDatabaseWithRoot();
            Statement mysqlQueryRunner = mainDb.createStatement();

            mysqlQueryRunner.execute(createDatabase);
            mysqlQueryRunner.execute(useProjDatabase);
            mysqlQueryRunner.execute(menuTableString);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 
     * Creates a connection object that is connected to the root folder inside the 
     * root user account that has no password required. 
     * 
    */
    public static Connection CreateConnectionToDatabaseWithRoot() throws Exception {

        String DBlocation ="jdbc:mysql://localhost:3306/" ; 
        String user = "root";
        String password = "";

        Connection test = DriverManager.getConnection(
            DBlocation ,
            user ,
            password );

        return test;
    }


    /**
     *  function for testing out the JDBC Driver 
     * 
     * */
    public static void testingOutJDBC() throws Exception {

        System.out.println("Hello, World!");

        // Driver registration.

        // Class.forName("com.mysql.jdbc.Driver");

        String dbMainLocation = "jdbc://localhost:3306/"; // incorrect url
        String user = "root";
        String passW = "";

        Connection test = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/", // correct url
                "root",
                "");

        // url format : jdbc:mysql//{host}:{port}/{dbName} OR {none if root}
        // test.getMetaData()

        System.out.println("code runs properly.");
        Statement statementTest = test.createStatement();

        String createTestDBString = "CREATE DATABASE jdbcTestDB";
        String sqlQuery = "SELECT * FROM testTable ";
        String createTestTable = "CREATE TABLE IF NOT EXIST testTable ( numbers INT)";
        String useTestDB = "USE jdbcTestDB";
        String insertDataToTestTable = "INSERT INTO testTable VALUES (1),(2),(3),(4)";
        String showDatabasesInsideUser = "show databases";

        statementTest.execute(createTestDBString);
        statementTest.execute(useTestDB);
        statementTest.execute( createTestTable );
        statementTest.execute( insertDataToTestTable );
    
        ResultSet data = statementTest.executeQuery(sqlQuery);

        while (data.next()) {
            System.out.println(
                    data.getString("numbers"));
        }

        ResultSet nameOfAllDatabases = statementTest.executeQuery(showDatabasesInsideUser);
        while (nameOfAllDatabases.next()) {
            System.out.println(
                    nameOfAllDatabases.getString("Database"));
        }

        nameOfAllDatabases.close();
    }

}
