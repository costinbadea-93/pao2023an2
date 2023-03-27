package singleton;

import exrcise.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var singletonService1 = SingletonService.getInstance();
        var sc = new Scanner(System.in);
        while(true){
            System.out.println("Choose one of the following options:");
            System.out.println("1. List all the cars:");
            System.out.println("2. Add new car:");
            System.out.println("3. Exit");
            int nr = sc.nextInt();
            switch (nr){
                case 1 -> singletonService1.listAllCars();
                case 3 -> System.exit(0);
                case 2 -> {
                    System.out.println("Enter car name:");
                    String name = sc.next();
                    System.out.println("Enter car color:");
                    String color = sc.next();
                    singletonService1.addCar(new Car(name,color));
                    System.out.println("The new car was added");
                }

            }


        }
    }
}
