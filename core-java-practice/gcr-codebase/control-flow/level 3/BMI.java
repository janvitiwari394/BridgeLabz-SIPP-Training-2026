import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight in kg:");
        double weight = sc.nextDouble();

        System.out.println("Enter height in cm:");
        double height = sc.nextDouble();

        // Convert cm to meter
        double heightInMeter = height / 100.0;

        // BMI calculation
        double bmi = weight / (heightInMeter * heightInMeter);

        System.out.println("BMI = " + bmi);

        // Check BMI category
        if (bmi <= 18.4) {
            System.out.println("Underweight");
        } 
        else if (bmi <= 24.9) {
            System.out.println("Normal");
        } 
        else if (bmi <= 39.9) {
            System.out.println("Overweight");
        } 
        else {
            System.out.println("Obese");
        }
    }
}