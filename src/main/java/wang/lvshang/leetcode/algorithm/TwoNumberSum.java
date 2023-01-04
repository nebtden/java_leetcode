package wang.lvshang.leetcode.algorithm;

public class TwoNumberSum {
    public static void main(String[] args){
        int[] nums =new int[]{ 0,0,3,4};
        int num = 0 ;
        int[]  b = twoSum2(nums,num);
        System.out.println(b[0]);
        System.out.println(b[1]);
    }

    //第一次写的模式，数据结构不太好
    public static int[] twoSum1(int[] nums,int target) {
        int left = 0,right = 1;
        int n = nums.length;
        while(left<n){
            if(target==nums[left]+nums[right]){
                return new int[]{left+1,right+1};
            }
            right++;
            if(right==n){
                left++;
                right = left+1;
            }
        }
        return new int[]{-1,-1};
    }


    public static int[] twoSum2(int[] nums,int target) {
        int left = 0,right = 1;
        int n = nums.length;
        while(left<n){
            if(target==nums[left]+nums[right]){
                return new int[]{left+1,right+1};
            }
            right++;
            if(right==n){
                left++;
                right = left+1;
            }
        }
        return new int[]{-1,-1};
    }
}







