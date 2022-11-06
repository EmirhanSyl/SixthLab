package com.blackflower.sixthlab;

public class SixthLab {

    public static void main(String[] args) {
        
    }

    public static void Question1() {

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

    public static void Question2() {
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

    public static void Question3() {
        int limit = 150;

        int initNum = 1;
        while (initNum < limit - initNum) {
            initNum = initNum << 1;

        }

        System.out.println("Larger power is: " + initNum);
    }

    public static void Question4() {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print(j + i);
            }

            System.out.println();
            System.out.println(5 + i);
        }
    }

    public static void Question5() {
        int initNum = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(initNum++ + " ");
            }
            System.out.println("");
        }

    }

    public static void Question6() {
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

    public static void Question7() {
        int num = 432532432;
        int maxDigit = 0;

        while (num > 0) {
            int lastDigit = num % 10;

            maxDigit = (lastDigit > maxDigit) ? lastDigit : maxDigit;
            num /= 10;
        }
        System.out.println(maxDigit);
    }

    public static void Question8() {
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

    public static void Question9() {
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

    public static void Question10() {
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
