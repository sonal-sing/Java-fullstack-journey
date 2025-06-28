package com.practice.day1;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args){
        int[] arr = {12,9,52,10,5,78,82,100,32,74};
        int k = 3;
        findKthSmallest1(arr,k);
        findKthSmallest2(arr,k);
    }

    static void findKthSmallest1(int[] arr, int k){
        //find kth smallest element by sorting array
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int result = arr[k-1];
        System.out.println(result);
    }

    static void findKthSmallest2(int[] arr, int k){
        //find kth smallest element by using min-heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        //first add all the elements inside the min-heap
        for(int ele:arr){
            minHeap.add(ele);
        }

        //extract the root element of min-heap
        int result = -1;
        for(int i= 0; i<k; i++){
            result = minHeap.poll();
        }

        System.out.println(k+"th smallest element using min heap is "+result);
    }

}
