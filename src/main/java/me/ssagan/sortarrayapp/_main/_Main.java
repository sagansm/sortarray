package me.ssagan.sortarrayapp._main;

import me.ssagan.sortarrayapp.model.util.SortArray;

public class _Main {
    public static void main(String[] args) {
        int[] sourceArr = {(int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100)};
        System.out.println("исходный массив:");
        for (int i : sourceArr) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] sortedArr = SortArray.sortArray(sourceArr);

        System.out.println("упорядоченный по возрастанию массив:");
        for (int i : sortedArr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
