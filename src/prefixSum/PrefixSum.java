package prefixSum;

public class PrefixSum {

    public static void main(String[] args) {

    }

    static int buySellStocksI(int[] arr){ // I need only one info - min price for each day
        int minBuyPriceTillToday = arr[0];
        int maxProfit = 0;
        for(int i=0; i<arr.length; i++){
            int profit = arr[i]-minBuyPriceTillToday;
            maxProfit = Math.max(profit, maxProfit);
            if(arr[i] < minBuyPriceTillToday) minBuyPriceTillToday = arr[i];
        }
        return maxProfit;
    }

    static int buySellStocksITwoLoops(int[] arr){
        int n = arr.length;
        int[] bestBuy = new int[n];
        int[] bestSell = new int[n];

        int bestBuyPrice = arr[0];
        int bestSellPrice = arr[n-1];

        for(int i=0; i<n; i++) {
            if(bestBuyPrice >= arr[i]) bestBuyPrice = arr[i];
            bestBuy[i] = bestBuyPrice;
        }

        for(int i=n-1; i>=0; i--){
            if(arr[i] >= bestSellPrice)bestSellPrice = arr[i];
            bestSell[i] = bestSellPrice;
        }

        int maxProfit = 0;
        for(int i=0; i<n; i++) maxProfit = Math.max(maxProfit, bestSell[i]-bestBuy[i]);
        return maxProfit;
    }

    static int buySellStocksIBrute(int[] arr){
        int maxProfit=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                maxProfit = Math.max(maxProfit, arr[j]-arr[i]);
            }
        }
        return maxProfit;
    }

    static int kadaneAlgo(int[] arr){
        int maxSum = Integer.MIN_VALUE, currSum=0;
        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            maxSum = Math.max(currSum, maxSum);
            if(currSum < 0)currSum = 0;
        }
        return maxSum;
    }

    static int maxSumSubarray(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length;j++){
                int sum = 0;
                for(int k=i; k<=j; k++) sum += arr[k];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    static void printSubarrays(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++) System.out.print(arr[k]+" ");
                System.out.println();
            }
        }
    }
}

