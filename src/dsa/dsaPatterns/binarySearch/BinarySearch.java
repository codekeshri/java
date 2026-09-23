package binarySearch;

import fundamentals.Array;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int ans = searchInRotatedSortedArrayOLogN(arr, 6);
        System.out.println(ans);
    }

    /**
     * 1. if target found return
     * 2. else check which half target will belong arr[mid] > arr[start] right half
     * 3. now check target with array mid to apply binary search in this half
     */
    static int searchInRotatedSortedArrayOLogN(int[] arr, int target){
        int start = 0, n = arr.length, end = n-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] >= arr[start]){  // left side
                if(target > arr[mid]) start = mid+1;
                else end = mid-1;

            }else{
                if(target < arr[mid]) end = mid-1;
                else start = mid+1;
            }
        }
        return -1;
    }

    static int searchInRotatedSortedArray(int[] arr, int target){
        int n = arr.length;
        int[][] nums = new int[n][2];
        for(int i=0; i<n; i++) {
            nums[i][0] = arr[i];
            nums[i][1] = i;
        }

        Arrays.sort(nums, (a, b)-> Integer.compare(a[0], b[0]));

        int start = 0, end = n-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid][0] == target)return  nums[mid][1];
            else if(nums[mid][0] > target) mid = end -1;
            else start = mid+1;
        }
        return -1;

    }

    static int binarySearchMain(int[] arr, int target){
        int start = 0, end = arr.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target)return mid;
            else if(target > arr[mid])start = mid+1;
            else end = mid-1;
        }
        return -1;
    }
}
