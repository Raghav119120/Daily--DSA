//leetcode 415
class Solution {
    public String addStrings(String num1, String num2) {
        int n = num1.length()-1;
        int m = num2.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(n>=0 || m>=0 || carry!=0){
            int digit1 = n>=0?num1.charAt(n)-'0':0;
            int digit2 = m>=0?num2.charAt(m)-'0':0;
            int sum = digit1+digit2+carry;
            carry = sum/10;
            sb.append(sum%10);
            n--;
            m--;
        }
        return sb.reverse().toString();
    }
}
