package com.practice.day1;


public class MaxandMinElement {
    public static void main(String[] args){
        int[] arr = {10,45,9,89,50,41,42,46};
        findMaxElement(arr);
        findMinElement(arr);

    }

    static void findMaxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int e:arr){
          if(e > max)
              max = e;
        }
        System.out.println(max);
    }

    static void findMinElement(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int e:arr){
            if(e < min)
                min = e;
        }
        System.out.println(min);
    }

}
