package wang.lvshang.leetcode.dataStructure;

import java.util.Arrays;

//leetcode  566题目
public class MatrixReshape {
    public static void main(String[] args){
        int[][] nums = new int[][]{ new int[]{2,9},new int[]{6,11}};
        int[][] shape = shape1(nums,4,1);
        System.out.println(Arrays.toString(shape));
    }

    //第一次写的模式，数据结构不太好
    public static int[][] shape1(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] shape =new int[r][c];
        if(m*n!=r*c){
            shape =  mat;
        }else{

            int left = 0;
            int right = 0;
            int[] column =new int[c];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    column[left] = mat[i][j];
                    left++;
                    if(left==c){
                        left = 0;
                        shape[right] = Arrays.copyOfRange(column,0,c);
                        right++;
                    }
                }

            }
        }
        return shape;

    }

    //第二次优化版本，对算法进行提示

}







