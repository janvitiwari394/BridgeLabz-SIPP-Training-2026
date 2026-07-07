class Notification {
    String recipientName, message;

    Notification(String name, String msg) {
        recipientName = name;
        message = msg;
    }

    void sendNotification() {
        System.out.println("Notification");
    }
}

class EmailNotification extends Notification {
    EmailNotification(String n, String m) { super(n, m); }

    void sendNotification() {
        System.out.println("Email to " + recipientName + ": " + message);
    }
}

class SMSNotification extends Notification {
    SMSNotification(String n, String m) { super(n, m); }

    void sendNotification() {
        System.out.println("SMS to " + recipientName + ": " + message);
    }
}

class PushNotification extends Notification {
    PushNotification(String n, String m) { super(n, m); }

    void sendNotification() {
        System.out.println("Push to " + recipientName + ": " + message);
    }
}

public class SmartNotificationSystem {
    public static void main(String[] args) {

        Notification[] arr = {
                new EmailNotification("Rahul", "Welcome"),
                new SMSNotification("Amit", "OTP"),
                new PushNotification("Priya", "Offer")
        };

        for (Notification n : arr)
            n.sendNotification();
    }
}