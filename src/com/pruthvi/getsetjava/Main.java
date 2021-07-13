package com.pruthvi.getsetjava;

public class Main {


    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");

        int sum = mathOps.getSum(1,2);
        System.out.println(sum);
        int[] table = mathOps.getTable(2,15);
        arrayUtils.printArray(table);

    }
}
