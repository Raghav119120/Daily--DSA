// lc 148 t.c ->O(32*n) ~O(n) s.c ->O(1)
class Solution {
    public int singleNumber(int[] nums) {
        int singlenumber = 0;
        int n = nums.length;
        
        for(int i=0;i<32;i++){
            int bitcount = 0;
            for(int num : nums){
                if(((num>>i)&1) == 1){
                    bitcount++;
                }
            }
            if(bitcount%3 != 0){
                singlenumber |= (1<<i);
            }
            
        }
        return singlenumber;
    }
}
