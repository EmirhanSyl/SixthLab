package com.blackflower.sixthlab;

/**
 * @author emirs
 */
public class Question6 {
    public static void main(String[] args) {
        
        int num = 432532432;

        for (int i = 0; i < 10; i++) {
            int tempNum = num;
            boolean isInclueded = false;

            while (tempNum > 0) {
                int lastDigit = tempNum % 10;

                if (lastDigit == i) {
                    isInclueded = true;
                    break;
                }

                tempNum /= 10;
            }

            if (!isInclueded) {
                System.out.println(i);
            }
        }
        
    }
}
