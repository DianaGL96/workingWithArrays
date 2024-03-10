package ru.diana.workingWithArrays.util;

public class Arrays {
    private int[] arr;

    public Arrays(int length, int maxNumber) {
        this.arr = generateRandomArray(length, maxNumber);
    }

    public int[] getArr() {
        return arr;
    }

    private int[] generateRandomArray(int length, int maxNumber) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * (maxNumber + 1));
        }
        return array;
    }

    public void printArray() {
        for (int i = 0; i < arr.length; System.out.println(arr[i++])) {
        }
    }
}
