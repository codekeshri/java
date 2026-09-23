package fundamentals;

public class Sorting {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4};
        insertionSort(arr);
        for(int i: arr) System.out.print(i+" ");
    }

    static void mergeSort(int[] arr){

    }

    static void insertionSortHelper(int[] arr, int j, int key){
        while(j >= 0 && arr[j] > key){
            arr[j+1] = arr[j];
            j--;
        }

        arr[j+1] = key;
    }

    static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j=i-1;
            insertionSortHelper(arr, j, key);
        }
    }

    static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1])swap(arr, j, j+1);
            }
        }
    }

    static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j])swap(arr, i, j);
            }
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
