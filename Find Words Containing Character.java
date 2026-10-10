//leetcode 2942 t.c->O(n) s.c->O(n)
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n = words.length;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(words[i].contains(String.valueOf(x))){
                res.add(i);
            }
        }
        return res; 
    }
}
