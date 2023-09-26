package SystemObjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitializer {

    private boolean isDatabaseCreated = false;

    public static void startPreparations(){
        
        Connection conToServer = createConnectionToServer();
        try {
            String showAllDatabases = " show databases";
            Statement statement = conToServer.createStatement();
            ResultSet allDB = statement.executeQuery( showAllDatabases )


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        
    }

    private static boolean isDbInsideSet(ResultSet setOfDatabases, String dbName ) {
        
        boolean dbExist = false;
        try {
            while( setOfDatabases.next() ) {
                
                String contentInside = setOfDatabases.getString( "Databases" );

                if( contentInside.equals( dbName) ){
                    dbExist = true;
                }
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return dbExist ; 
    }


    /**
     * @return will return null if problems occur during creation of connection.
     */
    public static Connection createConnectionToServer() {

        String DBlocation ="jdbc:mysql://localhost:3306/" ; 
        String user = "root";
        String password = "";

        Connection test = null;
        try {
            test = DriverManager.getConnection(
            DBlocation ,
            user ,
            password );
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return test;
    } 

    public static void connectToDatabase() {

    }

    public ResultSet retrieveAllTables() {
        return null;
    }

    public ResultSet retrieveAllDatabases() {
        return null; 
    }

    public boolean isDatabaseCreated() {

        return false;
    }


    
}
