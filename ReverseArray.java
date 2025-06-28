package com.practice.day1;

import java.sql.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {12, 89, 54, 32, 100, 5, 76, 52};
        //reverseArray(arr); //reverse an array using extra array
        reverseArrayWithoutUsingExtraArray(arr);
    }

    static void reverseArray(int[] arr) {
        //reverse an array using extra array
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[(arr.length - 1) - i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    static void reverseArrayWithoutUsingExtraArray(int[] arr) {
        //reverse an array without using extra array
        System.out.println("Original Array "+ Arrays.toString(arr));

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed Array "+ Arrays.toString(arr));
    }
}



