import java.util.Scanner;

public class NumberCheck {
    static boolean isPositive(int n) { return n >= 0; }
    static boolean isEven(int n) { return n % 2 == 0; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i=0;i<5;i++) {
            arr[i] = sc.nextInt();

            if(isPositive(arr[i])) {
                if(isEven(arr[i])) System.out.println("Positive Even");
                else System.out.println("Positive Odd");
            } else {
                System.out.println("Negative");
            }
        }

        if(arr[0] > arr[4]) System.out.println("First Greater");
        else if(arr[0] < arr[4]) System.out.println("Last Greater");
        else System.out.println("Equal");
    }
}