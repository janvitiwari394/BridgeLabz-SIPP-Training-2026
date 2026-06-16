import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // personData[][0] = Weight
        // personData[][1] = Height
        // personData[][2] = BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Input weight and height
        for (int i = 0; i < number; i++) {
            do {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                personData[i][0] = sc.nextDouble();

                if (personData[i][0] <= 0) {
                    System.out.println("Invalid! Weight must be positive.");
                }
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter height (meters) for person " + (i + 1) + ": ");
                personData[i][1] = sc.nextDouble();

                if (personData[i][1] <= 0) {
                    System.out.println("Invalid! Height must be positive.");
                }
            } while (personData[i][1] <= 0);
        }

        // Calculate BMI and weight status
        for (int i = 0; i < number; i++) {
            personData[i][2] = personData[i][0] / 
                               (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display details
        System.out.println("\nWeight\tHeight\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
                    personData[i][0],
                    personData[i][1],
                    personData[i][2],
                    weightStatus[i]);
        }

        sc.close();
    }
}