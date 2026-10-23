// l.c 410 t.c ->O(log(sum-max+1)*O(n)) s.c->O(1)
class Solution {
    public int splitArray(int[] nums, int k) {
        if (k > nums.length) return -1;
        // code here
        long low = 0;
        long high = 0;
        for(int a : nums){
            low = Math.max(low,a);
            high = high+a;
        }
        while(low<=high){
            long mid = low+(high-low)/2;
            int noofstu = func(nums,mid);
            if(noofstu>k) low = mid+1;
            else high = mid -1;
        }
        return (int)low;
    }
    
    // 
    public static int func(int[] nums, long pages){
        int stu = 1;
        long pagesStu = 0;
        for(int i=0;i<nums.length;i++){
            if(pagesStu + nums[i]<=pages){
                pagesStu += nums[i];
            }
            else{
                stu++;
                pagesStu = nums[i];
            }
        }
        return stu;
    }

}
