//link: https://leetcode.com/problems/projection-area-of-3d-shapes/

class Solution {
    public int projectionArea(int[][] grid) {
        int area_xy = 0, area_xz = 0, area_yz = 0;
        for(int i = 0 ; i<grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] != 0 ){
                    area_xy ++;
                }
            }
        }
        for(int[] row: grid){
            int max = 0;
            for(int elem : row ){
                max = Math.max(elem, max);
            }
            area_xz += max;
        }
        for(int i = 0 ; i < grid[0].length; i++){
            int max = 0;
            for(int j = 0; j < grid.length; j++){
                max = Math.max(grid[j][i], max);
            }
            area_yz += max;
        }
        return area_xz + area_yz + area_xy;
    }
}