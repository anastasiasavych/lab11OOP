package com.company;

public class Main {

    public static void main(String[] args) {
        One one = new One();
        System.out.println("Method 1:");
        one.firstMethod();
        System.out.println("\nMethod 2:");
        one.secondMethod(2,null);
        System.out.println("\nMethod 3:");
        one.thirdMethod(-5);
    }

}
