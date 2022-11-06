package com.blackflower.sixthlab;

/**
 * @author emirs
 */
public class Question8 {
    public static void main(String[] args) {
        
        int initPoint = 1;
        char initChar = 'a';

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                if (i % 2 == 0) {
                    System.out.print(initChar + " ");
                    initChar++;
                } else {
                    System.out.print(initPoint + " ");
                    initPoint = initPoint << 1;
                }

            }
            System.out.println();
        }
                
    }
}
