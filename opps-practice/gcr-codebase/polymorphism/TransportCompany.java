class Vehicle {
    double fuelCost(int km) {
        return 0;
    }
}

class Car extends Vehicle {
    double fuelCost(int km) {
        return km * 8;
    }
}

class Bus extends Vehicle {
    double fuelCost(int km) {
        return km * 15;
    }
}

class Bike extends Vehicle {
    double fuelCost(int km) {
        return km * 3;
    }
}

class ElectricCar extends Vehicle {
    double fuelCost(int km) {
        return km * 2;
    }
}

public class TransportCompany {
    public static void main(String[] args) {

        Vehicle[] v = {
                new Car(),
                new Bus(),
                new Bike(),
                new ElectricCar()
        };

        int km = 10;

        for (Vehicle x : v) {
            System.out.println(x.getClass().getSimpleName()
                    + " Cost = " + x.fuelCost(km));

            if (x instanceof Car)
                System.out.println("It is a Car");
        }
    }
}