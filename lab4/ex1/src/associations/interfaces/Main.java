package associations.interfaces;

import associations.interfaces.functionalnterface.MyFunctionalInterface;
import associations.interfaces.implementation.MySqlImpl;
import associations.interfaces.implementation.OracleImpl;

public class Main {
    public static void main(String[] args) {
        MySqlImpl mySql = new MySqlImpl();
        OracleImpl oracle = new OracleImpl();
        mySql.connect();
        oracle.connect();

//        MyFunctionalInterface  m1 = () -> System.out.println("test");
//        m1.print();

        MyFunctionalInterface m2 = (n1, n2) -> System.out.println(n1 + n2);
        m2.sum(2,3);

    }
}
