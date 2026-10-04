//leetcode - 65 t.c ->O(n) s.c ->O(n)
import java.util.*;//import java.util.regex; regular expression
class Solution {
    public boolean isNumber(String s) {
        String regex = "^[+-]?((\\d+\\.\\d*)|(\\.\\d+)|(\\d+))([eE][+-]?\\d+)?$";
        return s.matches(regex);
    }
}
