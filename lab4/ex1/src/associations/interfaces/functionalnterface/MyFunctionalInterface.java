package associations.interfaces.functionalnterface;

@FunctionalInterface
public interface MyFunctionalInterface {
//    void print();

    void sum(int n1, int n2);

    default void m2(){
    }

    static void m3(){

    }
}
