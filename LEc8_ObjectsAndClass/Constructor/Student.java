
package LEc8_ObjectsAndClass.Constructor;
    import java.util.Scanner;
public class Student {
    int id;
    String name;
    Student(String n, int i){
        id=i;
        name=n;
    }
    void display(){System.out.println(name+"\t"+id);}
    public static void main(String args[]){
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
        Student s1 = new Student(n1,i1);
        Student s2 = new Student(n2,i2);
        s1.display();
        s2.display();
        
    }
}
