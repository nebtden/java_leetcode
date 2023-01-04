package wang.lvshang.leetcode.dataStructure;

public class MergeTwoArray {
    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int  n = 3;
        merge1(nums1,m,nums2,n);
    }

    //第一次写的模式，不符合要求
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        //新增一个临时数组，用于
        int[]  arrayList = new int[m+n];
        //   删除第一个
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        while(index1<=m && index2<=n){
            System.out.println("begin loop");
            System.out.println(index1);
            System.out.println(index2);
            if(index1==m && index2==n){
                break;
            }
            if(index1==m){
                arrayList[index]=nums2[index2];
                index2++;
            } else if (index2==n){
                arrayList[index]=nums1[index1];
                index1++;
            }else if(nums1[index1]<=nums2[index2]){
                //更新update ..
                arrayList[index]=nums1[index1];
                index1++;
            }else{
                arrayList[index]=nums2[index2];
                index2++;
            }
            index++;
        }

        for (int i = 0; i < arrayList.length; i++) {
            nums1[i] = arrayList[i];
        }
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        //更新
    }


}







