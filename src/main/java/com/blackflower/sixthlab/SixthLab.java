package com.blackflower.sixthlab;

public class SixthLab {

    public static void main(String[] args) {
                    
        int a = 0b00101;
        System.out.println(a);
        
        
    }
    
    
    public static void Ex1() {

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

    public static void Ex2() {
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
    
    public static void Ex3(){
        int num = 432532432;
        int maxDigit = 0;
        
        while(num > 0){
            int lastDigit = num % 10;
            
            maxDigit = (lastDigit > maxDigit) ? lastDigit : maxDigit;
            num /= 10;
        }
        System.out.println(maxDigit);
    }
    
    public static void Ex4(){
        int initPoint = 1;
        char initChar = 'a';
        
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                if (i % 2 == 0) {
                    System.out.print(initChar + " ");
                    initChar++;
                }
                else{
                    System.out.print(initPoint + " ");
                    initPoint = initPoint << 1;
                }
                
            }
            System.out.println();
        }
    }
}
