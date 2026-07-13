import java.util.*;

class Astronaut {

    String astronautId;
    String name;
    String specialization;

    Astronaut(String astronautId, String name, String specialization) {
        this.astronautId = astronautId;
        this.name = name;
        this.specialization = specialization;
    }

    public String toString() {
        return astronautId + " " + name + " (" + specialization + ")";
    }
}

public class SpaceMission {

    static HashMap<String, List<Astronaut>> missions = new HashMap<>();
    static HashMap<String, HashSet<String>> assigned = new HashMap<>();

    static void addMission(String mission) {

        missions.putIfAbsent(mission, new ArrayList<>());
        assigned.putIfAbsent(mission, new HashSet<>());
    }

    static void assignAstronaut(String mission, Astronaut a) {

        addMission(mission);

        if (assigned.get(mission).contains(a.astronautId)) {
            System.out.println("Duplicate assignment not allowed.");
            return;
        }

        missions.get(mission).add(a);
        assigned.get(mission).add(a.astronautId);
    }

    static void display() {

        for (String mission : missions.keySet()) {

            System.out.println("\nMission: " + mission);

            List<Astronaut> crew = missions.get(mission);

            for (Astronaut a : crew)
                System.out.println(a);

            System.out.println("Total Crew = " + crew.size());
        }
    }

    public static void main(String[] args) {

        assignAstronaut("Chandrayaan", new Astronaut("A101", "Ankush", "Pilot"));
        assignAstronaut("Chandrayaan", new Astronaut("A102", "Riya", "Scientist"));
        assignAstronaut("Chandrayaan", new Astronaut("A101", "Ankush", "Pilot"));

        assignAstronaut("Mars Mission", new Astronaut("A101", "Ankush", "Pilot"));

        display();
    }
}