package associations.interfaces.implementation;

import associations.interfaces.contracts.DBConnection;

public class OracleImpl implements DBConnection {
    @Override
    public void connect() {
        System.out.println("connect with oracle");
    }
}
