//LeetCode: https://leetcode.com/problems/lemonade-change/description/

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] changes_count = new int[2];
        for(int bill: bills) {
            if(bill == 5){
                changes_count[0]++;
            }else if(bill == 10){
                changes_count[1]++;
                if(changes_count[0] >= 1){
                    changes_count[0]--;
                }else{
                    return false;   
                }
            }else{ //case for bill = 20
                if(changes_count[1] >= 1 && changes_count[0] >= 1 ){
                    changes_count[0]--;
                    changes_count[1]--;
                }else if(changes_count[0] >= 3){
                    changes_count[0]-=3;
                }else{
                    return false;
                }
            }
            
        }
        return true;
    }

    public static void main(String[] args) { 
        Solution s = new Solution();
        int[] arr = {5,5,10};
        System.out.println(s.lemonadeChange(arr));
   }
}