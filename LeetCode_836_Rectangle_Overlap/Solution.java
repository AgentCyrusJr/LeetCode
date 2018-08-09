//LeetCode: https://leetcode.com/problems/rectangle-overlap/description/

class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int rec1_x1 = rec1[0], rec1_y1 = rec1[1], rec1_x2 = rec1[2], rec1_y2 = rec1[3];
        int rec2_x1 = rec2[0], rec2_y1 = rec2[1], rec2_x2 = rec2[2], rec2_y2 = rec2[3];
        if(rec1_x1 <= rec2_x1){
            if(rec2_x1 < rec1_x2 && ((rec1_y1 <= rec2_y1 && rec2_y1 < rec1_y2) || (rec1_y1 < rec2_y2 && rec2_y2 <= rec1_y2))){
                return true;
            }
            if(rec2_x2 <= rec1_x2 && ((rec1_y1 <= rec2_y1 && rec2_y1 < rec1_y2) 
                                      || (rec1_y1 < rec2_y2 && rec2_y2 <= rec1_y2)
                                      || (rec2_y1 <= rec1_y1 && rec1_y2 <= rec2_y2))){
                return true;
            }
        }else{
            if(rec1_x1 < rec2_x2 && ((rec2_y1 < rec1_y2 && rec1_y2 <= rec2_y2) || (rec2_y1 <= rec1_y1 && rec1_y1 < rec2_y2))){
                return true;
            }
            if(rec1_x2 <= rec2_x2 && ((rec2_y1 <= rec1_y1 && rec1_y1 < rec2_y2) 
                                      || (rec2_y1 < rec1_y2 && rec1_y2 <= rec2_y2) 
                                      || (rec1_y1 <= rec2_y1 && rec2_y2 <= rec1_y2))){
                return true;
            } 
        }
        return false;
    }

    public static void main(String[] args) { 
        Solution s = new Solution();
        int[] rec1 = {-6,-10,9,2};
        int[] rec2 = {0,5,4,8};
        System.out.println(s.isRectangleOverlap(rec1, rec2));
   }
}