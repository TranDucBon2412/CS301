package OOP3;

import java.util.Scanner;

public abstract class Person implements IPerson {

    private String id;
    private String name;
    private int yerOfBirth;

    public Person(String id, String name, int yerOfBirth) {
        this.id = id;
        this.name = name;
        this.yerOfBirth = yerOfBirth;
    }

    public Person() {

    }

    Scanner nhap = new Scanner(System.in);

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYerOfBirth() {
        return yerOfBirth;
    }

    public void setYerOfBirth(int yerOfBirth) {
        this.yerOfBirth = yerOfBirth;
    }

    @Override
    public void addPerson() {

        System.out.println("Enter id: ");
        setId(nhap.nextLine());
        System.out.println("Enter name: ");
        setName(nhap.nextLine());
        System.out.println("Enter birthday: ");
        setYerOfBirth(nhap.nextInt());
    }

    @Override
    public void updatePerson() {

        System.out.println("Update id: ");
        setId(nhap.nextLine());
        System.out.println("Update name: ");
        setName(nhap.nextLine());
        System.out.println("Update birthday: ");
        setYerOfBirth(nhap.nextInt());
    }

    @Override
    public void displayDetails() {

        System.out.println("id: " + getId());
        System.out.println("name: " + getName());
        System.out.println("birthday: " + getYerOfBirth());
    }
}
