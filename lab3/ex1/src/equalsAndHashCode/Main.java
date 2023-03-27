package equalsAndHashCode;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /**
         * doua obiecte care sunt egale au acelasi hash code
         * insa doua obiecte cu acelasi hashcode nu sunt NEAPARAT egale
         */

        Book b1 = new Book("b1");
        Book b2 = new Book("b1");

        System.out.println(b1.equals(b2));

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(b1);
        bookSet.add(b2);

        System.out.println(bookSet);
    }
}
