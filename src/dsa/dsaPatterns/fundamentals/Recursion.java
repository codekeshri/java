package fundamentals;

public class Recursion {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1};
        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int[] arr, int i){
        if(i >= arr.length-1)return true;
        if(arr[i] > arr[i+1])return false;
        return isSorted(arr, i+1);
    }

    static void copyString(String str, char[] newStringArray, int i){
        if(i==str.length())return;
        newStringArray[i]=str.charAt(i);
        copyString(str, newStringArray, i+1);
    }

    static boolean isPalindrome(String s, int start, int end){
        if(start > end)return true;
        if(s.charAt(start) != s.charAt(end))return false;
        return isPalindrome(s, start+1, end-1);
    }

    static boolean isPrime(int n, int i){
        if(n%i == 0)return false;
        if(i*i > n)return true;
        return isPrime(n, i+1);
    }

    static void decimalToBinary(int n){
        if(n==0)return;
        decimalToBinary(n/2);
        System.out.print(n%2);
    }

    static int fact(int n){
        if(n==1 || n==0)return 1;
        return n*fact(n-1);
    }

    static String reverseString1(String str){
        if(str.isEmpty())return "";
        return str.charAt(str.length()-1)+reverseString1(str.substring(0, str.length()-1));
    }

    static String reverseString(String str, int i){
        if(i==0)return "" + str.charAt(0);
        return str.charAt(i) + reverseString(str, i-1);
    }

    static int largestNumber(int[] arr, int i){
        if(i==arr.length-1)return arr[arr.length-1];
        return Math.max(arr[i+1], largestNumber(arr, i+1));
    }

    static int gcd(int a, int b){
        if(b==0)return a;
        return gcd(b, a%b);
    }

    static int sumOfDigits(int n){
        if(n == 0)return 0;
        return n%10 + sumOfDigits(n/10);
    }

    static int countDigits(int n){
        if(n == 0)return 0;
        return 1 + countDigits(n/10);
    }

    static void printArray(int[] arr, int i){
        if(i>=arr.length)return;
        System.out.println(arr[i]);
        printArray(arr, i+1);
    }

    static void printFib(int n){
        int prev = 0;
        int curr = 1;
        System.out.println(prev);
        System.out.println(curr);
        for(int i=2; i<=n; i++){
            int fib = prev + curr;
            System.out.println(fib);
            prev = curr;
            curr = fib;
        }
    }

    static int sum(int n){
        if(n == 0)return 0;
        return n + sum(n-1);
    }

    static int fib(int n){
        if(n<2)return n;
        return fib(n-1)+fib(n-2);
    }
}
