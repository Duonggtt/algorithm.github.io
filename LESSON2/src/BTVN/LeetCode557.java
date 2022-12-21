package BTVN;

public class LeetCode557 {

    class Solution {
        public String reverseWords(String s) {
            String[] newStr = s.split(" ");
            StringBuilder sb = new StringBuilder();
            for(String str : newStr) {
                StringBuilder temp = new StringBuilder(str);
                sb.append(temp.reverse());
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
    }

}
