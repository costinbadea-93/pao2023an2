import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Book> books = Arrays.asList(
          new Book("B2", "A1", Arrays.asList("R1", "R2")),
          new Book("B1", "A2", Arrays.asList("R3")),
          new Book("B3", "A3", Arrays.asList("R4", "R5","R6"))
        );

//        List<Integer> integers = Arrays.asList(1,2,6,4,5);
//
//        books.stream()
//                .filter(b -> b.getReview().size() > 1)
//                .forEach(System.out::println);

        //filter
        //map
        //write
//        integers.stream()
//                .filter(n -> n%2 == 0)
//                .map(Main::pow)
//                .forEach(System.out::println);

//        System.out.println(books);
//        Collections.sort(books, (b1,b2) ->b1.getName().compareTo(b2.getName()));
//        System.out.println(books);

//        int [] arr = new int[0];
//        arr = addToArray(arr,1);
//        arr = addToArray(arr,3);
//        arr = addToArray(arr,8);
//        System.out.println(Arrays.toString(arr));

//        Path path = Paths.get("C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\pao presentation 2023\\lab2\\ex1\\src\\data.txt");
//        Files.lines(path)
//                .forEach(System.out::println);


    }

    private static int[] addToArray(int[] arr, int value){
        int[] newArray = new int[arr.length + 1];
        for(int i =0; i < arr.length; i ++){
            newArray[i] = arr[i];
        }
        newArray[newArray.length - 1] = value;
        return newArray;
    }

    private static int pow(int n){
        return n*n;
    }
}

/**
 * name
 * author
 * reviews
 */
class Book {
    private String name;
    private String author;
    private List<String> review = new ArrayList<>();

    public Book() {
    }

    public Book(String name, String author, List<String> review) {
        this.name = name;
        this.author = author;
        this.review = review;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getReview() {
        return review;
    }

    public void setReview(List<String> review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", review=" + review +
                '}';
    }
}
