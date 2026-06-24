import java.util.*;

public class TrimSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int start = 0;
        int end = str.length()-1;

        while(start <= end && str.charAt(start)==' ')
            start++;

        while(end >= start && str.charAt(end)==' ')
            end--;

        String custom = str.substring(start, end+1);
        String builtin = str.trim();

        System.out.println("Custom = " + custom);
        System.out.println("Built-in = " + builtin);
        System.out.println(custom.equals(builtin));
    }
}