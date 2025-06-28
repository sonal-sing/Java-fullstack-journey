package com.practice.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args){
        int[] arr = {12,9,52,10,5,78,82,100,32,74};
        int k = 3;
        findKthLargest1(arr,k);
        findKthLargest2(arr,k);
    }

    static void findKthLargest1(int[] arr, int k){
        //find kth Largest element by sorting array
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int result = arr[arr.length-k];
        System.out.println(result);
    }

    static void findKthLargest2(int[] arr, int k){
        //find kth Largest element by using min-heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

        //first add all the elements inside the min-heap
        for(int ele:arr){
            maxHeap.add(ele);
        }

        //extract the root element of min-heap
        int result = -1;
        for(int i= 0; i<k; i++){
            result = maxHeap.poll();
        }

        System.out.println(k+"th largest element using min heap is "+result);
}}
