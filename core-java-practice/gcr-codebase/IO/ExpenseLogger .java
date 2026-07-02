import java.io.*;
import java.util.*;

class ExpenseLogger {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String category = sc.next();
        int amount = sc.nextInt();

        BufferedWriter bw = new BufferedWriter(new FileWriter("expenses.txt", true));
        bw.write(category + " - " + amount);
        bw.newLine();
        bw.close();

        System.out.println("Expense Added");
    }
}