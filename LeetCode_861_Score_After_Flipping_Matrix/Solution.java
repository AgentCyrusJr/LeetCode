//link: https://leetcode.com/problems/score-after-flipping-matrix/description/


class Solution {
    public int matrixScore(int[][] A) {
        int[] sum_array = new int[A.length];
        int index = 0, sum = 0;
        StringBuilder sb;
        for(int[] number: A){
            sb = new StringBuilder();
            for (int i = 0; i < number.length; i++) {
               sb.append(number[i]);
            }
            String binary_number = sb.toString();
            sum_array[index++] = Integer.parseInt(binary_number, 2);
        }
        for(int row = 0 ; row < A.length; row++){
            sb = new StringBuilder();
            for (int i = 0; i < A[row].length; i++) {
               sb.append(A[row][i]^1);
            }
            String flipped_binary_number = sb.toString();
            int flipped_sum = Integer.parseInt(flipped_binary_number, 2);
            if(flipped_sum > sum_array[row]){
                for(int i = 0 ; i < A[row].length; i++){
                    A[row][i] ^= 1;
                }
            }
        }
        
        for(int col = 0 ; col < A[0].length; col++){
            int count_one = 0;
            for(int i = 0 ; i < A.length; i++){
                if(A[i][col] == 1) count_one++;
            }
            if(count_one < A.length/2+1){
                for(int i = 0 ; i < A.length; i++){
                    A[i][col] ^= 1;
                }
            }
        }
        index = 0;
        for(int[] number: A){
            sb = new StringBuilder();
            for (int i = 0; i < number.length; i++) {
               sb.append(number[i]);
            }
            String binary_number = sb.toString();
            sum+=Integer.parseInt(binary_number, 2);
        }
        return sum;
    }

    public static void main(String[] args) { 
        Solution s = new Solution();
        int[] row1 = {0,0,1};
        int[] row2 = {1,0,0};
        int[][] matrix = {row1, row2};
        System.out.println(s.matrixScore(matrix));
   }
}