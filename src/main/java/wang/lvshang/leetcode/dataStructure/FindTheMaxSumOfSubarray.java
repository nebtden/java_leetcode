package wang.lvshang.leetcode.dataStructure;

public class FindTheMaxSumOfSubarray {
    public static void main(String[] args){
        int[] nums =new int[]{ -2,1,13,4,-7,-9,2,3,-5,4};
        int  t = findTheMaxSumOfSubarray1(nums);
        System.out.println(t);
    }

    //第一次写的模式，数据结构不太好
    public static int  findTheMaxSumOfSubarray1(int[] nums) {
        //update the

        int maxNumber = 0;
        int thisNumber = 0;
        int min = 0;
        //丢弃位数
        int lostnums = 0;
        if(nums.length==1){
            maxNumber = nums[0];
        }

        for(int i=0;i<=nums.length-1;i++){

            thisNumber = thisNumber+nums[i];
            if(nums[i]<min){
                min = nums[i];
            }
            //如果前面总金额小于0，则丢弃,重新计算
            if(thisNumber<0){
                thisNumber = 0;
                lostnums = lostnums +1;
            }
            if(thisNumber>maxNumber){
                maxNumber = thisNumber;
            }
            //如果加一个金额还update 更新
        }
        if(lostnums== nums.length){
            return   min;
        }else{
            return maxNumber;
        }


    }


}







