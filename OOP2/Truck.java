package OOP2;

import java.util.Scanner;

public class Truck extends Vehicle {

    private double loadCapacity;
    private double distance;

    public Truck() {
    }
    Scanner nhap = new Scanner(System.in);

    @Override
    public void addVehicle() {
        super.addVehicle();
        System.out.println("Enter Load Capacity: ");
        loadCapacity = nhap.nextDouble();
        System.out.println("Enter Distance: ");
        distance = nhap.nextDouble();
    }

    @Override
    public void updateVehicle() {
        super.updateVehicle();
        System.out.print("Update Load Capacity: ");
        loadCapacity = nhap.nextDouble();
        System.out.print("Update Distance: ");
        distance = nhap.nextDouble();
    }

    @Override
    public void displaydDetails() {
        System.out.println("TruckID: " + getId());
        System.out.println("Truck Model: " + getModel());
        System.out.println("Truck Brand: " + getBrand());
        System.out.println("Truck rental days: " + getRentalDays());
        System.out.println("Truck Price/Day: " + getRentalDays());
        System.out.println("Truck Load: "+loadCapacity);
        System.out.println("Truck Distance: "+loadCapacity);
    }

}
