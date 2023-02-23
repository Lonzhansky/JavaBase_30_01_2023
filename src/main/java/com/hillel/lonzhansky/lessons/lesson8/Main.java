package com.hillel.lonzhansky.lessons.lesson8;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


////        Створення масиву i заповненя значеннями
//        int[][] array = {
//                {1, 2, 3},  //00, 01, 02
//                {2, 3, 4},  //10, 11, 12
//                {5, 6, 7},   //20, 21, 22
//                {1, 2, 4}   //20, 21, 22
//        };
//
////         Довжина масиву + кiлькiсть стовбцiв
//        System.out.println(array.length);
//        System.out.println(array[0].length);
//        System.out.println(array[1].length);
//        System.out.println(array[2].length);
//        System.out.println(array[3].length);



//        int[][] array = {
//                {1},
//                {2, 3, 4},
//                {5},
//                {1, 2, 4, 5, 3},
//                {},
//                {2, 3, 4, 5}
//        };
//
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }





////        int[][][] array = new int[3][2][4];
//        int[][][] array = {
//                {
//                        {18, 28, 18, 28},
//                        {45, 90, 45, 0}
//                },
//                {
//                        {7, 125, 500, 5},
//                        {0, 11, 25, 30}
//                },
//                {
//                        {81, 17, 19, 55},
//                        {1, 7, 38, 11}
//                }
//        };
//
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                for (int k = 0; k < array[i][j].length; k++) {
//                    System.out.print(array[i][j][k] + " ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }


        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Before");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }



        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        System.out.println();
        System.out.println("After");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }




//        int[][] array1 = new int[n][m];
//        int[][] array2 = new int[m][n];
//
//        int[][] array1 = new int[3][5];
//        int[][] array2 = new int[5][3];




    }


    static void task2() {
        // Створити масив розміром 5x5. Заповнити масив за допомогою циклу таким
// чином, щоб одиниця у кожному рядку зміщувалась вправо:

//      1 0 0 0 0       00
//      0 1 0 0 0       11
//      0 0 1 0 0       22
//      0 0 0 1 0       33
//      0 0 0 0 1       44

//      0 0 0 0 1       04  = 4
//      0 0 0 1 0       13  = 4
//      0 0 1 0 0       22  = 4
//      0 1 0 0 0       31  = 4
//      1 0 0 0 0       40  = 4


        int[][] array = new int[5][5];

        //version 1
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (i == j) {
//                    array[i][j] = 1;
//                }
//            }
//        }

//        version 2
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }


        //version 1
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (i + j == array.length - 1) {
//                    array[i][j] = 1;
//                }
//            }
//        }

        //version 2
//        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
//            array[i][j] = 1;
//        }

        //version 3
        for (int i = 0; i < array.length; i++) {
            array[i][array.length - i - 1] = 1;
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    static void task1() {
        //      За допомогою циклів створити шахівницю 8х8 виду:
//
//      B W B W B W B W     00, 02, 04, 06  = 0, 2, 4, 6
//      W B W B W B W B     11, 13, 15, 17  = 2, 4, 6, 8
//      B W B W B W B W     20, 22, 24, 26  = 2, 4, 6, 8
//      W B W B W B W B
//      B W B W B W B W
//      W B W B W B W B
//      B W B W B W B W
//      W B W B W B W B

        char[][] chessBoard = new char[8][8];

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
//                if ((i + j) % 2 == 0) {
//                    chessBoard[i][j] = 'B';
//                } else {
//                    chessBoard[i][j] = 'W';
//                }

                chessBoard[i][j] = ((i + j) % 2 == 0) ? 'B' : 'W';

            }
        }


        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }


    static void demo1() {
        int[][] array = new int[2][3];

//        System.out.println(array.length);
//        System.out.println(array[0].length);
//        System.out.println(array[1].length);

//        array[0][0] = 1;
//        array[0][1] = 2;

        int number = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = number;
                number++;
            }
        }

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }


        System.out.println(Arrays.deepToString(array));
    }


    static void demoSort() {
        int[] array = {5, 2, 6, 2, 1, 8, 9, 4, 2, 1, 5, -2, 99, -5};

        int counter = 0;
        System.out.println("Before:");
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
//        Arrays.sort(array, Collections.reverseOrder());


//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                counter++;
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
        System.out.println("After");
        System.out.println(Arrays.toString(array));
//
//        System.out.println("counter = " + counter);
    }


    static void demo() {
        // O(N)
        for (int i = 0; i < 100; i++) {

        }


        // O(N^2)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {

            }
        }

        // O(N^3)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {

                }
            }
        }

        // O(N) + O(N^2) +  O(N^3) = O(N^3)
    }
}
