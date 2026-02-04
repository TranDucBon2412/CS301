package LEc8_ObjectsAndClass.Example1;

public class Car {

    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }
}
