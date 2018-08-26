//link: https://leetcode.com/problems/fair-candy-swap/description/

import java.util.*;
class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        Set<Integer> set = new HashSet<Integer>();
        int total_sum_a = 0, total_sum_b = 0;
        for(int bar_size: A){
            total_sum_a += bar_size;
            set.add(bar_size);
        }
        for(int bar_size: B){
            total_sum_b += bar_size;
        }
        int[] res = new int[2];
        int target = -1;
        for(int i = 0 ; i<B.length; i++){
            target = total_sum_a + B[i] - (total_sum_a + total_sum_b)/2;
            if(set.contains(target)){
                res[1] = B[i];
                break;
            }
        }
        for(int i = 0 ; i < A.length; i++){
            if(A[i] == target){
                res[0] = A[i];
            }
        }
        return res;
    }

    public static void main(String[] args) { 
        Solution s = new Solution();
        int[] A = {1,2,5};
        int[] B = {2,4};
        System.out.println(s.fairCandySwap(A, B));
   }
}