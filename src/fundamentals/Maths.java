package fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        findDivisors(100);
    }

    /**
     * 1: every number is divisible by 1
     * 2: last digit is even
     * 3: sum of digits divisible by 3
     * 4: last two digits divisible by 4
     * 5: last digit 0 or 5
     * 6: divisible by both 2 and 3
     * 7: double last digit, subtract from remaining number
     * 8: last 3 digits divisible by 8
     * 9: sum of digits divisible by 9
     * 10: last digit 0
     * 11: alternating digit sum is divisible by 11
     * 12: divisible by both 3 and 4
     * 13: less common
     * 14: divisible by 7 and 2 and so on...
     * @param n number
     */
    static void findDivisors(int n){
        for(int i=2; i*i<=n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                if(i != n/i) System.out.println(n/i);
            }
        }

    }

    static boolean[] sievePrimes(int n){
        boolean[] primeArray = new boolean[n+1];
        Arrays.fill(primeArray, true);
        primeArray[0] = false;
        primeArray[1] = false;
        for(int i=2; i<=n; i++)if(primeArray[i] && !isPrimeSqrt(i))primeArray[i] = false;
        return primeArray;
    }

    static boolean isPrimeSqrt(int n){ // O(sqrt(n))
        if(n < 2) return  false;
        for(int i=2; i*i<= n; i++){
            if(n%i == 0) return false;
        }
        return  true;
    }

    static boolean isPrime(int n){  // O(n)
        if(n < 2) return  false;
        for(int i=2; i< n; i++){
            if(n%i == 0)return  false;
        }
        return  true;
    }

    static boolean isCoPrime(int a, int b){
        return  euclideanAlgorithmToFindGCD(a, b) == 1;
    }

    static int lcm(int a, int b){
        int k = euclideanAlgorithmToFindGCD(a, b);
        return a*b/k;
    }

    /**
     * 1. divide a by b
     * 2. next divide b by remainder till remainder is 0
     * @param a first number
     * @param b second number
     * @return gcd of a and b
     */
    static int euclideanAlgorithmToFindGCD(int a, int b){
        while(b != 0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }

    static int count1InAllPositiveIntegersLessThanOrEqualToN(int n){
        int count = 0;
        for(int i=n; i>0; i--){
            int num = i;
            while(num > 0){
                int k = num%10;
                if(k==1)count++;
                num /= 10;
            }
        }
        return count;
    }

    static int trailingZerosInFactorial(int n){  // idea: it will come from 5*2 and factors of 2 always greater than of 5.
        int count = 0;
        while(n>0){
            n /= 5;
            count++;
        }
        return count;
    }

    static boolean isArmstrongNumber(int n){
        int temp = n;
        int sum = 0;
        int numberOfDigits = 0;
        while(temp > 0) {
            n /= 10;
            numberOfDigits++;
        }
        temp = n;

        while(temp > 0){
            sum += Math.pow(n%10, numberOfDigits);
            n /= 10;
        }

        return  sum == n;
    }

    static int reverseNumber(int n){
        int ans = 0;
        boolean isNegative = n < 0;
        n = Math.abs(n);
        while(n > 0){
            ans = ans*10 + n%10;
            n /= 10;
        }
        return isNegative ? -ans : ans ;
    }

    static int digitSum(int n){
        int sum = 0;
        n = Math.abs(n);
        while(n > 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}
