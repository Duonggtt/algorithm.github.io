package BTVN;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode1859 {

    class Solution {
        public String sortSentence(String s) {
            String[] newStr = s.split(" ");
            StringBuilder sb = new StringBuilder();
            Arrays.sort(newStr, Comparator.comparingInt(a -> a.charAt(a.length() - 1)));
            for(String str : newStr) {
                StringBuilder temp = new StringBuilder(str);
                sb.append(temp.deleteCharAt(temp.length()-1));
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
    }

}
