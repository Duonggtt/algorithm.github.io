package BTVN.LamThem;

import java.util.Arrays;

public class LeetCode1464 {

    class Solution {
        public int maxProduct(int[] nums) {
            Arrays.sort(nums);
            int result = 0;
            result += (nums[nums.length-1] - 1) * (nums[nums.length-2] - 1);
            return result;
        }
    }

}
