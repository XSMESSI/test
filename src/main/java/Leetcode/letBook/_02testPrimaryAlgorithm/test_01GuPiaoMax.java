package Leetcode.letBook._02testPrimaryAlgorithm;

import java.util.Arrays;

/**
 * @Description 股票最高利润
 * @Author XuShen
 * @Date 2021/12/1 15:06
 */
public class test_01GuPiaoMax {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{6,1,3,2,4,7}));
    }

    /**
     * 获取最高利润（MAX）：
     * 考虑后面一天比前面一天的高，就在前面一天买，后面一天抛出，
     * 既可以获得利润，一次累加每次获得利润。就是最高的利润
     * @param prices
     * @return
     */

        public static int maxProfit(int prices[]) {
        if (prices == null || prices.length<=1){
            return 0;
        }
            int maxprofit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i]>prices[i-1]){
                    maxprofit+=(prices[i]-prices[i-1]);
                }
            }
            return maxprofit;
        }


    public static int maxProfit1(int[] prices) {
        int sum = 0;
        for (int i = 1 ;i<prices.length;i++){
            if (prices[i] - prices[i-1]<0){
                sum++;
            }
        }
        int sum1 = 0;
        for (int i = 0 ;i<prices.length;i++){
            if (prices[prices.length-1] >prices[i]){
                sum1++;
            }
        }
        if (sum1 == prices.length-1){
            return prices[prices.length-1];
        }

        int n = prices.length-1;
        /**
         * Sn=n(a1+an)/2(等差数列求和)
         */
        int[] num = new int[(n*(1+n)/2)+1];
        int count = 0;
        for (int i = 0;i<prices.length;i++){
            for (int j = i+1;j<prices.length;j++){
                num[count] = prices[j]-prices[i];
                count++;
            }
        }
        num[num.length-1] =prices[0];
        Arrays.sort(num);
        if (num[num.length-1]<0 || sum == prices.length-1){
            return 0;
        }
        return num[num.length-1];
    }
}

