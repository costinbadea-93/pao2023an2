package abstactclasses;

public abstract class DBConnection {

    public DBConnection(){}

    public abstract void connectToDb();

    public void afterDbConnection(){
        System.out.println("After database connection!!!");
    }
}
