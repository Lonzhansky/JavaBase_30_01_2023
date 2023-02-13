package com.hillel.lonzhansky.lessons.lesson5;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int a = 10;
//        int b = 7;
//        int c = 5;

//        System.out.println(a > b);
//        System.out.println(a >= b);
//        System.out.println(a < b);
//        System.out.println(a <= b);

//        System.out.println(a == b);
//        System.out.println(a != b);


//        System.out.println( a > b && b < c );
//        System.out.println( a < b || b < c );

//        boolean someBoolean = a > b;
//
//        System.out.println(10 > 5 && 50 > 20 && 30 < 55 && true && someBoolean);
//
//        System.out.println(10 > 5 || 50 > 20 && 30 < 55 && false && someBoolean);


//        System.out.println(10 > 20 && (20 < 30 || true));


//        int a = 10;
//        int b = 5;
//
//        System.out.println(a < b && ++b == 5);  // false
//
//        System.out.println("a = " + a);  // 10
//        System.out.println("b = " + b);  // 5


        // --------------------------- //

//        int a = 10;
//        int b = 15;

//        if (a > b) {
//            System.out.println("a > b");
//        }


//        if (a > b) {
//            System.out.println("a > b");
//        } else {
//            System.out.println("a <= b");
//        }


//        if (a > b) {
//            System.out.println("a > b");
//        } else if (a == b) {
//            System.out.println("a == b");
//        } else {
//            System.out.println("a < b");
//        }


//        int x = 15;
//
//        if (x == 1) {
//            System.out.println("1");
//        } else if (x == 2) {
//            System.out.println("2");
//        } else if (x == 3) {
//            System.out.println("3");
//        } else if (x == 4) {
//            System.out.println("4");
//        } else if (x == 5) {
//            System.out.println("5");
//        }


//        int a = 10;
//        int b = 10;

//        if (a <= b) {
//            System.out.println("a <= b");
//
//            if (a == b) {
//                System.out.println("a == b");
//                if (a == b) {
//                    System.out.println("a == b");
//                }
//            } else {
//                System.out.println("a < b");
//            }
//
//        } else {
//            System.out.println("a > b");
//            if (true) {
//                System.out.println("sdgsdgsdg");
//            }
//            if (false) {
//                System.out.println("fgdfgfdgd");
//            }
//        }


//        int a = 10;
//        int b = 5;
//
//        if (a >= b) {
//            System.out.println("a >= b");
//        } else {
//            System.out.println("a < b");
//        }
//
//        // умова ? вираз1 : вираз2
//        System.out.println(a >= b ? "a >= b" : "a < b");
//
//
//        if (a <= b) {
//            if (a == b) {
//                System.out.println("a == b");
//            } else {
//                System.out.println("a < b");
//            }
//        } else {
//            System.out.println("a < b");
//        }
//
//
//        System.out.println(a <= b ? a == b ? "a == b" : "a < b" : "a < b");


//        int a = 14;
//        int b = 11;
//
//        System.out.println(Integer.toBinaryString(a));
//        System.out.println(Integer.toBinaryString(b));
//
//        System.out.println(Integer.toBinaryString(a | b));
//        System.out.println(a | b);



        // --------------------------- //

//        int a = 10;

//        if (a == 1) {
//            System.out.println("1");
//        } else if (a == 2) {
//            System.out.println("2");
//        } else if (a == 3) {
//            System.out.println("3");
//        } else if (a == 4) {
//            System.out.println("4");
//        } else {
//            System.out.println("default");
//        }


//        switch (a) {
//            case 1 : {
//                System.out.println("1");
//                break;
//            }
//            case 2 : {
//                System.out.println("2");
//                break;
//            }
//            case 3 : {
//                System.out.println("3");
//                break;
//            }
//            case 4 : {
//                System.out.println("4");
//                break;
//            }
//            case 5 : {
//                System.out.println("5");
//                break;
//            }
//            default: {
//                System.out.println("default");
//                break;
//            }
//        }



//        String str = "qwerty";
//        String str2 = "qwerty";
//        String str3 = new String("QWERTY");


//        System.out.println(str == str2);
//        System.out.println(str == str3);
//
//        System.out.println();
//        System.out.println();
//
//        System.out.println(str.equals(str2));
//        System.out.println(str.equalsIgnoreCase(str3));


//        switch (str) {
//            case "A" : {
//                System.out.println("1");
//                break;
//            }
//            case "B" : {
//                System.out.println("2");
//                break;
//            }
//            case "C" : {
//                System.out.println("3");
//                break;
//            }
//            case "qwerty" : {
//                System.out.println("qwerty");
//            }
//        }


        Scanner scanner = new Scanner(System.in);

        // BAD VERSION!!!!!!!!!!!!!!!!
//        System.out.println("Please enter number");
//        int number = scanner.nextInt();
//        System.out.println("your number: " + number);

        int number = -1;
        int number2 = -1;

        String team1Name = "NaVi";

        System.out.println("Please enter number");
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }

        if (scanner.hasNextInt()) {
            number2 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }

        System.out.println("your number: " + number);
        System.out.println("your number2: " + number2);


    }
}
