//leetcode 1482 t.c ->O(n * log(max-min+1)) s.c ->O(1)
class Solution {
    private boolean possible(int[] bloomDay,int day, int m,int k){
        int count = 0;
        int noOfB = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                count++;
            }
            else{
                noOfB += (count/k);
                count = 0;
            }
            
        }
        noOfB += (count/k);
        return noOfB >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n<(long)m*k) return -1;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(min,bloomDay[i]);
            max = Math.max(max,bloomDay[i]);
        }
        int low = min, high = max;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(possible(bloomDay,mid,m,k)){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}
