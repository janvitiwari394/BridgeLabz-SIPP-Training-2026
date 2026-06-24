import java.util.Scanner;

public class FrequencyUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i=0;i<str.length();i++) {
            boolean unique = true;

            for(int j=0;j<i;j++) {
                if(str.charAt(i)==str.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if(unique) {
                int count = 0;
                for(int k=0;k<str.length();k++) {
                    if(str.charAt(i)==str.charAt(k))
                        count++;
                }
                System.out.println(str.charAt(i)+" : "+count);
            }
        }
    }
}