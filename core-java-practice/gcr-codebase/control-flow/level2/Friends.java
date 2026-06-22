import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Amar age and height:");
        int amarAge = sc.nextInt();
        int amarHeight = sc.nextInt();

        System.out.println("Enter Akbar age and height:");
        int akbarAge = sc.nextInt();
        int akbarHeight = sc.nextInt();

        System.out.println("Enter Anthony age and height:");
        int anthonyAge = sc.nextInt();
        int anthonyHeight = sc.nextInt();

        // Youngest
        if (amarAge < akbarAge && amarAge < anthonyAge)
            System.out.println("Youngest: Amar");
        else if (akbarAge < amarAge && akbarAge < anthonyAge)
            System.out.println("Youngest: Akbar");
        else
            System.out.println("Youngest: Anthony");

        // Tallest
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight)
            System.out.println("Tallest: Amar");
        else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight)
            System.out.println("Tallest: Akbar");
        else
            System.out.println("Tallest: Anthony");
    }
}