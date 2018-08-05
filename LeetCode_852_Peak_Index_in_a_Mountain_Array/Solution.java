//LeetCode: https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int low = 0, high = A.length-1;
        while (low < high){
            int mid = low + (high-low)/2;
            if(A[mid-1] < A[mid] && A[mid] > A[mid+1]){
                return mid;
            }else if(A[mid-1] <= A[mid] && A[mid] <= A[mid+1]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) { 
        Solution s = new Solution();
        int[] arr = {5,5,8,10,7};
        System.out.println(s.peakIndexInMountainArray(arr));
   }
}