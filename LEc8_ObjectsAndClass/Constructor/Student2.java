package LEc8_ObjectsAndClass.Constructor;

import java.util.Scanner;

public class Student2 {

    int id;
    String name;

    Student2(String name, int id) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(name + "\t" + id);
    }

    public static void main(String args[]) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien 1: ");
        String n1 = nhap.nextLine();
        System.out.print("Nhap ID sinh vien 1: ");
        int i1 = nhap.nextInt();
        nhap.nextLine();
        System.out.print("Nhap ten sinh vien 2: ");
        String n2 = nhap.nextLine();
        System.out.print("Nhap ID sinh vien 2: ");
        int i2 = nhap.nextInt();
        Student s1 = new Student(n1, i1);
        Student s2 = new Student(n2, i2);
        s1.display();
        s2.display();

    }
}
