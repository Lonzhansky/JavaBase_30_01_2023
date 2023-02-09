package com.hillel.lonzhansky.lessons.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int a = 10;
//        int b = 3;

//        double result = a / b;


//        System.out.println(a % b);  //10 / 3 = 3; 3 * 3 = 9 -> 10 - 9 = 1
//        System.out.println(10 % 1);  // 0
//        System.out.println(10 % 2);  // 0
//        System.out.println(10 % 3);  // 1
//        System.out.println(10 % 4);  // 2
//        System.out.println(10 % 5);  // 0
//        System.out.println(10 % 6);  // 4
//        System.out.println(10 % 7);  // 3
//        System.out.println(10 % 8);  // 2
//        System.out.println(10 % 9);  // 1
//        System.out.println(10 % 10); // 0


//        int x = 10;
////        x = x + 5;
//
//        x += 5;
//        x -= 5;
//        x /= 5;
//        x *= 5;
//        x %= 5;
//
//
//        System.out.println(x);


//        int x = 10;
//
////        x = x + 1;
////        x += 1;
//
////        x++;
//
//        System.out.println(x--);
//
//        System.out.println(x);



//        int x = 10;
//        int y = 5;
//
////
//        System.out.println(++y - x++ + x++ - --y);      // 2
//        System.out.println(x);                          // 12
//        System.out.println(y);                          // 5


//        System.out.println(Math.abs(10));
//        System.out.println(Math.abs(-10));
//
//
//        System.out.println(Math.pow(5.01, 2.45));
//
//        System.out.println(Math.sqrt(13.454545));
//        System.out.println(Math.sqrt(25.5454));
//
//
//        System.out.println(Math.round(10.499999999));
//        System.out.println(Math.round(10.55));
//        System.out.println(Math.round(10.9));


//        System.out.println(Math.random()); // [0, 1) -> 0 ....0.99999999999999999999999999999999
//
//        System.out.println(Math.random() * 1000);
//
//        double random = Math.random() * 10;  // 0*10 = 0, 0.99999 * 10 = 9.99999999
//        int result = (int) Math.round(random);
//        System.out.println(result);
//
//
//        System.out.println((int) (Math.random() * 11)); // 10.999999 -> int 10


        // 15 - 30

//        int min = 15;
//        int max = 30;
//
//
//        System.out.println(15 + (int) (Math.random() * 16));
//        System.out.println(min + (int) (Math.random() * (max - min + 1)));


////        Дано: зарплати трьох працівників за 1 місяць (a, b, c)
////        Розрахувати:
////        1. для кожного працівника суму зарплати за 10 років
////        2. відняти 5% податок
////        3. порахувати середнє арифметичне за трьома сумами за 10 років
////        4. вивести суми зарплат за 10 років з урахуванням вирахування податків та
////        середнє арифм.
//
//
//        int employee1 = 700;
//        int employee2 = 1500;
//        int employee3 = 3500;
//
//        int monthAndYears = 10 * 12;
//
//        int salaryEmployee1for10Years = employee1 * monthAndYears;
//        int salaryEmployee2for10Years = employee2 * monthAndYears;
//        int salaryEmployee3for10Years = employee3 * monthAndYears;
//
//        System.out.println("ЗП за 10 років для працівника 1: " + salaryEmployee1for10Years);
//        System.out.println("ЗП за 10 років для працівника 2: " + salaryEmployee2for10Years);
//        System.out.println("ЗП за 10 років для працівника 3: " + salaryEmployee3for10Years);
//
//        double salaryEmployee1for10YearsWithoutTax = salaryEmployee1for10Years * 0.95;
//        double salaryEmployee2for10YearsWithoutTax = salaryEmployee2for10Years * 0.95;
//        double salaryEmployee3for10YearsWithoutTax = salaryEmployee3for10Years * 0.95;
////        double salaryEmployee3for10YearsWithoutTax = salaryEmployee3for10Years - salaryEmployee3for10Years * 0.05;
//
//        System.out.println();
//        System.out.println("ЗП за 10 років для працівника 1 в виключенням податків: " +salaryEmployee1for10YearsWithoutTax);
//        System.out.println("ЗП за 10 років для працівника 2 в виключенням податків: " +salaryEmployee2for10YearsWithoutTax);
//        System.out.println("ЗП за 10 років для працівника 3 в виключенням податків: " +salaryEmployee3for10YearsWithoutTax);
//
//
//        double avgSalary = (salaryEmployee1for10Years + salaryEmployee2for10Years + salaryEmployee3for10Years) / 3.0;
//
//        System.out.println("Cереднє арифметичне за трьома сумами за 10 років: " + avgSalary);


        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter some string");
//        String str = scanner.nextLine();
//        String str2 = scanner.nextLine();
//        String str3 = scanner.nextLine();
//        String str4 = scanner.nextLine();
//
//        System.out.println("str = " + str);
//        System.out.println("str2 = " + str2);
//        System.out.println("str3 = " + str3);
//        System.out.println("str4 = " + str4);


        System.out.println("Please enter some integer");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

//        System.out.println("Please enter some string");
//        String str = scanner.nextLine();
//        System.out.println("str = " + str);

    }
}
