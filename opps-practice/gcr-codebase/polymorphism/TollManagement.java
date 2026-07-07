class Vehicle {
    String vehicleNumber, ownerName;

    Vehicle(String no, String owner) {
        vehicleNumber = no;
        ownerName = owner;
    }

    double calculateToll() {
        return 0;
    }
}

class Car extends Vehicle {
    Car(String n, String o) { super(n, o); }
    double calculateToll() { return 100; }
}

class Bus extends Vehicle {
    Bus(String n, String o) { super(n, o); }
    double calculateToll() { return 200; }
}

class Truck extends Vehicle {
    Truck(String n, String o) { super(n, o); }
    double calculateToll() { return 300; }
}

public class TollManagement {

    static void calculateTotalRevenue(Vehicle[] v) {
        double total = 0;
        for (Vehicle x : v)
            total += x.calculateToll();
        System.out.println("Total Revenue = " + total);
    }

    static void searchVehicle(Vehicle[] v, String num) {
        for (Vehicle x : v)
            if (x.vehicleNumber.equals(num))
                System.out.println("Found: " + x.ownerName);
    }

    public static void main(String[] args) {

        Vehicle[] v = {
                new Car("C101", "Rahul"),
                new Bus("B201", "Amit"),
                new Truck("T301", "Ravi"),
                new Car("C102", "Neha")
        };

        calculateTotalRevenue(v);
        searchVehicle(v, "T301");

        Vehicle max = v[0];
        int car = 0, bus = 0, truck = 0;

        for (Vehicle x : v) {

            if (x.calculateToll() > max.calculateToll())
                max = x;

            if (x instanceof Car) car++;
            else if (x instanceof Bus) bus++;
            else if (x instanceof Truck) truck++;
        }

        System.out.println("Highest Toll Vehicle: " + max.vehicleNumber);
        System.out.println("Cars=" + car);
        System.out.println("Bus=" + bus);
        System.out.println("Truck=" + truck);
    }
}