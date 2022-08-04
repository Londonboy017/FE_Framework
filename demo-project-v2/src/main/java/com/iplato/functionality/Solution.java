package com.iplato.functionality;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[]B= {2,4,5,4,2};
        Solution sol =new Solution();
        sol.solution(B);
    }
    public int solution(int[] A){


        int[]B= {2,4,5,4,2};
        Arrays.sort(B);
        System.out.println(B.length);

        for (int i =0;i<=B.length;i++){
            System.out.println(B);
            if(B[i]==B[i-1]){
                System.out.println(B[i]);
            }
        }

  return 1;  }
}
