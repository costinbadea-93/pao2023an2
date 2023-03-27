package abstactclasses;

public class Main {
    public static void main(String[] args) {
        MySqlDatabaseConnection mySqlDatabaseConnection = new MySqlDatabaseConnection();
        OracleDatabaseConnection oracleDatabaseConnection = new OracleDatabaseConnection();

        mySqlDatabaseConnection.connectToDb();
        oracleDatabaseConnection.connectToDb();

        DBConnection dbConnection1 = new MySqlDatabaseConnection();
        DBConnection dbConnection2 = new OracleDatabaseConnection();
    }
}
