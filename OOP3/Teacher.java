package OOP3;

import java.util.Scanner;

public class Teacher extends Person {

    Scanner nhap = new Scanner(System.in);
    private int numberOfClasses;
    private Double baseSalary;

    public Teacher(String id, String name, int yerOfBirth) {
        super(id, name, yerOfBirth);
    }

    public Teacher() {
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public void addPerson() {
        super.addPerson();
        System.out.println("Enter number of classes: ");
        setNumberOfClasses(nhap.nextInt());
        System.out.println("Enter base salary: ");
        setBaseSalary(nhap.nextDouble());
    }

    @Override
    public void updatePerson() {
        super.updatePerson();
        System.out.println("Update number of classes: ");
        setNumberOfClasses(nhap.nextInt());
        System.out.println("Update base salary: ");
        setBaseSalary(nhap.nextDouble());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("number of classes: " + getNumberOfClasses());
        System.out.println("base salary: " + getBaseSalary());
    }
}
