class RescueTeam {

    String teamId, location;

    RescueTeam(String id, String loc) {
        teamId = id;
        location = loc;
    }

    void performDuty() { }
}

class MedicalTeam extends RescueTeam {

    MedicalTeam(String id, String loc) {
        super(id, loc);
    }

    void performDuty() {
        System.out.println(teamId + " Medical Aid");
    }
}

class FireRescueTeam extends RescueTeam {

    FireRescueTeam(String id, String loc) {
        super(id, loc);
    }

    void performDuty() {
        System.out.println(teamId + " Fire Rescue");
    }
}

class FoodSupplyTeam extends RescueTeam {

    FoodSupplyTeam(String id, String loc) {
        super(id, loc);
    }

    void performDuty() {
        System.out.println(teamId + " Food Supply");
    }
}

public class DisasterRescue {

    public static void main(String[] args) {

        RescueTeam[] t = {
                new MedicalTeam("M1", "Delhi"),
                new FireRescueTeam("F1", "Delhi"),
                new FoodSupplyTeam("FS1", "Agra"),
                new MedicalTeam("M2", "Agra")
        };

        int med = 0, fire = 0, food = 0;

        for (RescueTeam x : t) {

            x.performDuty();

            if (x.location.equals("Delhi"))
                System.out.println("Located: " + x.teamId);

            if (x.teamId.startsWith("M"))
                System.out.println("Prefix Match: " + x.teamId);

            if (x instanceof MedicalTeam) med++;
            else if (x instanceof FireRescueTeam) fire++;
            else if (x instanceof FoodSupplyTeam) food++;
        }

        System.out.println("Medical=" + med);
        System.out.println("Fire=" + fire);
        System.out.println("Food=" + food);

        if (med >= fire && med >= food)
            System.out.println("Maximum Deployment: Medical");
        else if (fire >= med && fire >= food)
            System.out.println("Maximum Deployment: Fire");
        else
            System.out.println("Maximum Deployment: Food Supply");
    }
}