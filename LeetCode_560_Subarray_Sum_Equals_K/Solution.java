//link: https://leetcode.com/problems/subarray-sum-equals-k/description/

import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] pre_sum_array = new int[nums.length+1];
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        int pre_sum = 0, count = 0;
        for(int i = 0; i <= nums.length; i++){
            if(i!=0)
                pre_sum += nums[i-1];
            if(map.containsKey(pre_sum)){
                list = map.get(pre_sum);
            }else{
                list = new ArrayList<Integer>();
            }
            list.add(i);
            map.put(pre_sum, list);
            pre_sum_array[i] = pre_sum;
        }
        
        for(int i = 0 ; i < pre_sum_array.length; i++){
            if(map.containsKey(k + pre_sum_array[i])){
                for(int index: map.get(k + pre_sum_array[i])){
                    if(index>i) count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) { 
        Solution s = new Solution();
        int[] arr = {1,1,1,-1,1};
        System.out.println(s.subarraySum(arr,2));
   }
}