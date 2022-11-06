package com.blackflower.sixthlab;

/**
 * @author emirs
 */
public class Question9 {
    public static void main(String[] args) {
        
        int fuctorial = 1;
        for (int i = 2; i < 7; i++) {
            fuctorial *= i;
            System.out.print(fuctorial + " ");

            int num = fuctorial;
            for (int j = 0; j < 6 - i; j++) {
                if (i % 2 == 0) {
                    System.out.print(++num + " ");
                } else {
                    System.out.print(--num + " ");
                }
            }

            System.out.println();
        }
        
    }
}
