import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            number = -number; // Convert negative number to positive
        }

        int temp = number;
        int count = 0;

        // Count digits
        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp /= 10;
            }
        }

        // Store digits in array
        int[] digits = new int[count];
        temp = number;

        if (number == 0) {
            digits[0] = 0;
        } else {
            for (int i = 0; i < count; i++) {
                digits[i] = temp % 10;
                temp /= 10;
            }
        }

        // Frequency array
        int[] frequency = new int[10];

        // Count frequency of each digit
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " occurs " + frequency[i] + " time(s)");
            }
        }

        sc.close();
    }
}
