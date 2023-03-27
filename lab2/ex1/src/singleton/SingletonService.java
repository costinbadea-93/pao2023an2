package singleton;

import exrcise.Car;

public class SingletonService {
    private Car[] cars = new Car[0];

    private SingletonService(){}

    private static class SingletonHolder{
        private static final SingletonService INSTANCE = new SingletonService();
    }

    public static SingletonService getInstance(){
        return SingletonHolder.INSTANCE;
    }

    // methods.....
    public void addCar(Car c){
        Car[] newCars = new Car[cars.length+1];

        for(int i=0; i<cars.length;i++){
            newCars[i]=cars[i];
        }
        newCars[newCars.length-1]=c;
        cars=newCars;
    }
    public void listAllCars(){
        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }
    }
}
