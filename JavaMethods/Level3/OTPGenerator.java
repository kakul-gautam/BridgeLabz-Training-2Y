package JavaMethods.Level3;

import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000); 
    }
    public static int[] generateOTPArray(int count) {
        int[] otps = new int[count];
        for (int i = 0; i < count; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int otp : otps) {
            if (!uniqueSet.add(otp)) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpArray = generateOTPArray(10);

        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        boolean isUnique = areOTPsUnique(otpArray);
        System.out.println("\nAll OTPs are unique: " + (isUnique ? "Yes ✅" : "No ❌"));
    }
}
