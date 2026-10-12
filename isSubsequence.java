//leetcode 392 t.c ->O(len(t)) s.c ->O(1)
class Solution {
    public boolean isSubsequence(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        int i=0,j=0;
        while(i<n1 && j<n2){
            char ch1 = s.charAt(i);
            
            char ch2 = t.charAt(j);
            if(ch1 == ch2){
                i++;
            }
            j++;
            
        }
        return i == s.length();
    }
}
