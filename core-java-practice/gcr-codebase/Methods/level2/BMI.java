import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double data[][] = new double[10][3];

        for(int i=0;i<10;i++) {
            data[i][0] = sc.nextDouble(); // weight
            data[i][1] = sc.nextDouble(); // height cm

            double h = data[i][1] / 100;
            data[i][2] = data[i][0] / (h*h);
        }

        for(int i=0;i<10;i++) {
            String status;
            double bmi = data[i][2];

            if(bmi <= 18.4) status="Underweight";
            else if(bmi <= 24.9) status="Normal";
            else if(bmi <= 39.9) status="Overweight";
            else status="Obese";

            System.out.println(data[i][0] + " " + data[i][1] + " " + bmi + " " + status);
        }
    }
}