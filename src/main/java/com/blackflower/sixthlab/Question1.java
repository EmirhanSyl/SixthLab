package com.blackflower.sixthlab;

/**
 * @author emirs
 */

public class Question1 {
    public static void main(String[] args) {
        int num = -4; //0100
        int zeroCount = 0;

        // while num > 0 
        //      if num & 2 = 0
        //          zeroCount++
        //      num << 1
        while (num > 0) {
            if ((num & 1) == 0) {
                zeroCount++;
            }

            num = num >> 1;
        }

        System.out.println(zeroCount);
    }
}
