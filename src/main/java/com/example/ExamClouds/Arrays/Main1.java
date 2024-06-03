package com.example.ExamClouds.Arrays;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        double[] array = new double[4];
        for (int i = 0; i < array.length; i++) {
            double d = 1.5;
            array[i] = d;
        }
        System.out.println(Arrays.toString(array));
    }
}
