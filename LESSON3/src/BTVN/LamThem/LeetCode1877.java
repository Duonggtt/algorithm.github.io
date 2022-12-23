package BTVN.LamThem;

import java.util.Arrays;

public class LeetCode1877 {

    class Solution {
        public int minPairSum(int[] nums) {
            Arrays.sort(nums);
            int max = 0;
            for(int i = 0;i< nums.length / 2;i++) {
                int sum = 0;
                sum += (nums[i] + nums[nums.length - 1 - i]);
                if(sum >= max) {
                    max = sum;
                }
            }
            return max;
        }
    }

}
