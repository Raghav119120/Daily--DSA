//lc 2567
class Solution {
    public int minimizeSum(int[] nums) {
        int n = nums.length;
        if(n<=3) return 0;
        Arrays.sort(nums);
        long first = (long) nums[n-1] - nums[2];
        long second = (long) nums[n-2] - nums[1];
        long third = (long) nums[n-3] - nums[0];
        



        return (int) Math.min(first, Math.min(second,third));
    }
}
