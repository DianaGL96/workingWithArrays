package ru.diana.workingWithArrays.service;

public class OperationWithArrays {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void evenNumbers(int[] array) {
        int countEvenNumbers = 0;
        int countOddNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEvenNumbers++;
            } else {
                countOddNumbers++;
            }
        }
        System.out.println("\nКоличество чётных чисел в массиве: " + countEvenNumbers);
        System.out.println("Количество нечётных чисел в массиве: " + countOddNumbers);
    }

    public static void primeNumbers(int[] array) {
        int countPrimeNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                countPrimeNumbers++;
            }
        }
        System.out.println("Количество простых чисел в массиве: " + countPrimeNumbers);
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void sumNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма всех чисел массива: " + sum);
    }

    public static void differenceSum(int[] array) {
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        int difference = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumEvenNumbers = array[i] + sumEvenNumbers;
            } else {
                sumOddNumbers = array[i] + sumOddNumbers;
            }
            difference = sumEvenNumbers - sumOddNumbers;
        }
        System.out.println("Разность сумм чётных и нечётных чисел в массиве: " + difference);
    }

    public static void countZero(int[] array) {
        int countZero = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == 0) {
                    countZero++;
                }
            }
        }
        System.out.println("Количество нулей в массиве: " + countZero);
    }

    public static void sortArray (int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println("\nУпорядоченный массив: \n");
        printArray(array);
    }
}
