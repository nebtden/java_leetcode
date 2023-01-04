package wang.lvshang.leetcode.dataStructure;

import java.util.Arrays;
import java.util.HashMap;

public class TwoNumberSum {
    public static void main(String[] args){
        int[] nums =new int[]{ -24500,1,-24498,6,-23056,-23055};
        int num = 7 ;
        int[]  b = twoSum2(nums,num);
        System.out.println(Arrays.toString(b));
    }

    //第一次写的模式，数据结构不太好
    public static int[] twoSum1(int[] nums,int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j<nums.length ; j++) {
                if(nums[i]+nums[j]==target){
                    System.out.println("success ");
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }


    public static int[] twoSum2(int[] nums,int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.get(target-nums[i])!=null) {
                return new int[]{i,map.get(target-nums[i])};
            }else{
                map.put(nums[i],i);
            }

        }
        return new int[]{-1,-1};
    }
}







