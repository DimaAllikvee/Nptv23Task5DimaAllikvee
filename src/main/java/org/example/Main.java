package org.example;
import java.util.Arrays;
import java.util.Random;



public class Main {
    public static void main(String[] args) {
        int[][] jaggedArray = {
                {0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        Random random = new Random();


        for (int[] row : jaggedArray) {
            for (int j = 0; j < row.length; j++) {
                row[j] = 50 + random.nextInt(51);
            }
        }


        System.out.println("Несортированный массив:");
        printJaggedArray(jaggedArray);


        for (int[] row : jaggedArray) {
            Arrays.sort(row);
        }


        System.out.println("Сортированный массив:");
        printJaggedArray(jaggedArray);
    }

    private static void printJaggedArray(int[][] array) {
        for (int[] row : array) {   
            System.out.println(Arrays.toString(row));
        }
    }
}