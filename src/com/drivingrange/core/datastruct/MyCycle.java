package com.drivingrange.core.datastruct;

public class MyCycle {

    public static void main(String[] args) {
        int [] arr = new int[100];
        String [] strs = new String[10];
        for(int i = 0, length = arr.length; i < length; i++){
            arr[i] = i * i;
        }
        for(int i = 0, length = strs.length; i < length; i++){
            strs[i] = String.format("string %d", i);
        }

        for(int item : arr){
            System.out.println(item);
        }

        for(String item : strs){
            System.out.println(item);
        }

        for(String item : args){
            System.out.println(item);
        }
    }
}
