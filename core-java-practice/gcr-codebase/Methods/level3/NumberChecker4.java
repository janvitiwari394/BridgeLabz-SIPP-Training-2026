public class NumberChecker4 {
    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    static boolean isDuck(int n) {
        while (n > 0) {
            if (n % 10 == 0) return true;
            n /= 10;
        }
        return false;
    }
}