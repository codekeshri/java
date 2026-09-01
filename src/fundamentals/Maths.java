package fundamentals;

public class Maths {
    public static void main(String[] args) {
        int n = 189;
        System.out.println(isArmstrongNumber(n));
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
