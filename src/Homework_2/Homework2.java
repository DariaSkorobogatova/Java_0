package Homework_2;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println(checkSum(15,6));
        System.out.println(checkNumber1(-78));
        System.out.println(checkNumber2(5));
        printString("Beetlejuice", 3);
        System.out.println(CheckIfLeapYear(1992));
    }
    /*Задание 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
     * в противном случае – false*/
    public static boolean checkSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
    /*Задание 2. Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
     * Замечание: ноль считаем положительным числом*/
    public static String checkNumber1(int a) {
        if (a >= 0) {
            return "positive";
        } else {
            return "negative";
        }
    }
    /*Задание 3. Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное*/
    public static boolean checkNumber2(int a) {
        return a <= 0;
    }
    /*Задание 4. Написать метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку, указанное количество раз*/
    public static void printString(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }
    /*Задание 5. Написать метод, который определяет, является ли год високосным,
     * и возвращает boolean (високосный - true, не високосный - false).
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный*/
    public static boolean CheckIfLeapYear(int a) {
        return (a % 4 == 0 && a % 100 != 0 || a % 400==0 );
    }
}
