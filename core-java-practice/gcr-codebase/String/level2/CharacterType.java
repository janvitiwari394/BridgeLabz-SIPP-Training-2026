import java.util.*;

public class CharacterType {
    static String check(char ch) {
        ch = Character.toLowerCase(ch);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            return "Vowel";
        else if(ch>='a' && ch<='z')
            return "Consonant";
        else
            return "Not a Letter";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i=0;i<str.length();i++) {
            System.out.println(str.charAt(i) + " : " + check(str.charAt(i)));
        }
    }
}