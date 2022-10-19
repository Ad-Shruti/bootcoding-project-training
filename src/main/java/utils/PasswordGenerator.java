package utils;

import java.util.Random;

public class PasswordGenerator {

    private static String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String lowerAlphabets = alphabets.toLowerCase();
    private static String digits = "0123456789";
    private static String alphaNumeric = alphabets + lowerAlphabets + digits;
    public static String getPassword(){

        System.out.println(alphaNumeric);
        Random random = new Random();
        String password  = " ";

        for (int i = 0; i < 8; i++){
            int randomIndex =  random.nextInt(alphaNumeric.length());
            char character = alphaNumeric.charAt(randomIndex);
            password = password + character;

        }
        System.out.println("System generated password is " + password);
        return password;

    }

    public static void main(String[] args) {
        PasswordGenerator.getPassword();
    }
}
