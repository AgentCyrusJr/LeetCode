//link: https://leetcode.com/problems/uncommon-words-from-two-sentences/description/

import java.util.*;
class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        List<String> list = new ArrayList<String>();
        Map<String, Integer> map_for_a = new HashMap<String, Integer>();
        Map<String, Integer> map_for_b = new HashMap<String, Integer>();
        for(String s_a: A.split(" ")){
            map_for_a.put(s_a, map_for_a.getOrDefault(s_a, 0)+1);
        }
        
        for(String s_b: B.split(" ")){
            map_for_b.put(s_b, map_for_b.getOrDefault(s_b, 0)+1);
        }
        
        for(String key: map_for_a.keySet()){
            if(!map_for_b.containsKey(key) && map_for_a.get(key) == 1){
                list.add(key);
            }
        }
        
        for(String key: map_for_b.keySet()){
            if(!map_for_a.containsKey(key) && map_for_b.get(key) == 1){
                list.add(key);
            }
        }
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) { 
        Solution s = new Solution();
        System.out.println(s.uncommonFromSentences("apple apple", "banana"));
   }
}

