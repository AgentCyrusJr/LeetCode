//link: https://leetcode.com/problems/sort-array-by-parity/description/

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i = 0, j = A.length -1;
        while(i< j){
            if(A[i]%2 == 0){
                i++;
            }
            else{
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                j--;
            }
        }
        return A;
    }

    public static void main(String[] args) { 
        Solution s = new Solution();
        int[] array = {1,2,3,4};
        array = s.sortArrayByParity(array);
        for(int i: array){
        	System.out.print(i);
        }
   }
}