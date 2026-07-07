interface HeartRateMonitor {
    default void displayHealthTips() {
        System.out.println("Keep heart rate normal");
    }

    void checkHeartRate();
}

interface TemperatureMonitor {
    default void displayHealthTips() {
        System.out.println("Maintain body temperature");
    }

    void checkTemperature();
}

class HealthMonitoringSystem implements HeartRateMonitor, TemperatureMonitor {

    String name;
    String id;

    HealthMonitoringSystem(String name, String id) {
        this.name = name;
        this.id = id;
    }

    static boolean isPatientIdValid(String id) {
        return id != null && id.startsWith("P");
    }

    public void checkHeartRate() {
        System.out.println(name + " Heart Rate: Normal");
    }

    public void checkTemperature() {
        System.out.println(name + " Temperature: Normal");
    }

    public void displayHealthTips() {
        HeartRateMonitor.super.displayHealthTips();
        TemperatureMonitor.super.displayHealthTips();
    }

    public void generateReport() {
        if (isPatientIdValid(id)) {
            System.out.println(name + " Report: HEALTHY");
        } else {
            System.out.println(name + " Report: INVALID ID");
        }
    }
}

public class SmartHealthcare{
    public static void main(String[] args) {

        String[] names = {"Rahul", "Amit", "Neha"};
        String[] ids = {"P101", "101", "P303"};

        for (int i = 0; i < names.length; i++) {

            HealthMonitoringSystem h =
                    new HealthMonitoringSystem(names[i], ids[i]);

            h.displayHealthTips();
            h.checkHeartRate();
            h.checkTemperature();
            h.generateReport();

            System.out.println();
        }
    }
}