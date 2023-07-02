package me.ssagan.sortarrayapp.model.util;

public class SortArray {
    public static int[] sortArray(int[] sourceArray) {
        for (int i = 0; i <= (sourceArray.length - 2); i++) {
            for (int j = 0; j <= (sourceArray.length - 2 - i); j++) {
                if (sourceArray[j] > sourceArray[j + 1]) {
                    //поменяем местами
                    int max = sourceArray[j];
                    sourceArray[j] = sourceArray[j + 1];
                    sourceArray[j + 1] = max;
                }
            }
        }
        return sourceArray;
    }
}
