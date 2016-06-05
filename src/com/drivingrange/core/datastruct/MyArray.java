package com.drivingrange.core.datastruct;

import java.util.Arrays;

public class MyArray {

    public static void main(String[] args) {
        int n = 100;
        int [] arr = new int[n];
        for(int i = 0, length = arr.length;i < length;i++){
            arr[i] = (int)(Math.random() * n * 2);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        int index = Arrays.binarySearch(arr, (int)(Math.random() * n * 2));
        if(index < 0){
            System.out.print("not found");
        }else{
            System.out.println("found at " + index);
        }
    }

}
