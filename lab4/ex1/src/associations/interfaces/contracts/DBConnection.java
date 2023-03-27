package associations.interfaces.contracts;

public interface DBConnection {

    void connect();

    static void m1(){
        System.out.println("Static method");
    }

    default void m2() {
        System.out.println("default method");
    }
}
