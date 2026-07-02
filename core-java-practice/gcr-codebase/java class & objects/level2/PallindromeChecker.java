class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    void check() {
        String rev = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }

        if (text.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker("madam");
        p.check();
    }
}