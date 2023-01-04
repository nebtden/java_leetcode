package wang.lvshang.leetcode.algorithm;

public class ReverseWords {
    public static void main(String[] args){
        String s = "take LeetCode contest";
        s = reverse1(s);
        System.out.println(s);
    }

    public static String reverse1(String s){
        //先分割，再处理
        String[] list = s.split(" ");
        StringBuffer s2 = new StringBuffer();

        for (int i = 0; i < list.length; i++) {
            char[] s1 = list[i].toCharArray();
            int left = 0;
            int right =s1.length-1;
            char temp ;
            while(left<right){
                temp = s1[left];
                s1[left] = s1[right];
                s1[right] = temp;
                left++;
                right--;
            }
            for (char chars:s1){
                s2.append(chars);
            }
            s2.append(' ');
        }
        s2.delete(s2.length()-1, s2.length());
        return  s2.toString();

    }
}
