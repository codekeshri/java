package twoPointers;

public class TwoPointer {

    public static void main(String[] args) {
        int[] arr = {4, 2, 0, 3, 2, 5};
        int ans = trappingRainwaterWithTwoPointerPattern(arr);
        System.out.println(ans);
    }

    /**
     * Time: O(n)
     * Space: O(1)
     */
    static int trappingRainwaterWithTwoPointerPattern(int[] arr){
        int start = 0, n = arr.length, end = n-1;
        int leftMax = 0, rightMax = 0, amount = 0;
        while(start <= end){
            if(arr[start] <= arr[end]){
                if(arr[start] <= leftMax) amount += leftMax - arr[start];
                else leftMax = arr[start];
                start++;
            }else{
                if(arr[end] <= rightMax) amount += rightMax - arr[end];
                else rightMax = arr[end];
                end--;
            }
        }
        return amount;
    }

    /**
     * Time: O(n)
     * Space: O(n)
     */
    static int trappingRainwaterWithPrefixSuffixMaxPattern(int[] arr){
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        int maxLeftBar = 0;
        for(int i=0; i<n; i++){
            if(arr[i] > maxLeftBar){
                maxLeftBar = arr[i];
            }
            left[i] = maxLeftBar;
        }

        int maxRightBar = 0;
        for(int i=n-1; i>=0; i--){
            if(arr[i] > maxRightBar) {
                maxRightBar = arr[i];
            }
            right[i]=maxRightBar;
        }

        int amount = 0;
        for(int i=0; i<n; i++){
            amount += Math.min(left[i], right[i]) - arr[i];
        }

        return amount;
    }

    /**
     * Time: O(n^2)
     * Space: O(1)
     */
    static int trappingRainwaterBruteOptimized(int[] arr){
        int amount = 0, n=arr.length;

        for(int i=0; i<n; i++){
            int leftMax = 0, rightMax = 0;

            for(int j=i+1; j<n; j++){
                if(arr[j] > rightMax) rightMax = arr[j];
            }

            for(int j=0; j<i; j++){
                if(arr[j] > leftMax) leftMax = arr[j];
            }

            amount += Math.min(leftMax, rightMax) - arr[i];
        }

        return amount;
    }

    /**
     * Time: O(n^2)
     * Space: O(n)
     */
    static int trappingRainwaterBrute(int[] arr){
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j] > arr[i]){
                    right[i] = Math.max(right[i], arr[j]);
                }
            }
        }

        for(int i=n-1; i>=1; i--){
            for(int j= i-1; j>=0; j--){
                if(arr[j] > arr[i]){
                    left[i] = Math.max(left[i], arr[j]);
                }
            }
        }

        int amountOfWaterTrapped = 0;
        for(int i=1; i<n-1; i++){
            amountOfWaterTrapped += Math.min(left[i],right[i]) - arr[i];
        }
        return amountOfWaterTrapped;
    }
}
