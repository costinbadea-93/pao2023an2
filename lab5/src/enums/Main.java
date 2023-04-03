package enums;

public class Main {
    public static void main(String[] args) {
        System.out.println(Anotimp.VARA);
        System.out.println(Anotimp.IARNA);

        for(Anotimp anotimp : Anotimp.values()){
            System.out.println(anotimp);
            System.out.println(anotimp.getCarecteristica());
            anotimp.temperatura();
        }
    }
}
