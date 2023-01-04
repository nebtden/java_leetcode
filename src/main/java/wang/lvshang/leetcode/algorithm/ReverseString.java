package wang.lvshang.leetcode.algorithm;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args){
        char[] s = "hello".toCharArray();
        reverse(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reverse(char[] s){
        int left = 0;
        int right = s.length-1;
        char temp ;
        while(left<right){
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
