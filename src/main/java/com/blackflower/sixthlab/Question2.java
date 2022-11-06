package com.blackflower.sixthlab;

/**
 * @author emirs
 */
public class Question2 {
    public static void main(String[] args) {
        
        int num = 1567538;
        boolean contains3 = false;

        while (num > 0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit + ", ");

            if (lastDigit == 3) {
                contains3 = true;
            }

            num /= 10;
        }
        System.out.println();

        if (contains3) {
            System.out.println("Number contains 3!");
        }
    }
}
