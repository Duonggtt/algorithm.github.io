package BTVN.LamThem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode2418 {

    class Solution {
        public String[] sortPeople(String[] names, int[] heights) {
            String[] result = new String[names.length];
            Map<Integer, String> map = new HashMap<>();
            for(int i = 0;i<names.length;i++) {
                map.put(heights[i],names[i]);
            }
            Arrays.sort(heights);
            int j = 0;
            for(int i =heights.length-1;i>=0;i--) {
                result[j] = map.get(heights[i]);
                j++;
            }
            return result;
        }
    }

}
