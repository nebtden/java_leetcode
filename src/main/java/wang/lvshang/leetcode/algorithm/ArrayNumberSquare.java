package wang.lvshang.leetcode.algorithm;

import java.util.Arrays;

public class ArrayNumberSquare {
    public static void main(String[] args){
        int[] nums = {-1,0,3,4,5};
        int[] list =  square2(nums);
        System.out.println(Arrays.toString(list));

    }

    public static int[] square1(int[] nums){
        int[] list = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            list[i] = nums[i]*nums[i];
        }
        Arrays.sort(list);
        return list;
    }

    public static int[] square2(int[] nums){
        int[] list = new int[nums.length];
        int n = nums.length;
        for(int i=0,  j=n-1, pos = n-1; i<=j;) {
            if(nums[i]*nums[i]>nums[j]*nums[j]){
                list[pos] = nums[i]*nums[i];
                i++;
            }else{
                list[pos] = nums[j]*nums[j];
                --j;
            }
            -- pos;
        }
        return list;
    }

}
