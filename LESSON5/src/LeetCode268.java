import java.util.Arrays;

public class LeetCode268 {

    class Solution {
        public int missingNumber(int[] nums) {
            Arrays.sort(nums);
            int start = 0;
            int end = nums.length-1;
            if(nums[end] == nums.length-1) {
                return nums.length;
            }
            while(start < end) {
                int mid = (start + end) / 2;
                if(nums[mid] == mid) {
                    start = mid + 1;
                }else {
                    end = mid;
                }
            }
            return end;     
        }
    }

}
