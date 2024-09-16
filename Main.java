package org.example;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSigh();
        printColor();
        compareNumbers();
        checkSumNumbers();
        possitiveNumber();
        negativeNumber();
        definitionYear();
        printArray();
        printArray2();
        printArray3();
        retLenArr();
    }

// В Заданиях 8 и 13 у вообще не было никаких идей.

// 1. Создайте метод printThreeWords().

    public static void printThreeWords() {
        String ThreeWords = "Orange, Banana, Apple";
        System.out.println("Orange, Banana, Apple");
    }

// 2. Создайте метод checkSumSigh().

    public static void checkSumSigh() {
        int a = 1;
        int b = 2;
        int c = (a + b);
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

// 3. Создайте метод printColor().

    public static void printColor() {
        int value = 1;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else if (value >= 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Ни одно из условий не сработало");
        }
    }

// 4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b

    public static void compareNumbers() {
        int a = 5;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5. Напишите метод. Принимающий на вход два числа, и проверяющий что их сумма лежит
//в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false.
    public static void checkSumNumbers() {
        int a = 6;
        int b = 8;
        int c = a + b;
        if (c > 10 && c < 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    // 6. Напишите метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.
    public static void possitiveNumber() {
        int a = 0;
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    // 7. Напишите метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное
// Замечание: ноль считаем положительным числом.
    public static void negativeNumber() {
        int a = 0;
        if (a >= 0) {
            System.out.println("Число " + a + " отрицательное");
        } else {
            System.out.println("Число " + a + " положительное");
        }
    }

// 8. Напишите метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, указанное количество раз;


    // 9. Напишите метод, который определяет, является ли год високосным,
// и возвращает boolean (високосный - true, не високосный - false).
// Каждый 4-й год является високосным, кроме каждого 100-го, при это каждый 400-й - високосный
    public static void definitionYear() {
        int year = 4;
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            System.out.println(year + " г. не високосный");
        } else {
            System.out.println(year + " г. високосный");
        }
    }

// 10. Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [1,1,0,0,1,0,1,1,0,0]. С помощью цикла и условия заменить 0 на 1,1 на 0;

    public static void printArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("arr.lengtn: " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
            System.out.println(arr[i]);
        }
    }


    // 11. Задать пустой целочисленный массив длиной 100.
// С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100
    public static void printArray2() {
        for (int i = 0; i < 101; i++) {
            System.out.println("i = " + i);
        }
    }

    // 12. Задать массив [1,5,3,2,11,4,5,2,4,8,9,1] пройти по нему циклом,
// и числа меньше 6 умножить на 2;
    public static void printArray3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("arr.lengtn: " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
                System.out.println(arr[i]);
            }
        }
    }


    // 13. Создать квадратный двумерный целочисленный массив


// 14. Написать метод, принимающий на вход два аргумента; len и initialValue,
// и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue

    public static void retLenArr() {
        int len = 5;
        int initialValue = 10;
        int[] resultArray = createArray(len, initialValue);
        System.out.println("Массив");
        for (int num : resultArray) ;
        System.out.println(len + " ");
    }

    private static int[] createArray(int len, int initialValue) {
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++) {
            newArray[i] = initialValue;
        }
        return newArray;
    }


}