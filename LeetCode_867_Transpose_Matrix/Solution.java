//link: https://leetcode.com/problems/transpose-matrix/description/

class Solution {
    public int[][] transpose(int[][] A) {
        int col = A.length, row = A[0].length;
        int[][] res = new int[row][col];
        for(int i = 0 ; i < row; i++){
            for(int j = 0; j < col; j++){
                res[i][j] = A[j][i];
            }
        }
        return res;
    }

    public static void main(String[] args) { 
        Solution s = new Solution();
        int[] row1 = {1,2,3};
        int[] row2 = {4,5,6};
        int[][] matrix = {row1, row2};
        matrix = s.transpose(matrix);
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
   }
}