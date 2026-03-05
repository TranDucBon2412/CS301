package OOP3;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        PersonList List = new PersonList();
        int choice;
        do {
            System.out.println("=======MENU=======");
            System.out.println("1.add student");
            System.out.println("2.add teacher");
            System.out.println("3.update person by ID");
            System.out.println("4.delete person by ID");
            System.out.println("5.find person by ID");
            System.out.println("6. displau all");
            System.out.println("0.Exit");
            choice = nhap.nextInt();
            nhap.nextLine();
            switch (choice) {
                case 1:
                    Student s = new Student();
                    s.addPerson();
                    List.addPerson(s);
                    break;
                case 2:
                    Teacher t = new Teacher();
                    t.addPerson();
                    List.addPerson(t);
                    break;
                case 3:
                    System.out.println("Enter ID to update: ");
                    String idUpdate = nhap.nextLine();
                    List.updatePersonById(idUpdate);
                    break;
                case 4:
                    System.out.println("Enter ID to delete: ");
                    String idDelete = nhap.nextLine();
                    List.deletePersonById(idDelete);
                    break;
                case 5:
                    System.out.println("Enter ID to find: ");
                    String idFind = nhap.nextLine();
                    Person person = List.findPersonById(idFind);

                    if (person != null) {
                        person.displayDetails();
                    } else {
                        System.out.println("Person not found");
                    }
                    break;
                case 6:
                    List.displayAll();
                    break;
                case 0:
                    System.out.println("Exit program");
                    break;
                default:
                    System.out.println("Invaliid choice");
            }
        } while (choice != 0);
    }
}
