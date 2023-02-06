package com.hillel.lonzhansky.lessons.lesson2;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        byte age;
        age = 25;

        byte age2 = 27;

        System.out.println(age);
        System.out.println(age2);


        byte someByteVariable = 1;
        System.out.println(someByteVariable);


        short length = 32000;
        int someIntVariable = 2000111222;
        long someLongVariable = 4353453453453453455L;


        float floatVariable = 10.1234567890123456789F;
        double doubleVariable = 10.1234567890123456789;

        System.out.println();
        System.out.println();

        System.out.println(floatVariable);
        System.out.println(doubleVariable);


        System.out.println();
        System.out.println();
        System.out.println();

        char charA1 = 'A';
        char charA2 = 65;
        char charA3 = '\u263A';

        System.out.println(charA1);
        System.out.println(charA2);
        System.out.println(charA3);


        boolean isCircle = false;

        System.out.println(isCircle);


        byte byteVariable = 22;
        short shortVariable = byteVariable;


//        short shortVariable = 22;
//        byte byteVariable = shortVariable;

        System.out.println();
        System.out.println();

        System.out.println(byteVariable);
        System.out.println(shortVariable);


        System.out.println();

        char charA = 'A';

        int charToInt = charA;

        System.out.println(charToInt);


        long longVariable = byteVariable;
        System.out.println(longVariable);


        int intVariable = 99;
        double intToDouble = intVariable;

        System.out.println();
        System.out.println(intToDouble);


        int intCountWheels = 500;
        byte byteCountWheels = (byte) intCountWheels;

        System.out.println(byteCountWheels);


        int xxx = byteCountWheels;
        System.out.println(xxx);


        double volume = 55.23432432;
        int volumeInt = (int) volume;

        System.out.println(volumeInt);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        int a = 20;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);

//        System.out.println(22 + 10);
//        System.out.println(22 - 10);
//        System.out.println(22 / 10);
//        System.out.println(22 * 10);


        System.out.println();
        System.out.println(10 / 3);  // 3.333333 -> cast to int: (int) 3.333333 -> result = 3
        System.out.println(10 / (double) 3);
        System.out.println((double) 10 / 3);
        System.out.println((double) 10 / (double) 3);
        System.out.println(10 / 3.0);


        a = 55;
        System.out.println(a);


        int result = a + b;

        System.out.println(result);


        // ------------------------------ //

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        String str = "Hello World";
        String str2 = ", Java Best";

        System.out.println(str + 20 + 10);
        System.out.println(20 + 10 + str);

        System.out.println();
        System.out.println();
        System.out.println();


        int x = 41;
        int y = 30;
        char ch = '\u00B0';
        System.out.println("Big Ben coordinates:");
        System.out.println("DMS Lat: " + x + "° " + y + "' 37.2852'' N");
        System.out.println("DMS Long: 0° 7' 0.3828'' W");


    }
}
