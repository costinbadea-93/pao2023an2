package associations;

import associations.agregation.FootballPlayer;
import associations.agregation.FootballTeam;
import associations.composition.Car;
import associations.composition.Engine;
import associations.inheritance.Animal;
import associations.inheritance.Dog;
import associations.records.Cat;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // agregare => atunci cand doua obiecte pot exista unul fara
        //celalalt

        // compozitie  => has-a => atunci cand doua obiecte nu pot exista
        //unul fara celalalt

        //mostenirea   => is-a => "cand vrem ca un obiec sa capete semantica
        //altui obiect

        //caz1
        FootballPlayer footballPlayer = new FootballPlayer();
        FootballTeam footballTeam = new FootballTeam();
        List<FootballPlayer> footballPlayers = Arrays.asList(
          new FootballPlayer()
        );
        footballTeam.setFootballPlayers(footballPlayers);

        //caz2
        Engine engine = new Engine();
        Car car = new Car(engine);

        //caz3
        Animal animal = new Animal();
        Dog dog = new Dog();

        System.out.println(dog instanceof Animal);


//        Cat cat = new Cat("Mitzi");
//        System.out.println();


        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8);
        for(int i : l1){
            if(i % 2 == 0){
                System.out.println(i*i);
            }
        }

        l1.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(n -> System.out.println(n));
    }
}
