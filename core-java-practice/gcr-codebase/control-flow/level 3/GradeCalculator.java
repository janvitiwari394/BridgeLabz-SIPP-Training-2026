import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Physics marks:");
        int physics = sc.nextInt();

        System.out.println("Enter Chemistry marks:");
        int chemistry = sc.nextInt();

        System.out.println("Enter Maths marks:");
        int maths = sc.nextInt();

        double percentage = (physics + chemistry + maths) / 3.0;

        System.out.println("Percentage = " + percentage);

        if (percentage >= 80)
            System.out.println("Grade A");
        else if (percentage >= 70)
            System.out.println("Grade B");
        else if (percentage >= 60)
            System.out.println("Grade C");
        else if (percentage >= 50)
            System.out.println("Grade D");
        else if (percentage >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade R");
    }
}