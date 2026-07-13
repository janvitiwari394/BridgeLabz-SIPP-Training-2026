import java.util.*;

public class ParkingManager {

    static ArrayList<String> vehicles = new ArrayList<>();

    static void enter(String number) {
        vehicles.add(number);
    }

    static void exit(String number) {
        vehicles.remove(number);
    }

    static void search(String number) {
        if (vehicles.contains(number))
            System.out.println("Vehicle is parked.");
        else
            System.out.println("Vehicle not found.");
    }

    static void display() {
        System.out.println("Parked Vehicles:");
        for (String v : vehicles)
            System.out.println(v);

        System.out.println("Occupied Slots = " + vehicles.size());
    }

    public static void main(String[] args) {

        enter("UP85AB1234");
        enter("DL01CD1111");
        enter("MP09XY4567");

        search("DL01CD1111");

        exit("UP85AB1234");

        display();
    }
}