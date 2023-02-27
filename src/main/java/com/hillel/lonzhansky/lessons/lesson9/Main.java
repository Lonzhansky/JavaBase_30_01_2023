package com.hillel.lonzhansky.lessons.lesson9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        printHello();
//        printHello();
//        printHello();
//        printHello();
//        printHello();


//        String name = "Den";
//
//        printHelloName(name);
//
//        System.out.println(name);
//        printHelloName("Alex");
//        printHelloName("Oleg");
//        printHelloName("Misha");

//        int number = 10;
//        System.out.println("Before method");
//        System.out.println(number);
//        demo1(number);
//        System.out.println("After method");
//        System.out.println(number);


//        int[] array = new int[5];
//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        array[3] = 4;
//        array[4] = 5;
//
//        System.out.println(Arrays.toString(array));
//
//        demo2(array);
//
//        System.out.println(Arrays.toString(array));


//        int result = getSum(10, 5);
//        System.out.println(getSum(10, 5));
//        System.out.println(getSum(10.0, 5));
//        System.out.println(getSum(10, 5, 5));


//        badRecursion();

//        demoRecursion(1);


//        int result = 1;
//        for (int i = 1; i <= 5; i++) {
//            result *= i;
//        }
//        System.out.println(result);

//        System.out.println(getFactorial(5));


        System.out.println(demoEvclide(12, 16));
    }


    static int demoEvclide(int n, int m) {
        if (n == m) {
            return n;
        } else if (n > m) {
            return demoEvclide(n - m, m);
        } else {
            return demoEvclide(n, m - n);
        }
    }


    static int getFactorial(int numberForFactorial) {
        if (numberForFactorial == 1) {
            return 1;
        }
        return numberForFactorial * getFactorial(numberForFactorial - 1);
    }


//    static void demoRecursion(int x) {
//        System.out.println(x);
//        if (x != 5) {
//            demoRecursion(++x);
//        }
//        System.out.println(--x);
//    }

    static void badRecursion() {
        badRecursion();
    }


    static int getSum(int a, int b) {
//        int sum = a + b;
//        return sum;

        return a + b;
    }

    static double getSum(double a, int b) {
        return a + b;
    }

    static double getSum(double a, double b) {
        return a + b;
    }

    static double getSum(int a, double b) {
        return a + b;
    }

    static int getSum(int a, int b, int c) {
        return a + b + c;
    }

    static int getSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }


    static void demo2(int[] qwerty) {
        qwerty[0] = 99;
    }

    static void demo1(int number) {
        System.out.println("-----------");
        System.out.println(number);
        number = 55;
        System.out.println(number);
    }

    static void printHello() {
        System.out.println("Hello World");
    }

    static void printHelloName(String name) {

        name = "qwerty";
        System.out.println("Hello " + name);
    }


//    static int getNumber(Scanner scanner) {
//        while (true) {
//            System.out.println("Please enter N");
//            if (scanner.hasNextInt()) {
//                return scanner.nextInt();
//            } else {
//                System.out.println("Wrong data");
//                scanner.nextLine();
//            }
//        }
//    }

}
