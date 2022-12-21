package BTVN;

public class LeetCode2114 {

    class Solution {
        public int mostWordsFound(String[] sentences) {
            int count = 0;
            int max = 0;
            for(String str : sentences) {
                max = Math.max(max, str.split(" ").length);
            }
            return max;
        }
    }

}
