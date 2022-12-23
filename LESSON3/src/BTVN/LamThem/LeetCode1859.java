package BTVN.LamThem;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode1859 {

    class Solution {
        public String sortSentence(String s) {
            String[] newStr = s.split(" ");
            StringBuilder sb = new StringBuilder();
//            Arrays.sort(newStr, Comparator.comparingInt(a -> a.charAt(a.length() - 1)));
            for(int i=0;i<newStr.length;i++) {
                for(int j = i+1;j<newStr.length;j++) {
                    if(newStr[i].charAt(newStr.length-1) > newStr[j].charAt(newStr.length-1)) {
                        int temp = Integer.parseInt(newStr[i]);
                        newStr[i] = newStr[j];
                        newStr[j] = String.valueOf(temp);
                    }
                }
            }
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
