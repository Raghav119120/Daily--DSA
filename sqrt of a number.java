//t.c ->O(log n) s.c ->O(1)
class Solution {
    int floorSqrt(int n) {
        // code here
        if(n==0) return 0;
        long low = 0;
        long high = n;
        while(low<=high){
            long mid = low+(high-low)/2;
            if((mid*mid)<=n){
                low = mid+1;
            }
            else{
                high  = mid-1;
            }
        }
        return (int)high;
    }
}
