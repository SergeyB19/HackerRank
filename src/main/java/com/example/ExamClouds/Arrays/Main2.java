package com.example.ExamClouds.Arrays;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        String[][] array = {
                {"a1", " a2", "a3", "a4", "a5 ", "a6"},
                {"b1", "b2", "b3", "b4", "b5", "b6"},
                {"c1", "c2", "c3", "c4", "c5", "c6"}
        };
        for (String[] strings : array) {
            System.out.println(Arrays.toString(strings));
        }
        System.out.println();

        String[][] array1 = new String[3][6];
        char symbol = 'a';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                array1[i][j] = symbol + "" + (j + 1);
                System.out.print(array1[i][j] + " ");
            }
            symbol++;
            System.out.println();
        }


    }
}
