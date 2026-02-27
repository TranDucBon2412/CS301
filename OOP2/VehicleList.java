package OOP2;

import java.util.ArrayList;

public class VehicleList {

    private ArrayList<Vehicle> VehicleList = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        VehicleList.add(v);
    }

    public boolean updateVehicleById(String id) {
        for (Vehicle v : VehicleList) {
            if (v.getId().equals(id)) {
                v.updateVehicle();
                return true;
            }
        }
        return false;
    }

    public boolean deleteVehicleById(String id) {
        return VehicleList.removeIf(v -> v.getId().equals(id));
    }

    public void findVehicleById(String id) {
        for (Vehicle v : VehicleList) {
            if (v.getId().equals(id)) {
                v.displayDetails();
                return;
            }
        }
        System.out.println("Vehicle not found!");
    }

    public void displayAllVehicles() {
        for (Vehicle v : VehicleList) {
            v.displayDetails();
        }
    }
}
