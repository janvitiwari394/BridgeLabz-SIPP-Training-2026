import java.util.Scanner;

public class ArrayIndexDemo {

    static void handle(String arr[]) {
        try {
            System.out.println(arr[arr.length + 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        String arr[] = {"A", "B", "C"};
        handle(arr);
    }
}