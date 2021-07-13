package com.pruthvi.getsetjava;

public class mathOps {
    static int DEFAULT_LIMIT=10;
    public static int getSum(int a,int b){
        return a+b;
    }
    public static int getDiff(int a,int b){
        return a-b;
    }
    public static int getMul(int a,int b){
        return a*b;
    }
    public static int getDiv(int a,int b){
        return a/b;
    }
    public static int getRem(int a,int b){
        return a%b;
    }
    public static int[] getTable(int num){
        return  getTable(num,DEFAULT_LIMIT);
    }
    public static int[] getTable(int num,int limit){
        int[] table = new int[limit];
        for(int i=0;i<limit;i++){
            table[i]=getMul(num,(getSum(i,1)));
        }
        return table;
    }
}