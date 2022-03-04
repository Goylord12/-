package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{10, 2, 10}, {10, 5, 7, 2}};
        int[] array1 = new int[array[0].length];
        int[] array2 = new int[array[1].length];
        for (int i = 0; i < array[0].length; i++){
            array1[i] += array[0][i];
        }
        for (int i = 0; i < array[1].length; i++){
            array2[i] += array[1][i];
        }
        System.out.println("Было");
        System.out.print(Arrays.toString(array1));
        System.out.print(Arrays.toString(array2));

        insertionSort(array1);
        insertionSort(array2);

        System.out.println();
        System.out.println("Стало");
        System.out.print(Arrays.toString((array1)));
        System.out.print(Arrays.toString((array2)));
    }
    public static void insertionSort(int arr[])
    {
        for (int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i-1;

            while ( (j > -1) && ( arr [j] > key ))
            {
                arr [j+1] = arr [j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
