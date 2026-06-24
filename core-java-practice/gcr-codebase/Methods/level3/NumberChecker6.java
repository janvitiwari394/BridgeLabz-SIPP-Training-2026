public class NumberChecker6 {
    static int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++)
            if (n % i == 0) sum += i;
        return sum;
    }

    static boolean isPerfect(int n) {
        return divisorSum(n) == n;
    }

    static boolean isAbundant(int n) {
        return divisorSum(n) > n;
    }

    static boolean isDeficient(int n) {
        return divisorSum(n) < n;
    }

    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    static boolean isStrong(int n) {
        int temp = n, sum = 0;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == n;
    }
}