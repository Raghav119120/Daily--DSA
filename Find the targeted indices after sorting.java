//lc 2089 t.c ->O(n) without sorting and binary search and O(n logn) for list approach s.c ->O(1) for O(n) and O(n) for List approach
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        //Arrays.sort(nums);
        int less = 0;
        int equal = 0;
        for(int num : nums){
            if(num<target){
                less++;
            }
            else if(num==target) {
                equal++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<equal;i++){
            //if(nums[i] == target){
                res.add(less+i);
            //}
        }
        return res;
        // int low = 0;
        // int high = nums.length - 1;
        // while(low<=high){
        //     int mid = low+(high-low)/2;
        //     if(nums[mid] == target){
        //         res.add(mid);
        //     }
        //     else if(nums[mid]<target){
        //         high = mid-1;
        //     }
        //     else{
        //         low = mid+1;
        //     }
        // }
        // return res;
    }
}
