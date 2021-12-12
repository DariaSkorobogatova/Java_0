package Homework_3;

import java.util.Random;

public class Homework3 {

    public static Random random = new Random();

    public static void main(String[] args) {
    //  Задание 1
    //  Задать целочисленный массив, состоящий из элементов 0 и 1
    //  С помощью цикла и условия заменить 0 на 1, 1 на 0
        int[] arr_1 = new int[random.nextInt(15) + 1];
        for (int i = 0; i < arr_1.length; i++) {
            arr_1[i] = random.nextInt(2);
        }
        System.out.print("Previous: ");
        printArr(arr_1);
        for (int i = 0; i < arr_1.length; i++) {
            if (arr_1[i] == 0) {
                arr_1[i] = 1;
            }
            else {
                arr_1[i] = 0;
            }
        }
        System.out.print("Current : ");
        printArr(arr_1);

        // Задание 2
        // Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100
        int[] arr_2 = new int[100];
        for (int i = 0; i < arr_2.length; i++) {
            arr_2[i] = i + 1;
        }
        printArr(arr_2);

        // Задание 3
        // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньше 6 умножить на 2
        int[] arr_3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr_3.length; i++) {
            if (arr_3[i] < 6) {
                arr_3[i] *= 2;
            }
        }
        printArr(arr_3);

        // Задание 4
        // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        int[][] arr_4 = new int[7][7];
        for (int i = 0; i < arr_4.length; i++) {
            for (int j = 0; j < arr_4[i].length; j++) {
                if (i == j || i == arr_4[i].length - j - 1) {
                    arr_4[i][j] = 1;
                }
            }
        }
        printArr(arr_4);

        // Задание 5
        // Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len,
        // каждая ячейка которого равна initialValue
        printArr(formArr(5, 27));

        // Задание 6
        // Задать одномерный массив и найти в нем минимальный и максимальный значения элементов
        int[] arr_6 = {56, -8, 13, 89, 9, 3, 5, 0, 90};
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr_6.length; i++) {
            if (arr_6[i] < min) {
                min = arr_6[i];
            }
            if (arr_6[i] > max) {
                max = arr_6[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

        // Задание 7
        // Написать метод, в который передается не пустой одномерный целочисленный массив
        // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны
        int[] arr_7 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(equalParts(arr_7));
    }

    // Вывести массив в консоль (перегрузка метода)
    public static void printArr(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + "\t");
        }
        System.out.println();
    }
    public static void printArr(int[][] Array) {
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                System.out.print(Array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // метод, возвращающий массив: длина = len, каждый элемент = initialValue
    public static int[] formArr(int len, int initialValue) {
        if (len <= 0) {
            System.out.println("Введено некорректное значение длины массива. Значение длины массива установлено по умолчанию");
            len = 5;
        }
        int[] arr_5 = new int[len];
        for (int i = 0; i < len; i++) {
            arr_5[i] = initialValue;
        }
        return arr_5;
    }

    // метод, возвращающий true, если в массиве есть место, в котором сумма левой и правой части массива равны
    public static boolean equalParts(int arr[]) {
        int total_sum = 0;
        int left_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            total_sum = arr[i] + total_sum;
        }
        for (int i = 0; i < arr.length; i++) {
            left_sum = arr[i] + left_sum;
            if (left_sum == total_sum - left_sum) {
                return true;
            }
        }
        return false;
    }
}
