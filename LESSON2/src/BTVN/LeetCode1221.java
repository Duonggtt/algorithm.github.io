package BTVN;

public class LeetCode1221 {

    class Solution {
        public int balancedStringSplit(String s) {
            int count = 0;
            int result = 0;
            for(int i = 0; i<s.length();i++){
                if(s.charAt(i) == 'R') {
                    count++;
                }else if(s.charAt(i) == 'L') {
                    count--;
                }
                if(count == 0) {
                    result++;
                }
            }
            return result;
        }
    }

}
