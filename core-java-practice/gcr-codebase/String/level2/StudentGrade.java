import java.util.Scanner;

public class StudentGrade {

    // Generate random marks for Physics, Chemistry, Maths
    static int[][] generateMarks(int students) {
        int marks[][] = new int[students][3];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int)(Math.random() * 100);
            }
        }
        return marks;
    }

    // Calculate total, average, percentage
    static double[][] calculateResults(int marks[][]) {
        int students = marks.length;
        double result[][] = new double[students][3];

        for (int i = 0; i < students; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = total / 3.0;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    // Assign grade
    static String[] calculateGrade(double result[][]) {
        String grades[] = new String[result.length];

        for (int i = 0; i < result.length; i++) {
            double percentage = result[i][2];

            if (percentage >= 80)
                grades[i] = "A";
            else if (percentage >= 70)
                grades[i] = "B";
            else if (percentage >= 60)
                grades[i] = "C";
            else if (percentage >= 50)
                grades[i] = "D";
            else if (percentage >= 40)
                grades[i] = "E";
            else
                grades[i] = "R";
        }

        return grades;
    }

    // Display scorecard
    static void display(int marks[][], double result[][], String grades[]) {
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPer\tGrade");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                (i+1) + "\t" +
                marks[i][0] + "\t" +
                marks[i][1] + "\t" +
                marks[i][2] + "\t" +
                result[i][0] + "\t" +
                result[i][1] + "\t" +
                result[i][2] + "\t" +
                grades[i]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int marks[][] = generateMarks(students);
        double result[][] = calculateResults(marks);
        String grades[] = calculateGrade(result);

        display(marks, result, grades);
    }
}