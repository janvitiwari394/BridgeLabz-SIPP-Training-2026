interface Trackable {
    void logActivity();

    default void resetData() {
        System.out.println("Data reset");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    public void logActivity() {
        System.out.println("Activity logged");
    }

    public void generateReport() {
        System.out.println("Report generated");
    }

    public void sendAlert() {
        System.out.println("Alert sent");
    }
}

public class FitnessTracker {
    public static void main(String[] args) {

        FitnessDevice f = new FitnessDevice();

        f.logActivity();
        f.generateReport();
        f.sendAlert();
        f.resetData();
    }
}