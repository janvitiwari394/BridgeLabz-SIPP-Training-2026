interface FoodDelivery {
    default void trackOrder() {
        System.out.println("Tracking food order...");
    }
}

interface GroceryDelivery {

    default void trackOrder() {
        System.out.println("Tracking grocery order...");
    }

    static String generateDeliveryCode() {
        return "DEL" + (int)(Math.random() * 1000);
    }
}

class DeliveryExecutive implements FoodDelivery, GroceryDelivery {

    String name;

    DeliveryExecutive(String name) {
        this.name = name;
    }

    public void trackOrder() {
        FoodDelivery.super.trackOrder();
        GroceryDelivery.super.trackOrder();
    }

    public void deliver(String customer) {
        System.out.println(name + " delivering to " + customer);
        System.out.println("Delivery Code: " +
                GroceryDelivery.generateDeliveryCode());
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {

        String[] customers = {"Rahul", "Amit", "Neha"};

        DeliveryExecutive d = new DeliveryExecutive("Rider-1");

        for (String c : customers) {
            d.trackOrder();
            d.deliver(c);
            System.out.println();
        }
    }
}