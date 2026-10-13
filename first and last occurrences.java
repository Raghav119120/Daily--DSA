//leetcode 34 t.c ->2*O(log n) s.c -> O(1)
import java.util.*;
class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int f = first(arr,x);
        int l = last(arr,x);
        ans.add(f);
        ans.add(l);
        
        return ans;
    }
    public static int first(int[] arr,int x){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid  = low+(high-low)/2;
            if(arr[mid] == x){
                ans = mid;
                high = mid-1;
            }
            else if(arr[mid]>x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static int last(int[] arr,int x){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid  = low+(high-low)/2;
            if(arr[mid] == x){
                ans = mid;
                low = mid+1;
            }
            else if(arr[mid]>x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}
//another approach
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f = first(nums,target);
        int l = last(nums,target);
        return new int[]{f,l};
    }
    public static int first(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target){
                ans = mid;
                high = mid-1;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static int last(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target){
                ans = mid;
                low = mid+1;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}
