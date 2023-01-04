package wang.lvshang.leetcode.algorithm;

public class Dichotomy {
    public static void main(String[] args){
        int[] nums = {2,5};
        int index=  search(nums,0);
        System.out.println(index);
    }

    public static int search(int[] nums,int target){
        int start = 0;
        int last = nums.length-1;

        while(start<=last){
            int index = (start+last)/2;
            if(target==nums[index]){
                return index;
            }else if(target<nums[index]){
                last = index-1;
            }else{
                start = index+1;
            }
        }
        return -1;

    }
}

