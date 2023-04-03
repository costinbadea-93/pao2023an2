package comparators;

import comparators.model.Book;
import comparators.model.Library;
import comparators.model.LibraryComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("b1");
        Book b2 = new Book("b3");
        Book b3 = new Book("b2");

        List<Book> books =
                new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        System.out.println(books);

        /**
         * Comparable
         * Comparator
         */
        Collections.sort(books);

        System.out.println(books);


        Library l1 = new Library("L1");
        Library l2 = new Library("L3");
        Library l3 = new Library("L2");

        List<Library> libraries = new ArrayList<>();
        libraries.add(l1);
        libraries.add(l2);
        libraries.add(l3);

        System.out.println(libraries);
//        Collections.sort(libraries, new LibraryComparator());
//        Collections.sort(libraries, (li1, li2) -> li1.getName().compareTo(li2.getName()));
        Collections.sort(libraries, Comparator.comparing(Library::getName));
        System.out.println(libraries);


        List<Integer> i1 = Arrays.asList(1,2,3,4);

        i1.stream()
                .filter(n -> n%2 == 0)
                .map(Main::square)
                .forEach(System.out::println);

    }

    private static int square(int n) {
        return n * n;
    }
}
