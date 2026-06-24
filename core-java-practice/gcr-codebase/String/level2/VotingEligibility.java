import java.util.*;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ages[] = new int[10];

        for(int i=0;i<10;i++) {
            System.out.print("Enter age: ");
            ages[i] = sc.nextInt();
        }

        System.out.println("Age\tCan Vote");

        for(int age : ages) {
            if(age >= 18)
                System.out.println(age + "\tTrue");
            else
                System.out.println(age + "\tFalse");
        }
    }
}
