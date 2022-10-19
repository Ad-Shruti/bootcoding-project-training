package utils;

import java.util.Random;

public class AddressGenerator {

    private static String[] addresses = {"pandav clg, new nandanvan" ,
                 "sudarshan nagar, Nagpur",
                 "mohan nagar, civil line , Nagpur",
                 " kdk clg , nandanvan" };

    public static String getAddress(){
        Random random = new Random();
        int randomIndex = random.nextInt(addresses.length);
        String address = addresses[randomIndex];
        System.out.println("Address = "+ address);
        return address;
    }

    public static void main(String[] args) {
        AddressGenerator.getAddress();
    }
}
