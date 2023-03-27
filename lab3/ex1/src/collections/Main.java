package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(2);

        System.out.println("My list: " + list);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        for(int i : list) {
            System.out.println(i);
        }

        list.forEach(System.out::println);


        Set<Integer> set = new HashSet<>();
//        Set<Integer> set2 = new TreeSet<>();

        set.add(1);
        set.add(1);
        set.add(2);

        System.out.println(set);
    }
}
