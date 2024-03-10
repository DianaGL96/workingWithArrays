package ru.diana.workingWithArrays.main;

import ru.diana.workingWithArrays.util.Arrays;

import static ru.diana.workingWithArrays.service.OperationWithArrays.*;

public class Main {
    public static void main (String[] args) {
        Arrays array = new Arrays(10, 100);
        array.printArray();
        checkEvenNumbers(array);
        checkPrimeNumbers(array);
        getSumNumbers(array);
        getDifferenceSum(array);
        checkCountZero(array);
        arrangeTheNumbers(array);
    }
}
