import java.util.Scanner;

public class NonRepeating {

    static char firstNonRepeat(String str) {
        int freq[] = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1)
                return str.charAt(i);
        }

        return '#';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char result = firstNonRepeat(str);

        if (result == '#')
            System.out.println("No non-repeating character");
        else
            System.out.println(result);
    }
}