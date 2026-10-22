//gfg problem t.c ->O(log(sum-max+1)*O(n)) s.c->O(1)
class Solution {
    public int findPages(int[] arr, int k) {
        if (k > arr.length) return -1;
        // code here
        long low = 0;
        long high = 0;
        for(int a : arr){
            low = Math.max(low,a);
            high = high+a;
        }
        while(low<=high){
            long mid = low+(high-low)/2;
            int noofstu = func(arr,mid);
            if(noofstu>k) low = mid+1;
            else high = mid -1;
        }
        return (int)low;
    }
    public static int func(int[] arr, long pages){
        int stu = 1;
        long pagesStu = 0;
        for(int i=0;i<arr.length;i++){
            if(pagesStu + arr[i]<=pages){
                pagesStu += arr[i];
            }
            else{
                stu++;
                pagesStu = arr[i];
            }
        }
        return stu;
    }
}
