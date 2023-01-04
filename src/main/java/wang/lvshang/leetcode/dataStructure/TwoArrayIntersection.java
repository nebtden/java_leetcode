package wang.lvshang.leetcode.dataStructure;

import java.util.Arrays;
import java.util.HashMap;

//leetcode 350题
public class TwoArrayIntersection {
    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,3,6};

        int[] nums = merge2(nums1,nums2);
        System.out.println(Arrays.toString(nums));
    }

    //第一次写的模式，不符合要求
    public static int[] merge1(int[] nums1, int[] nums2) {
        return new int[]{};
    }

    public static int[] merge2(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return merge2(nums2, nums1);
        }

        HashMap<Integer,Integer> map =  new HashMap<>();
        int[] intersection = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            if(map.get(nums1[i])==null){
                map.put(nums1[i],1);
            }else{
                map.put(nums1[i],map.get(nums1[i])+1);
            }
        }

        int index = 0;
        for (int i = 0; i < nums2.length; i++) {
            if(map.get(nums2[i])!=null && map.get(nums2[i])!=0){
                intersection[index++] = nums2[i];
                map.put(nums2[i],map.get(nums2[i])-1);
            }
            //map.get(nums2[i]);
        }
        return Arrays.copyOfRange(intersection,0,index);
        //update
    }


}







