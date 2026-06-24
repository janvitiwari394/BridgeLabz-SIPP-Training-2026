import java.util.Scanner;

public class StudentMarks {

    static String grade(double per) {
        if (per >= 80) return "A";
        else if (per >= 70) return "B";
        else if (per >= 60) return "C";
        else if (per >= 50) return "D";
        else if (per >= 40) return "E";
        else return "R";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int phy = sc.nextInt();
            int chem = sc.nextInt();
            int math = sc.nextInt();

            int total = phy + chem + math;
            double avg = total / 3.0;
            double per = (total / 300.0) * 100;

            System.out.println("Total: " + total);
            System.out.println("Average: " + avg);
            System.out.println("Percentage: " + per);
            System.out.println("Grade: " + grade(per));
        }
    }
}