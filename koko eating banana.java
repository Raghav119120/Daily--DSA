//leetcode 875 t.c ->O(n)*log(max element) s.c -> O(1)
class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        int low = 1, high = 0;
        for(int a : arr){
            high = Math.max(high,a);
        }
        int ans = high;
        while(low<=high){
            int mid = low+(high-low)/2;
            long totalhrs = func(arr,mid);
            if(totalhrs<=k){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public long func(int[] arr, int hourly){
        long totalhrs = 0;
        for(int a : arr){
            totalhrs += (long)(a+hourly-1)/hourly;
        }
        return totalhrs;
    }
}
