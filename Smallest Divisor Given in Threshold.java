//leetcode 1283 t.c ->O(log(max)*n) s.c->O(1)
import java.util.*;
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int low = 1;
        int high = 0;
        for(int num : nums){
            high = Math.max(high,num);
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            if(sumofD(nums,mid)<=threshold){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    private int sumofD(int[] nums, int div){
        int sum = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum += Math.ceil((double)nums[i]/(double)div);

        }
        return sum;
    }
}
