package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private  int wheel;

    public Car(boolean engine , int cylinders, String name,int wheel) {
        this.engine = engine;
        this.cylinders = cylinders;
        this.name = name;
        this.wheel = wheel;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheel() {
        return wheel;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
    public void startEngine() {
        System.out.println(getClass().getSimpleName()+"the car's engine is starting");
    }
    public void accelerate() {
        System.out.println(getClass().getSimpleName()+"the car is accelerating");
    }
    public void brake() {
        System.out.println(getClass().getSimpleName()+"the car is braking");
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheel=" + wheel +
                '}';
    }

    @Override
    public boolean equals(Object car) {
        return ((Car)car).cylinders==this.cylinders&&((Car)car).name.equals(this.name);
    }
}
