package wang.lvshang.leetcode.algorithm;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args){
        int[] nums = {-1,0,3,4,5,9,10};
        rotate1(nums,4);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate1(int[] nums,int k){
         int[]  nums2 = new int[nums.length];
         int n =nums.length;
        for (int i = 0; i < n; i++) {
            nums2[(i+k) % n] = nums[i];
        }
        System.arraycopy(nums2, 0, nums, 0, n);
        //更新update
    }


    //注意，此算法未完成，@todo simon
    public static void rotate2(int[] nums,int k){
        int n = nums.length-1;
        int temp = nums[k];
        int temp2;
        for(int i=0;i<n;){
            if(i+k>n){
                i = i+k-n;
                temp2 = nums[i];
                nums[i+k-n] = temp;
            }else{
                i = i+k;
                temp2 = nums[i];
                nums[i] = temp;
            }
            temp =temp2;
        }
    }


}
