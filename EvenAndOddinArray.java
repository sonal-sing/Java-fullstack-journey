package com.practice.day1;

import java.util.Scanner;

public class EvenAndOddinArray {
    private int[] arr;

    //take input array
    public void readElements() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the "+n+" elements");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
    }

    public void printEvenElements(){
        for(int ele:arr){
            if(ele%2 == 0){
                System.out.print(ele+" ");
            }
        }
    }

    public void printOddElements(){
        for(int ele:arr){
            if(ele%2 != 0){
                System.out.print(ele+" ");
            }
        }
    }

}

class Main{
    public static void main(String[] args){
        EvenAndOddinArray o = new EvenAndOddinArray();
        o.readElements();
        o.printEvenElements();
        System.out.println();
        o.printOddElements();

    }
}