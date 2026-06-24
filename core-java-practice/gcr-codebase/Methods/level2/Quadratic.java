import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = b*b - 4*a*c;

        if(delta > 0) {
            double r1 = (-b + Math.sqrt(delta))/(2*a);
            double r2 = (-b - Math.sqrt(delta))/(2*a);

            System.out.println(r1);
            System.out.println(r2);
        }
        else if(delta == 0) {
            System.out.println((-b)/(2*a));
        }
        else {
            System.out.println("No Real Roots");
        }
    }
}