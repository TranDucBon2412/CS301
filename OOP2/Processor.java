package OOP2;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {

        Scanner nhap = new Scanner(System.in);
        VehicleList list = new VehicleList();
        int choice;

        do {
            System.out.println("1. Add Car");
            System.out.println("2. Add Truck");
            System.out.println("3. Update Vehicle");
            System.out.println("4. Delete Vehicle");
            System.out.println("5. Find Vehicle");
            System.out.println("6. Display All");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = nhap.nextInt();
            nhap.nextLine();

            switch (choice) {
                case 1:
                    Car car = new Car();
                    car.addVehicle();
                    list.addVehicle(car);
                    break;

                case 2:
                    Truck truck = new Truck();
                    truck.addVehicle();
                    list.addVehicle(truck);
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    String idUpdate = nhap.nextLine();
                    if (!list.updateVehicleById(idUpdate)) {
                        System.out.println("Vehicle not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    String idDelete = nhap.nextLine();
                    if (!list.deleteVehicleById(idDelete)) {
                        System.out.println("Vehicle not found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter ID to find: ");
                    String idFind = nhap.nextLine();
                    list.findVehicleById(idFind);
                    break;

                case 6:
                    list.displayAllVehicles();
                    break;
            }
        } while (choice != 0);
    }
}
