package wang.lvshang.leetcode.dataStructure;

//leetcode  121题目
public class MaxProfit {
    public static void main(String[] args){
        int[] nums =new int[]{ 7,1,5,3,6,4 };
        int b = maxFix1(nums);
        System.out.println(b);
    }

    //第一次写的模式，数据结构不太好
    public static int maxFix1(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;

    }

    //第二次优化版本，对算法进行提示

}







