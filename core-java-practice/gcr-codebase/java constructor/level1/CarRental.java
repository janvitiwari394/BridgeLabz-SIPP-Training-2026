class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental() {
        customerName = "Guest";
        carModel = "Basic";
        rentalDays = 1;
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    void calculateCost() {
        int costPerDay = 2000;
        int total = rentalDays * costPerDay;
        System.out.println("Total Cost: " + total);
    }

    void display() {
        System.out.println(customerName + " " + carModel + " " + rentalDays);
    }

    public static void main(String[] args) {
        CarRental c = new CarRental("Janvi", "Swift", 4);
        c.display();
        c.calculateCost();
    }
}