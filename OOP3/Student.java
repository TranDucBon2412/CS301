package OOP3;

import java.util.Scanner;

public class Student extends Person {

    private Double gpa;
    private Double tuiuionFee;
    Scanner nhap = new Scanner(System.in);

    public Student(String id, String name, int yerOfBirth) {
        super(id, name, yerOfBirth);
    }

    public Student() {
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Double getTuiuionFee() {
        return tuiuionFee;
    }

    public void setTuiuionFee(Double tuiuionFee) {
        this.tuiuionFee = tuiuionFee;
    }

    @Override
    public void addPerson() {
        super.addPerson();
        System.out.println("Enter gpa: ");
        setGpa(nhap.nextDouble());
        System.out.println("Enter tuition Fee: ");
        setTuiuionFee(nhap.nextDouble());
    }

    @Override
    public void updatePerson() {
        super.updatePerson();
        System.out.println("Update gpa: ");
        setGpa(nhap.nextDouble());
        System.out.println("Update tuition Fee: ");
        setTuiuionFee(nhap.nextDouble());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("GPA: " + getGpa());
        System.out.println("Tuition Fee: " + getTuiuionFee());
    }
}
