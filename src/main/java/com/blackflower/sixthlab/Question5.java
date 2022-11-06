package com.blackflower.sixthlab;

/**
 * @author emirs
 */
public class Question5 {
    public static void main(String[] args) {
        
        int initNum = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(initNum++ + " ");
            }
            System.out.println("");
        }
        
    }
}
