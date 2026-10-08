//leetcode 912 t.c ->O(nlogn) s.c ->O(n)
class Solution {
    public int[] sortArray(int[] nums) {
        // Arrays.sort(nums);
        // return nums;
        int n = nums.length;
        mergeSort(nums,0,n-1);
        return nums;
    }
    private void mergeSort(int[] arr, int low, int high){
        if(low>=high)
            return;
        
        int mid = low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);

    }
    private void merge(int[] arr,int low,int mid, int high){
        int[] temp = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int k = 0;
        while(left<=mid && right<=high){

            if(arr[left]<=arr[right]){
                temp[k++] = arr[left++];
            }
            else{
                temp[k++] = arr[right++];
            }
        }
        while(left<=mid){
            temp[k++] = arr[left++];
        }
        while(right<=high){
            temp[k++] = arr[right++];
        }
        for(int i=0;i<temp.length;i++){
            arr[low+i] = temp[i];
        }
    }
}
