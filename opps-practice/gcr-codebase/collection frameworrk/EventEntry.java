import java.util.*;

public class EventEntry {

    static HashSet<String> participants = new HashSet<>();

    static void register(String email) {

        if (participants.add(email))
            System.out.println("Registration Successful");
        else
            System.out.println("Duplicate Registration Rejected");
    }

    static void display() {

        System.out.println("Participants:");

        for (String email : participants)
            System.out.println(email);

        System.out.println("Total = " + participants.size());
    }

    public static void main(String[] args) {

        register("a@gmail.com");
        register("b@gmail.com");
        register("a@gmail.com");

        display();
    }
}