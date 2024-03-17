package ru.diana.workingWithArrays.main;
import ru.diana.workingWithArrays.util.ArrayGenerator;
import static ru.diana.workingWithArrays.service.OperationWithArrays.*;

public class Main {
    public static void main (String[] args) {
        int[] array = ArrayGenerator.generateRandomArray(10, 100);
        printArray(array);
        evenNumbers(array);
        primeNumbers(array);
        sumNumbers(array);
        differenceSum(array);
        countZero(array);
        sortArray(array);
    }
}
