package associations.optional;

import associations.optional.model.Book;
import associations.optional.service.MainService;

public class Main {
    public static void main(String[] args) {
        MainService mainService = new MainService();
        Book b1 = mainService.findBookByName("b1");
        System.out.println(b1);

        Book b2 = mainService.findBookByName("sdaa");
        System.out.println(b2);
    }
}
