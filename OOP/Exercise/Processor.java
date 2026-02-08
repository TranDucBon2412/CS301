
package OOP.Exercise;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList list = new BookList();

        while (true) {
            System.out.println("\n1. Add new book");
            System.out.println("2. Update book by ID");
            System.out.println("3. Delete book by ID");
            System.out.println("4. Find book by ID");
            System.out.println("5. Display all books");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("1. TextBook");
                    System.out.println("2. ReferenceBook");
                    int type = sc.nextInt();
                    sc.nextLine();
                    if (type == 1) list.addBook(new TextBook());
                    else if (type == 2) list.addBook(new ReferenceBook());
                    else System.out.println("Invalid type!");
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    list.updateBook(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    list.deleteBookById(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    Book b = list.findBookById(sc.nextLine());
                    if (b != null) b.displayBook();
                    else System.out.println("Not found!");
                    break;

                case 5:
                    list.displayAllBooks();
                    break;

                case 0:
                    System.out.println("Bye!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
