package ru.diana.workingWithArrays.util;

public class ArrayGenerator {
    public static int[] generateRandomArray(int length, int maxNumber) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * (maxNumber + 1));
        }
        return array;
    }
}
