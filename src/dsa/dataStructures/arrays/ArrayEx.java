package com.arvind.dataStructures.arrays;

public class ArrayEx {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5 ,5, 6};
        leftRotate(arr, 3);
        for(int i: arr) System.out.print(i+" ");

    }

    static void leftRotate(int[] arr, int k){
        int n = arr.length;
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }

    static void rightRotate(int[] arr, int k){
        int n = arr.length;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);

    }

    static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}


