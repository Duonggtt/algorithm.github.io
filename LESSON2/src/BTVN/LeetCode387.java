package BTVN;

public class LeetCode387 {

    class Solution {
        public int firstUniqChar(String s) {
            int result = 0;
            for(int i =0;i< s.length();i++){
                for(int j=0;j<s.length();j++){
                    if(i != j) {
                        if(s.charAt(i) != s.charAt(j)) {
                            result = i;
                        }else {
                            result = -1;
                            break;
                        }
                    }
                }
                if(result != -1) {
                    break;
                }
            }
            return result;
        }
    }

}
