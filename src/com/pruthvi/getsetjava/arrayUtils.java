package com.pruthvi.getsetjava;

import java.util.Arrays;

public class arrayUtils {
    public static void printArray(int[] arr){
        Arrays.stream(arr).forEach(System.out::println);
    }
}
