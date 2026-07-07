interface LuggageScanner {
    default void displaySecurityGuidelines() {
        System.out.println("No sharp objects allowed");
    }
}

interface PassportVerifier {
    default void displaySecurityGuidelines() {
        System.out.println("Carry valid passport");
    }

    static boolean isPassportNumberValid(String passportNo) {
        return passportNo != null && passportNo.length() >= 6;
    }
}

class AirportSecuritySystem implements LuggageScanner, PassportVerifier {

    public void checkPassenger(String name, String passportNo) {

        System.out.println("Passenger: " + name);

        if (PassportVerifier.isPassportNumberValid(passportNo)) {
            System.out.println("Cleared Security");
        } else {
            System.out.println("Rejected");
        }
    }

    public void displaySecurityGuidelines() {
        LuggageScanner.super.displaySecurityGuidelines();
        PassportVerifier.super.displaySecurityGuidelines();
    }
}

public class AirportSecurity {
    public static void main(String[] args) {

        String[] names = {"Rahul", "Amit", "Neha"};
        String[] passports = {"A12345", "12", "P98765"};

        AirportSecuritySystem sys = new AirportSecuritySystem();

        sys.displaySecurityGuidelines();

        for (int i = 0; i < names.length; i++) {
            sys.checkPassenger(names[i], passports[i]);
            System.out.println();
        }
    }
}