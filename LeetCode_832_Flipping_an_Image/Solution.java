//link: https://leetcode.com/problems/flipping-an-image/description/

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int row = A.length, col = A[0].length;
        for(int i = 0 ; i < row; i++){
            int[] temp = new int[col];
            for(int j = 0; j < col; j++){
                int target_index = col - j - 1;
                temp[target_index] = A[i][j] ^ 1;
            }
            A[i] = temp;
        }
        return A;
    }
} 

