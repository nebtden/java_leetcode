package wang.lvshang.leetcode.algorithm;

public class FindTheLongSubarray {
    public static void main(String[] args){
        String s = "abcabcbb";
       // String  t = findTheLongSubarray(s);
       // System.out.println(t);
    }

    //第一次写的模式，数据结构不太好，可以使用双指针
/*    public static String  findTheLongSubarray(String s) {
        String ss = "";
        char[] list = s.toCharArray();
        char[] sonList = new char[list.length];
        HashSet<Character>  chars = new HashSet<>();
        System.out.println(Arrays.toString(list));
        int left  =0;
        int right =0;
        for (int i = 0; i < list.length; i++) {
            //如果有重复的，没有比这个更大，则重新开始
            if(chars.add(list[i])){
                sonList[left] = list[i];
                left++;
            }else{

            }
            right++;
        }

    }*/


}







