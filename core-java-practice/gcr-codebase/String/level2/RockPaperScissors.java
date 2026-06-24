import java.util.*;

public class RockPaperScissors {
    static String choices[] = {"rock","paper","scissors"};

    static String computerChoice() {
        int index = (int)(Math.random()*3);
        return choices[index];
    }

    static String winner(String user, String comp) {
        if(user.equals(comp)) return "Draw";

        if((user.equals("rock") && comp.equals("scissors")) ||
           (user.equals("paper") && comp.equals("rock")) ||
           (user.equals("scissors") && comp.equals("paper")))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int games;
        int userWins = 0, compWins = 0;

        System.out.print("Enter number of games: ");
        games = sc.nextInt();

        for(int i=0;i<games;i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.next();

            String comp = computerChoice();

            String result = winner(user, comp);

            System.out.println("User: " + user);
            System.out.println("Computer: " + comp);
            System.out.println("Winner: " + result);

            if(result.equals("User")) userWins++;
            else if(result.equals("Computer")) compWins++;
        }

        System.out.println("User Wins = " + userWins);
        System.out.println("Computer Wins = " + compWins);

        System.out.println("User Win % = " + (userWins*100.0/games));
        System.out.println("Computer Win % = " + (compWins*100.0/games));
    }
}