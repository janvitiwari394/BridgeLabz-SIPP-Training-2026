public class NumberChecker3 {
    static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int sumSquareDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += Math.pow(d, 2);
            n /= 10;
        }
        return sum;
    }

    static boolean isHarshad(int n) {
        return n % sumDigits(n) == 0;
    }
}