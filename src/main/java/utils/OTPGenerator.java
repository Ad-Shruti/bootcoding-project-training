package utils;

import java.util.Random;

public class OTPGenerator {
    final static int MAX = 999999;
    final static int MIN = 10000;
    static Random random = new Random();

    public static int getOTP(){

        int number = random.nextInt(MAX - MIN);
        int otp = MIN + number;
        System.out.println("OTP Number = " + otp);
        return otp;
    }

    public static void main(String[] args) {
        OTPGenerator.getOTP();
    }
}
