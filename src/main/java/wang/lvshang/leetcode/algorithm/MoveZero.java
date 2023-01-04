package wang.lvshang.leetcode.algorithm;

import java.util.ArrayList;

public class MoveZero {
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        moveZero(nums);
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
    }

    public static void moveZero(int[] nums){
        //把所有数据拿出来，如果是0，则记录，不是0，也记录
        ArrayList<Integer> set1  =new ArrayList<>();
        ArrayList<Integer> set2  =new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                set1.add(i);
            }else{
                set2.add(nums[i]);
            }
        }
        int notZeroNumber= set2.size();

        for (int i = 0; i < notZeroNumber; i++) {
            nums[i]=set2.get(i);
        }
        for (int i = 0; i < set1.size(); i++) {
            nums[notZeroNumber+i]=0;
        }
    }

    //更优化的解决方法
    public static void moveZero2(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }





}
