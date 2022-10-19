package utils;

import java.util.Random;

public class NameGenerator {

    private static String[] names = {"shruti","radhe","madhav","govind","yash","manesha" };

    public static String getName(){
        Random random = new Random();
        int randomIndex = random.nextInt(names.length);
        String name = names[randomIndex];
        System.out.println("Name = " + name);
        return name;
    }

    public static void main(String[] args) {
        NameGenerator.getName();
    }
}
