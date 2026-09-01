package fundamentals;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arr = input();
        secondMaximum(arr);
    }

    static int[] input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        return arr;
    }

    static void secondMaximum(int[] arr){
        int largest = arr[0];
        int secondLargest = -1;

        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
