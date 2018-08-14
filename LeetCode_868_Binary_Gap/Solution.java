//link: https://leetcode.com/problems/binary-gap/description/

class Solution {
    public int binaryGap(int N) {
        String binary_string = Integer.toBinaryString(N);
        int max = 0;
        int count = 0;
        boolean canCount = false;
        for(int i = binary_string.length()-1; i >= 0; i--){
            if(binary_string.charAt(i) == '1'){
                canCount = true;
                if(i != 0) count = 1;
            }else{
                if(canCount) count++;
            }
            max = Math.max(max, count);
        }
        return max == 0? 0: max;
    }

    public static void main(String[] args) { 
        Solution s = new Solution();
        System.out.println(s.binaryGap(7));
   }
}