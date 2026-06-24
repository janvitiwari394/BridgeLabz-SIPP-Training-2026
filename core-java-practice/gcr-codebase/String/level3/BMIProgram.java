import java.util.Scanner;

public class BMIProgram {

    static String[][] calculateBMI(double data[][]) {
        String result[][] = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100.0;

            double bmi = weight / (height * height);
            String status;

            if (bmi <= 18.4)
                status = "Underweight";
            else if (bmi <= 24.9)
                status = "Normal";
            else if (bmi <= 39.9)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double data[][] = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Weight: ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter Height(cm): ");
            data[i][1] = sc.nextDouble();
        }

        String result[][] = calculateBMI(data);

        System.out.println("Height\tWeight\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1] + "\t" +
                    result[i][2] + "\t" + result[i][3]);
        }
    }
}