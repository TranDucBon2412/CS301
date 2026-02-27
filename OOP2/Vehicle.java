package OOP2;

import java.util.Scanner;

public abstract class Vehicle implements IVehicle {

    private String id;
    private String brand;
    private String model;
    private int rentalDays;
    private double rentalPricePerDay;

    public Vehicle() {
    }

    public Vehicle(String id, String brand, String model, double rentalPricePerDay) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double rentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    @Override
    public void addVehicle() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Enter id: ");
        String ID = nhap.nextLine();
        System.out.println("Enter brand: ");
        String Brand = nhap.nextLine();
        System.out.println("Enter model: ");
        String Model = nhap.nextLine();
        System.out.println("Enter rental days: ");
        int Day = nhap.nextInt();
        System.out.println("Enter Price: ");
        double Price = nhap.nextDouble();
    }

    @Override
    public void updateVehicle() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Update id: ");
        id = nhap.nextLine();
        System.out.println("Update Brand: ");
        brand = nhap.nextLine();
        System.out.println("Update Model: ");
        model = nhap.nextLine();
        System.out.println("Update rental days: ");
        rentalDays = nhap.nextInt();
        System.out.println("Update Price: ");
        rentalPricePerDay = nhap.nextDouble();
    }

    public void displayDetails() {
        System.out.println("id: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("rental days: " + rentalDays);
        System.out.println("Price:" + rentalPricePerDay);
    }
}
