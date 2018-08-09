//link: https://leetcode.com/problems/rotate-string/description/

class Solution {
    public boolean rotateString(String A, String B) {
        if(A.length()==0 && B.length()==0) return true;
        if (A.length() != B.length()){
            return false;
        }
        String long_string = A + A;
        for (int i = 0; i < B.length(); i++){
            String target = long_string.substring(i, i+B.length());
            if(target.equals(B)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) { 
        Solution s = new Solution();
        System.out.println(s.rotateString("abcde","bcdea"));
   }
}