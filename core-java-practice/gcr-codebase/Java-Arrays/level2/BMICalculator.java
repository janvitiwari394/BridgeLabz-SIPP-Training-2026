import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        // Input
        for (int i = 0; i < number; i++) {
            do {
                System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                weight[i] = sc.nextDouble();
            } while (weight[i] <= 0);

            do {
                System.out.print("Enter height (m) of person " + (i + 1) + ": ");
                height[i] = sc.nextDouble();
            } while (height[i] <= 0);
        }

        // Calculate BMI and Status
        for (int i = 0; i < number; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4)
                status[i] = "Underweight";
            else if (bmi[i] <= 24.9)
                status[i] = "Normal";
            else if (bmi[i] <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        // Display
        System.out.println("\nWeight\tHeight\tBMI\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
                    weight[i], height[i], bmi[i], status[i]);
        }

        sc.close();
    }
}