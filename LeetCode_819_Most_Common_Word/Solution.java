//link: https://leetcode.com/problems/most-common-word/description/

import java.util.*;
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        Set<String> set = new HashSet<String>();
        for(String banned_str: banned){
            set.add(banned_str);
        }
        int start = 0;
        for(int i = 0; i < paragraph.length(); i++){
            char ch = paragraph.charAt(i);
            if( 0 <= ch-'a' && ch-'a' <= 25 || 0 <= ch-'A' && ch-'A' <= 25 ){
                if(start < 0){
                    start = i;
                }
                if(i == paragraph.length()-1){
                    String target = paragraph.substring(start, i+1).toLowerCase();
                    if(!set.contains(target)){
                        map.put(target, map.getOrDefault(target, 0)+1);
                    }
                }
            }else{
                if(start >= 0){
                    String target = paragraph.substring(start, i).toLowerCase();
                    start = -1;
                    if(!set.contains(target)){
                        map.put(target, map.getOrDefault(target, 0)+1);
                    }
                }
            }
        }
        int max_count = 0;
        String res = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if(value > max_count){
                max_count = value;
                res = entry.getKey();
            }
        }
        return res;
    }

    public static void main(String[] args) { 
        Solution s = new Solution();
        String paragraph = "Bob hit a ball, the a hit A BALL flew far after it was hit ball ball";
        String[] banned = {"hit"};
        System.out.println(s.mostCommonWord(paragraph, banned));
   }
}