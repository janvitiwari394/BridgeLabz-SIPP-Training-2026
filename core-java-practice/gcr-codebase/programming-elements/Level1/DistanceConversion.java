import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("Distance in yards is " + distanceInYards +
                           " while in miles is " + distanceInMiles);

        sc.close();
    }
}