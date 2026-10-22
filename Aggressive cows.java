//gfg problem t.c ->O(n logn ) + [O(log())*O(n)]
class Solution {
    public int aggressiveCows(int[] arr, int k) {
        int n = arr.length;
        // code here
        Arrays.sort(arr);
        int low = 0;
        int high = arr[n-1]-arr[0];
        while(low<=high){
            int mid = low+(high-low)/2;
            if(canweplace(arr,mid,k) == true){
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        return high;
    }
    public static boolean canweplace(int[] arr,int dist,int k){
        int n = arr.length;
        int countofcows = 1, last = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]-last>=dist){
                countofcows++;
                last = arr[i];
            }
            if(countofcows>=k) return true;
        }
        
        return false;
    }
}
