//leetcode 153 t.c ->O(log n) s.c ->O(1)
class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(nums[mid]>nums[high]){
                low = mid+1;
            }
            else
                high = mid;
        }
        return nums[low];
    }
}
// another approach
class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MIN_VALUE;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[low<=nums[high){
                ans = Math.min(ans,nums[low]);
                low = mid+1;
            }
            else
                ans = Math.min(ans,nums[mid]);
                high = mid-1;
        }
        return ans;
    }
}
