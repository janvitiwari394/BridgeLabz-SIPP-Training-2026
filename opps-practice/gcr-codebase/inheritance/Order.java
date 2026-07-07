package ScenarioBased;
class Order {
    int orderId;
    String orderDate;

    Order(int id, String date) {
        this.orderId = id;
        this.orderDate = date;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int id, String date, String track) {
        super(id, date);
        this.trackingNumber = track;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int id, String date, String track, String deliveryDate) {
        super(id, date, track);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus() {
        return "Delivered";
    }
}

public class Order{ 
    public static void main(String[] args) {

        DeliveredOrder d = new DeliveredOrder(
                1001, "01-07-2026", "TRK123", "03-07-2026"
        );

        System.out.println("Order Status: " + d.getOrderStatus());
    }
}