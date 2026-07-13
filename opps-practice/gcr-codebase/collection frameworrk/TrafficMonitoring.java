import java.util.*;

public class TrafficMonitoring {

    static HashMap<String, Integer> traffic = new HashMap<>();

    static void addTraffic(String road, int count) {

        traffic.put(road, traffic.getOrDefault(road, 0) + count);
    }

    static void displaySorted() {

        TreeMap<String, Integer> sorted = new TreeMap<>(traffic);

        System.out.println("Traffic Report:");

        for (String road : sorted.keySet())
            System.out.println(road + " -> " + sorted.get(road) + " vehicles");
    }

    static void busiestRoad() {

        String road = "";
        int max = 0;

        for (Map.Entry<String, Integer> entry : traffic.entrySet()) {

            if (entry.getValue() > max) {
                max = entry.getValue();
                road = entry.getKey();
            }
        }

        System.out.println("\nBusiest Road: " + road);
        System.out.println("Vehicles: " + max);
    }

    static void report() {

        displaySorted();
        busiestRoad();

        System.out.println("\nTotal Roads = " + traffic.size());
    }

    public static void main(String[] args) {

        addTraffic("MG Road", 120);
        addTraffic("Ring Road", 250);
        addTraffic("Station Road", 180);
        addTraffic("MG Road", 50);

        report();
    }
}