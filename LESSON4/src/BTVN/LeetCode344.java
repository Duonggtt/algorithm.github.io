package BTVN;

public class LeetCode344 {

    class Solution {
        public void reverseString(char[] s) {
            handle(s,0,s.length - 1);
        }
        public char[] handle(char[] s, int i ,int j) {
            if(i >= j) {
                return s;
            }
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            return handle(s, i + 1,j - 1);
        }
    }


}
