package BTVN.LamThem;

import java.util.Arrays;

public class LeetCode1913 {

    class Solution {
        public int maxProductDifference(int[] nums) {
            int result = 0;
            Arrays.sort(nums);
            for(int i =0;i<nums.length;i++){
                result = Math.abs((nums[0] * nums[1]) - (nums[nums.length-1] * nums[nums.length-2]));
            }
            return result;
        }
    }

}
