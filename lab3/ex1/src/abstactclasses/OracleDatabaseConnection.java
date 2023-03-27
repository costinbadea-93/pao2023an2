package abstactclasses;

public class OracleDatabaseConnection extends DBConnection {

    @Override
    public void connectToDb() {
        System.out.println("Connecting via oracle!!!");
    }
}
