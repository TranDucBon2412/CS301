package OOP2;

import java.util.Scanner;

public class Car extends Vehicle {

    private int numberOfSeats;
    private String fuelType;
    Scanner nhap = new Scanner(System.in);

    public Car() {
    }

    @Override
    public void addVehicle() {
        super.addVehicle();

        System.out.println("Enter number of seats: ");
        numberOfSeats = nhap.nextInt();
        nhap.nextLine();
        System.out.println("Enter  Fuel Type: ");
        fuelType = nhap.nextLine();
    }

    @Override
    public void updateVehicle() {
        super.updateVehicle();
        System.out.println("Update number of steats: ");
        numberOfSeats = nhap.nextInt();
        nhap.nextLine();
        System.out.println("Update Fuel Type: ");
        fuelType = nhap.nextLine();
    }

    @Override
    public void displaydDetails() {
        System.out.println("CarID: " + getId());
        System.out.println("Car Model: " + getModel());
        System.out.println("Car Brand: " + getBrand());
        System.out.println("Car rental days: " + getRentalDays());
        System.out.println("Car Price/Day: " + getRentalDays());
        System.out.println("Car seats: " + numberOfSeats);
        System.out.println("Car Fuel: " + fuelType);
    }
}
