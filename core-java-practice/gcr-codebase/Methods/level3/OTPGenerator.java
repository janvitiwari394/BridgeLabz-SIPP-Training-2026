public class OTPGenerator {

    static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    static boolean allUnique(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int otps[] = new int[10];

        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        if (allUnique(otps))
            System.out.println("All OTPs are unique");
        else
            System.out.println("Duplicate OTP found");
    }
}