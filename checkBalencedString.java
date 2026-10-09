//leetcode 3340 t.c->O(n) s.c->O(1)
class Solution {
    public boolean isBalanced(String num) {
        int n = num.length();
        int oddsum = 0, evensum = 0;
        for(int i=0;i<n;i++){

            if(i%2 == 0){
                evensum += num.charAt(i)-'0';
            }
            else{
                oddsum += num.charAt(i) - '0';
            }
        }
        return oddsum == evensum;
    }
}
