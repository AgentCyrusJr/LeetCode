//link: https://leetcode.com/problems/maximize-distance-to-closest-person/description/

import java.util.*;
class Solution {
    public int maxDistToClosest(int[] seats) {
        int previous_seated_index = -1, max = 0;
        for(int i = 0; i<seats.length; i++){
            if(seats[i] == 1){
                if(previous_seated_index == -1){
                    max = i;
                }else{
                    max = Math.max(max, (i-previous_seated_index)/2);
                }
                previous_seated_index = i;
            }
        }
        return Math.max(max, seats.length-1-previous_seated_index);
    }

    public static void main(String[] args) { 
        Solution s = new Solution();
        int[] seats = {0,0,0,1,0,0,0,0,0,0,1,0};
        System.out.println(s.maxDistToClosest(seats));
   }

}