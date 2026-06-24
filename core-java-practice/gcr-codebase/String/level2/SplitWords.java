import java.util.Scanner;

public class SplitWords {

    static String[] splitWords(String text) {
        String words[] = text.split(" ");
        return words;
    }

    static boolean compare(String a[], String b[]) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String arr1[] = splitWords(text);
        String arr2[] = text.split(" ");

        System.out.println(compare(arr1, arr2));
    }
}