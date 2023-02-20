package com.hillel.lonzhansky.lessons.lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int[] array = new int[5];

//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        array[3] = 4;
//        array[4] = 5;
//        array[-1] = 6;

//        System.out.println(array);
//        System.out.println(Arrays.toString(array));


//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);

//        System.out.println(array.length);

//        System.out.println(array[array.length - 1]);


//        for (int i = 0; i < array.length; i++) {
//            array[i] = i + 1;
//        }


//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }


//        int[] array = {1, 2, 3, 4, 5};
//        int[] array2 = new int[] {1, 2, 3, 4, 5};
//        int array3 [] = new int[] {1, 2, 3, 4, 5};
//
//        int[] array4;
//        int[] array5 = null;


//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }

//        System.out.println(array5.length);

//        if (array5.length > 0) {
//
//        }

//        if (array5 != null) {
//            System.out.println(array5[0]);
//        }


//   створити масив на 10 елементів та заповнити його випадковими цифрами від 0 до 10
//   вивести на екран в один рядок усі цифри, розділивши їх комою, але у
//   останнього символу не виводити кому

        // 0.9999 * 11 = 10.99999
        // 0.9999 * 10 = 9.99999

//        int[] array = new int[10];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 11);
////            array[i] = (int) Math.round(Math.random() * 10);
//        }
//
//        for (int i = 0; i < array.length; i++) {
////            if (i == array.length - 1) {
////                System.out.print(array[i]);
////            } else {
////                System.out.print(array[i] + ", ");
////            }
//
//            System.out.print(i == array.length - 1 ? array[i] : array[i] + ", ");
//
//        }


/*
     У вбивстві Кеннеді є 10 підозрюваних. Для кожного підозрюваного
     встановлено ймовірність того, що він був убивцею. Всі ці ймовірності
     записані як масив чисел. Написати функцію, яка і визначить
     номер підозрюваного, якого треба ув'язнити.
*/

        // 10, 55, 43, 99, 77, 4, 1, 99, 10

//        int[] array = new int[10];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 101);
//            System.out.print(array[i] + " ");
//        }


////        for (int i = 0; i < array.length; i++) {
////            System.out.print(array[i] + " ");
////       }

//        int max = array[0];
//        int position = 1;
//        for (int i = 1; i < array.length; i++) {
//            if (max < array[i]) {
//                max = array[i];
//                position = i + 1;
//            }
//        }
//
//        System.out.println();
//        System.out.println("chance: " + max + ", position: " + position);




//        int[] numbers = {1, 5, 3, 6, 8, 2, 9};
//        int element = 8;
//        int index = -1;
//
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (element == numbers[i]) {
//                index = i;
//                break;
//            }
//        }
//
//        System.out.println(index);



//        int[] array1 = {1, 5, 3, 6, 8, 2, 9};
//        int[] array2 = new int[array1.length];
//
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = array1[i];
//        }
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println();
//
//        array2[0] = 77;
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));


//        int[] array1 = {1, 5, 3, 6, 8, 2, 9};
//        int[] array2 = Arrays.copyOf(array1, 15);

//        int[] array1 = {1, 5, 3, 6, 8, 2, 9};
//        int[] array2 = Arrays.copyOfRange(array1, 3, array1.length);
//
////
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//        System.out.println();
//
//        array2[0] = 77;
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));

//        int[] array1 = {1, 5, 3, 6, 8, 2, 9};
//        int[] array2 = new int[array1.length];
//        System.arraycopy(array1, 3, array2, 3, 0);
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));





        // Сгенерувати массив на 10 елементів в діапазоні від 35 до 50
        // Запитати число у коривача [35 - 50]
        // Порівняти і повернути індекс якщо співпало значеняя єлемента інакше -1


        // [1, 5, 2, 7, 3, 8, 3]
        // userValue = 7
        // print - 3 (index)

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * (50 - 35 + 1)) + 35);
        }

        System.out.println("Please enter number for search");
        Scanner scanner = new Scanner(System.in);
        int userValue = -1;
        while (true) {
            if (scanner.hasNextInt()) {
                userValue = scanner.nextInt();
                if (userValue < 35 || userValue > 50) {
                    System.out.println("Please enter value from 35 to 50");
                    scanner.nextLine();
                } else {
                    break;
                }
            } else {
                System.out.println("Wrong data! Try again");
                scanner.nextLine();
            }
        }

        System.out.println("array: " + Arrays.toString(array));
        System.out.println("userValue: " + userValue);


        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == userValue) {
                index = i;
                break;
            }
        }

        System.out.println("index: " + index);







    }
}



















































