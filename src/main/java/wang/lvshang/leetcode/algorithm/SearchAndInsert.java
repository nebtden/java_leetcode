package wang.lvshang.leetcode.algorithm;

import java.util.Arrays;

public class SearchAndInsert {
    public static void main(String[] args){
        int[] nums = {1,3,4,5};
        int index=  searchAndInsert(nums,18);
        System.out.println(Arrays.toString(nums));
    }

    public static int searchAndInsert(int[] nums,int target){
        int begin = 0;
        int last = nums.length-1;
        int mid ;
        while(begin<=last){
            mid = (begin+last)/2;
           if(target>nums[mid]){
                begin = mid+1;
            }else{
                last  = mid-1;
            }
        }
        return begin;

    }


}
