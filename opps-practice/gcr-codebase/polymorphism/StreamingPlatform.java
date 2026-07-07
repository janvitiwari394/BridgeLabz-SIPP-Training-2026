class Subscription {

    String subscriberName, subscriptionId;

    Subscription(String n, String id) {
        subscriberName = n;
        subscriptionId = id;
    }

    double calculateMonthlyCharge() {
        return 0;
    }
}

class BasicPlan extends Subscription {
    BasicPlan(String n, String id) { super(n, id); }
    double calculateMonthlyCharge() { return 199; }
}

class PremiumPlan extends Subscription {
    PremiumPlan(String n, String id) { super(n, id); }
    double calculateMonthlyCharge() { return 499; }
}

class FamilyPlan extends Subscription {
    FamilyPlan(String n, String id) { super(n, id); }
    double calculateMonthlyCharge() { return 799; }
}

public class StreamingPlatform  {

    public static void main(String[] args) {

        Subscription[] s = {
                new BasicPlan("Rahul", "S1"),
                new PremiumPlan("Amit", "S2"),
                new FamilyPlan("Riya", "S3")
        };

        double total = 0;
        Subscription max = s[0];

        for (Subscription x : s) {

            total += x.calculateMonthlyCharge();

            if (x.calculateMonthlyCharge() > max.calculateMonthlyCharge())
                max = x;

            if (x.subscriptionId.equals("S2"))
                System.out.println("Found: " + x.subscriberName);

            if (x.subscriberName.startsWith("R"))
                System.out.println(x.subscriberName);
        }

        System.out.println("Revenue = " + total);
        System.out.println("Costliest Plan = " + max.subscriptionId);
    }
}