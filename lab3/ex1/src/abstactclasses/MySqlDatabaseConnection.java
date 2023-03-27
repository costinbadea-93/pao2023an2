package abstactclasses;

public class MySqlDatabaseConnection extends DBConnection{
    @Override
    public void connectToDb() {
        System.out.println("Connecting via mysql!!!!");
    }
}
