import java.util.Scanner;

public class FactorTasks {

    static int[] findFactors(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        int factors[] = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                factors[index++] = i;
        }

        return factors;
    }

    static int greatestFactor(int factors[]) {
        return factors[factors.length - 1];
    }

    static int sumFactors(int factors[]) {
        int sum = 0;
        for (int x : factors)
            sum += x;
        return sum;
    }

    static long productFactors(int factors[]) {
        long product = 1;
        for (int x : factors)
            product *= x;
        return product;
    }

    static double productCubeFactors(int factors[]) {
        double product = 1;
        for (int x : factors)
            product *= Math.pow(x, 3);
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int factors[] = findFactors(num);

        System.out.print("Factors: ");
        for (int x : factors)
            System.out.print(x + " ");

        System.out.println("\nGreatest Factor = " + greatestFactor(factors));
        System.out.println("Sum = " + sumFactors(factors));
        System.out.println("Product = " + productFactors(factors));
        System.out.println("Product of Cubes = " + productCubeFactors(factors));
    }
}