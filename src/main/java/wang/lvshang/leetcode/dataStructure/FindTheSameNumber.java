package wang.lvshang.leetcode.dataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindTheSameNumber {
    public static void main(String[] args){
        int[] nums =new int[]{ -24500,-24499,-24498,-24497,-24496,-24495,-24494,-24493,-24492,-24491,-24490,
                -24489,-24488,-24487,-24486,-24485,-24484,-24483,-24482,-24481,-24480,-24479,
                -24478,-24477,-24476,-24475,-24474,-24473,-24472,-24471,-24470,-24469,-24468,
                -24467,-24466,-24465,-24464,-24463,-24462,-24461,-24460,-24459,-24458,-24457,
                -24456,-24455,-24454,-24453,-24452,-24451,-24450,-24449,-24448,-24447,-24446,
                -24445,-24444,-24443,-24442,-24441,-24440,-24439,-24438,-24437,-24436,-24435,
                -24434,-24433,-24432,-24431,-24430,-24429,-24428,-24427,-24426,-24425,-24424,
                -24423,-24422,-24421,-24420,-24419,-24418,-24417,-24416,-24415,-24414,-24413,
                -23065,-23064,-23063,-23062,-23061,-23060,-23059,-23058,-23057,-23056,-23055};
        Boolean  b = containsDuplicate1(nums);
        System.out.println(b);
    }

    //第一次写的模式，数据结构不太好
    public static boolean containsDuplicate1(int[] nums) {
        ArrayList<Integer> temps = new ArrayList<>();
        for(int t:nums){
            if(temps.contains(t)){
                return true;
            }else{
                temps.add((Integer)t);
            }
        }
        return false;
    }

    //第二次优化版本，对算法进行提示
    public static boolean containsDuplicate2(int[] nums) {
        Map<Integer,Integer> temps = new HashMap<>();
        for(int t:nums){
            if(temps.get((Integer)t)!=null){
                return true;
            }else{
                temps.put(t,1);
            }
        }
        return false;
    }
}







