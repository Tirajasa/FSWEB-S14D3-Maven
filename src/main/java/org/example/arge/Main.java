package org.example.arge;

public class Main {
    public static void main(String[] args) {

        CarSkeleton car=new CarSkeleton("ekin","beatiful");
        System.out.println(car.startEngine());

        System.out.println(car.drive());

        CarSkeleton tesla=new ElectricCar(2.5,100);
        System.out.println(tesla.startEngine());

        System.out.println(tesla.drive());

        CarSkeleton doblo=new HybridCar(4,8,60);
        System.out.println(doblo.startEngine());

        System.out.println(doblo.drive());

        CarSkeleton dogan=new GasPoweredCar(5,8);
        System.out.println(dogan.startEngine());

        System.out.println(dogan.drive());

        startEnginex(tesla);
        startEnginex(doblo);
        startEnginex(dogan);

    }

    public static void startEnginex(CarSkeleton car) {
        System.out.println(car.startEngine());

    }
}
