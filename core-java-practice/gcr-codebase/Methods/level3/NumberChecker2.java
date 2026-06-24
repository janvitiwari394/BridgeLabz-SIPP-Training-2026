public class NumberChecker2 {
    static int countDigits(int n) {
        int count = 0;
        while (n > 0) { count++; n /= 10; }
        return count;
    }

    static int[] digitsArray(int n) {
        int len = countDigits(n);
        int arr[] = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            arr[i] = n % 10;
            n /= 10;
        }
        return arr;
    }

    static boolean isDuck(int arr[]) {
        for (int x : arr) if (x == 0) return true;
        return false;
    }

    static boolean isArmstrong(int n) {
        int temp = n, sum = 0;
        int digits = countDigits(n);

        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, digits);
            temp /= 10;
        }
        return sum == n;
    }
}