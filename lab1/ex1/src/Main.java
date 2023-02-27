import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Salutare!!!!");
//        /**
//         * primitive types:
//         * -int
//         * -short
//         * -long
//         * -byte
//         * -double
//         * -boolean
//         * -float
//         * -char
//         */
            int intValue = 3;
            System.out.println(intValue);
            short shortValue = 4;
            System.out.println(shortValue);
            long longValue = 5;//5L
            System.out.println(longValue);
            byte byteValue = 4;
            System.out.println(byteValue);
            double doubleValue = 4.5;   //4.5d
            System.out.println(doubleValue);
            float floatValue =  5.5f; //specific
            System.out.println(floatValue);
            boolean booleanValue = false;
            System.out.println(booleanValue);
            char charValue = 'A';
            System.out.println(charValue);

//
//        /**
//         * Wrapper classes
//         * int -> Integer
//         * short -> Short
//         * long -> Long
//         * byte -> Byte
//         * double -> Double
//         * float -> Float
//         * boolean -> Boolean
//         * char -> Character
//         */
//
//        Integer integerValue =  5;
//        Integer integerValue2 = 6;
//        int result = integerValue.compareTo(integerValue2);
//        System.out.println(result);
//
//        Short shortValue2 = 6;
//        Long longValue2 = 5L;
//        Byte byteValue2 = 6;
//        Double doubleValue2 = 5.6d; //D;
//        Float floatValue2 = 8.9F; // f;
//        Boolean booleanValue2= true;
//        Character characterValue = 'C';

        String stringValue = "hello world"; // Clasa string imutabila, vom discuta mai multe despre ea mai tarziu :))
        System.out.println(stringValue);
//
//        /**
//         * transformarea din primitive in wrapper class = boxing
//         * tranformarea din wrapper class in clasa primitiva = unboxing
//         */
//             int a = 5;
//             Integer b = a;
//
//             Integer c = 6;
//             int d = c;
//
//        /**
//         * instructiuni de control
//         */
        char c = 'a';

//        while(c <= 'z') {
//            System.out.println(c);
//            c++;
//        }
//
//        do{
//            System.out.println(c);
//            c++;
//        } while (c <= 'z');
//
        switch (c){
            case 'a':
                System.out.println("we found a");
                break;
            case 'b':
                System.out.println("we found b");
                break;
            default:
                System.out.println("we found noting");
        }
//
        switch (c){
            case 'a' -> System.out.println("we have a");
            case 'b' -> System.out.println("we have b");
            default -> System.out.println("we have nothing");
        }
//
       int myC = switch (c){
            case 'a' -> {
                System.out.println("we have a");
                yield 'a';
            }
            case 'b' -> {
                System.out.println("we have b");
                yield 'b';
            }
            default -> {
                System.out.println("we have nothing");
                yield 'z';
            }
        };
        System.out.println(myC);
//
        List<Integer> list  = Arrays.asList(1,2,3,5); // we will discuss later about list:))
//        for(char c1 = 'a'; c1 <= 'z'; c1++){
//            System.out.println(c1);
//        }

        for(int i =0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //enhanced for
        for(int i : list) {
            System.out.println(i);
        }
//
        list.forEach(integer -> System.out.println(integer));
//
//        Integer a = 3;
//        var a = 5;
//        var b = false;
//        var w = 'C';

//        boolean isInteger =  a instanceof Integer;

//        System.out.println(isInteger);
//        var i = new ArrayList<>();
//        i.add(5);
//        i.add("sss");

//
        //operatorul ternar:
//        int b = 11;
//        boolean isGreaterThanTen = b > 10 ? true: false;
//        System.out.println(isGreaterThanTen);
//
//        //clasa scanner
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduceti o valoare de la tastatura");
//        int valueFromConsole = scanner.nextInt();
//        System.out.println("Ati introdus: " + valueFromConsole);

        System.out.println("a=");
        int a = scanner.nextInt();

        System.out.println("b=");
        int b = scanner.nextInt();

        System.out.println("Operatie: ");
        String op = scanner.next();

        switch (op) {
            case ("+"):
                System.out.println(a + b);
                break;
            case ("*"):
                System.out.println(a * b);
                break;
            default:
                System.out.println("invalid op");
                break;
        }
//
//        int sum = 0;
//        while(true){
//            System.out.println("Introduceti o valoare pentru a fi calculata:");
//            int valueFromConsole = scanner.nextInt();
//            sum+= valueFromConsole;
//            if(valueFromConsole == 0) {
//                System.out.println(sum);
//                break;
//            }
//        }
//            var i = 4;
//        var i1 = 4.5;
//        var i2 = 'c';
//        var i3 = false;

    }
}
