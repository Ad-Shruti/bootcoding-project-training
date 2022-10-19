package utils;

import java.util.Random;

public class PhoneNumberGenerator {
    final static int MAX = 999999999;
    final static int MIN = 100000000;
    static Random random = new Random();

    public static int getPhoneNumber(){

        int number = random.nextInt(MAX - MIN);
        int phoneNumber = MIN + number;
        System.out.println("OTP Number = " + phoneNumber);
        return phoneNumber;
    }

    public static void main(String[] args) {
        PhoneNumberGenerator.getPhoneNumber();
    }
}
