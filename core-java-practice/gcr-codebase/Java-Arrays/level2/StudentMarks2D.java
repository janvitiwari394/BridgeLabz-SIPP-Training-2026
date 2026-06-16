import java.util.Scanner;

public class StudentMarks2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Column 0 = Physics, 1 = Chemistry, 2 = Maths
        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

            do {
                System.out.print("Physics: ");
                marks[i][0] = sc.nextDouble();
            } while (marks[i][0] < 0 || marks[i][0] > 100);

            do {
                System.out.print("Chemistry: ");
                marks[i][1] = sc.nextDouble();
            } while (marks[i][1] < 0 || marks[i][1] > 100);

            do {
                System.out.print("Maths: ");
                marks[i][2] = sc.nextDouble();
            } while (marks[i][2] < 0 || marks[i][2] > 100);
        }

        // Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 40)
                grade[i] = 'D';
            else
                grade[i] = 'F';
        }

        // Display result
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.1f\t%.1f\t\t%.1f\t%.2f\t\t%c%n",
                    (i + 1),
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    percentage[i],
                    grade[i]);
        }

        sc.close();
    }
}