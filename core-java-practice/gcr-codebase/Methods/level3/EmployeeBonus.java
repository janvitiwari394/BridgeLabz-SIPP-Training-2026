public class EmployeeBonus {

    static double[][] generateData() {
        double data[][] = new double[10][2]; 
        // col0 = salary, col1 = years

        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000); // 5-digit salary
            data[i][1] = 1 + (int)(Math.random() * 10); // 1–10 years
        }
        return data;
    }

    static double[][] calculateBonus(double data[][]) {
        double result[][] = new double[10][4];
        // old salary, years, bonus, new salary

        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus;

            if (years > 5)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;

            result[i][0] = salary;
            result[i][1] = years;
            result[i][2] = bonus;
            result[i][3] = salary + bonus;
        }

        return result;
    }

    static void display(double arr[][]) {
        double oldTotal = 0, newTotal = 0, bonusTotal = 0;

        System.out.println("OldSalary\tYears\tBonus\tNewSalary");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1] + "\t" + arr[i][2] + "\t" + arr[i][3]);

            oldTotal += arr[i][0];
            bonusTotal += arr[i][2];
            newTotal += arr[i][3];
        }

        System.out.println("\nTotal Old Salary = " + oldTotal);
        System.out.println("Total Bonus = " + bonusTotal);
        System.out.println("Total New Salary = " + newTotal);
    }

    public static void main(String[] args) {
        double data[][] = generateData();
        double result[][] = calculateBonus(data);
        display(result);
    }
}