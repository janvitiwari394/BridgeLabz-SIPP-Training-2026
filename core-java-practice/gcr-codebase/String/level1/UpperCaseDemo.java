import java.util.Scanner;

public class UpperCaseDemo {

    static String convert(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String s1 = convert(str);
        String s2 = str.toUpperCase();

        System.out.println(s1);
        System.out.println(s2);
    }
}