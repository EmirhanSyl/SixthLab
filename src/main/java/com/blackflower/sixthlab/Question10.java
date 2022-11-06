package com.blackflower.sixthlab;

/**
 * @author emirs
 */
public class Question10 {
    public static void main(String[] args) {
        
        int num = 1558;
        boolean divisibleBy3 = false;

        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit % 3 == 0) {
                divisibleBy3 = true;
                break;
            }

            num /= 10;
        }

        if (divisibleBy3) {
            System.out.println("Number contains some digits that are divisible by 3");
        } else {
            System.out.println("Number doesn't contains a digit that is divisible by 3");
        }
        
    }
}
