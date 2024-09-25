package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[5][];
        jaggedArray[0] = new int[3];
        jaggedArray[1] = new int[5];
        jaggedArray[2] = new int[7];
        jaggedArray[3] = new int[8];
        jaggedArray[4] = new int[9];

        Random random = new Random();


        for (int[] row : jaggedArray) {
            for (int j = 0; j < row.length; j++) {
                row[j] = 50 + random.nextInt(51);
            }
        }

        System.out.println("Несортированный массив:");
        printJaggedArray(jaggedArray);



        int totalLength = 0;
        for (int[] row : jaggedArray) {
            totalLength += row.length;
        }
        int[] flatArray = new int[totalLength];
        int index = 0;


        
        for (int[] row : jaggedArray) {
            for (int num : row) {
                flatArray[index++] = num;
            }
        }


        Arrays.sort(flatArray);


        System.out.println("\nСортированный массив:");
        System.out.println(Arrays.toString(flatArray));
    }


    private static void printJaggedArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
