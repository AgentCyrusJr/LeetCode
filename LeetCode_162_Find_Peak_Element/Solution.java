//link: https://leetcode.com/problems/find-peak-element/description/

class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0, high = nums.length-1;
        while(low+1 < high){
            int mid = low + (high-low)/2;
            if(nums[mid-1] < nums[mid] && nums[mid] > nums[mid+1]){
                return mid;
            }else if(nums[mid-1] <= nums[mid] && nums[mid] <= nums[mid+1]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return nums[low]>nums[high]?low:high;
    }

    public static void main(String[] args) { 
        Solution s = new Solution();
        int[] arr = {2,1,2};
        System.out.println(s.findPeakElement(arr));
   }
}