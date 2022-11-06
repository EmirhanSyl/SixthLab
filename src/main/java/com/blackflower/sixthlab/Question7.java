package com.blackflower.sixthlab;

/**
 * @author emirs
 */
public class Question7 {
    public static void main(String[] args) {
        
        int num = 432532432;
        int maxDigit = 0;

        while (num > 0) {
            int lastDigit = num % 10;

            maxDigit = (lastDigit > maxDigit) ? lastDigit : maxDigit;
            num /= 10;
        }
        System.out.println(maxDigit);
        
    }
}
