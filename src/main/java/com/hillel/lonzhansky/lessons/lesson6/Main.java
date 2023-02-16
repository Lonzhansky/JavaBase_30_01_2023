package com.hillel.lonzhansky.lessons.lesson6;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // CLEAN BUFFER
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please enter number");
//        int number = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("number = " + number);
//
//        System.out.println("Please enter string");
//
//        String str = scanner.nextLine();
//        System.out.println("str = " + str);







//        FOR

//        for(  БЛОК ІНІЦІАЛІЗАЦІЇ ІТЕРАТОРА;
//              БЛОК УМОВИ ВИХОДУ З ЦИКЛУ;
//              БЛОК ЗМІНИ ІТЕРАТОРА (++ або --)
//              )
//              {
//                  код
//              }



//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

//        for (int i = 0, j = 10; i < 10 && j > 5; i++, j--) {
//            System.out.println("i = " + i + ", j = " + j);
//        }


//        for (byte i = 0; ; i++) {
//
//            // БЕСКІНЕЧНИЙ ЦИКЛ
////            if (i > 5) {
////                continue;
////            }
//
//            if (i > 5) {
//                break;
//            }
//
////            if (i == 1 || i == 3) {
////                continue;
////            }
//
//            System.out.println(i);
//        }

//        -- BREAK --
//        ОБРИВАННЯ ВСЬОГО ЦИКЛУ

//        -- CONTINUE --
//        ОБРИВАЄ ПОТОЧНУ ІТЕРАЦІЮ

        
        
//        1)
//        виведення лише парних за допомогою циклу FOR
//        0 2 4 6 8 10 12 14 16 18 20

//        for (int i = 0; i <= 20; i++) {
////            if (i > 20) {
////                break;
////            }
//
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//
//        }
        


//        2)
//        Виведіть на екран перші 11 членів послідовності Фібоначчі
//        1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89


//        int number1 = 1;
//        int number2 = 1;
//        int sum = 0;
//
//        System.out.print(number1 + " " + number2 + " ");
//        for (int i = 0; i < 9; i++) {
//            sum = number1 + number2;
//            System.out.print(sum + " ");
//            number1 = number2;
//            number2 = sum;
//        }





//        WHILE and DO WHILE

//        int i = 0;
//
//        while (true) {
//            if (i > 5) {
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }


//        int i = 10;
//        do {
//            System.out.println("Hello World");
//        } while (i < 1);


//        Scanner scanner = new Scanner(System.in);
//
//        int userValue = -1;
//        while (true) {
//            System.out.println("Please enter integer");
//            if (scanner.hasNextInt()) {
//                userValue = scanner.nextInt();
//                break;
//            } else {
//                System.out.println("Wrong data! Try again");
//                scanner.nextLine();
//            }
//        }

//        do {
//            System.out.println("Please enter integer");
//            if (scanner.hasNextInt()) {
//                userValue = scanner.nextInt();
//                break;
//            } else {
//                System.out.println("Wrong data! Try again");
//                scanner.nextLine();
//            }
//        } while (true);
//
//        System.out.println("userValue = " + userValue);



//        1)
//        a. Зробіть бомбу зі зворотним відліком від 10 до 0 за допомогою циклу WHILE
//        b. додайте до вашої бомби умову, якщо бомба розмінована, вона не вибухне [85 - 100] - win


//        int timer = 10;
//        while (timer >= 0) {
//            int random = (int) (Math.random() * 101);
//            if (random >= 85 && random <= 100) {
//                System.out.println("Bomb has been defuse");
//                break;
//            }
//            System.out.println(timer);
//            if (timer == 0) {
//                System.out.println("BOOOOOOOOOM!");
//            }
//            timer--;
//        }







//        2)
//        Обчислити факторіал числа від 1 до 10 (вводимо з консолі)
//        5! = 1 * 2 * 3 * 4 * 5; 120
//        3! = 1 * 2 * 3; 6


//        Scanner scanner = new Scanner(System.in);
//        int numberForFactorial = -1;
//        System.out.println("Please enter number from 1 to 10 for factorial");
//        while (true) {
//            if (scanner.hasNextInt()) {
//                numberForFactorial = scanner.nextInt();
//                if (numberForFactorial >= 1 && numberForFactorial <= 10) {
//                    break;
//                } else {
//                    System.out.println("Wrong number! Please enter from 1 to 10");
//                }
//            } else {
//                System.out.println("Wrong data! Try again");
//                scanner.nextLine();
//            }
//        }
//        System.out.println("numberForFactorial = " + numberForFactorial);
//
////        5! = 1 * 2 * 3 * 4 * 5; 120
//        int factorial = 1;
//        for (int i = 1; i <= numberForFactorial; i++) {
//            factorial *= i;
//        }
//        System.out.println("factorial = " + factorial);





//        3) Homework
//        У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати
//        100 космічних шатлів для перевезення людей на Марс так, щоб в
//        У номерах шатлів не траплялося нещасливих чисел. Напишіть функцію,
//        яка виводить усі номери таких шатлів.


        // 14 19 40-49 59 90-99
        int counter = 0;
        for (int i = 1; i <= 99; i++) {

            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9) {
                continue;
            }
            System.out.println("shuttle number = " + i);
            counter++;
        }

        System.out.println("count shuttle = " + counter);





    }
}
