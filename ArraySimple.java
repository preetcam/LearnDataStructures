package com.udemy.datastructures.arrays;

import java.util.Arrays;

/**
 * Arrays
 * 1: Print array
 * 2: Reverse Array
 * 3: Length of array
 * 4: Sort an array
 *
 */
public class ArraySimple {
    public static void main(String[] args) {
        // Initialize array
        int arr[]= {12,13,5,15,20};

        // Print array
        System.out.print("Array : ");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Reverse array
        System.out.print("Reverse Array : ");
        for(int i=arr.length-1; i>= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Length of array
        System.out.println("Length of array : "+ arr.length);

        //Arrays inbuilt sort method :  Sorted array
        Arrays.sort(arr);
        System.out.print("Sorted array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
