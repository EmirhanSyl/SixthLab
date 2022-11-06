package com.blackflower.sixthlab;

/**
 * @author emirs
 */
public class Question3 {
    public static void main(String[] args) {
        int limit = 150;

        int initNum = 1;
        while (initNum < limit - initNum) {
            initNum = initNum << 1;

        }

        System.out.println("Larger power is: " + initNum);
    }
}
