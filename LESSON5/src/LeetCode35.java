public class LeetCode35 {

    class Solution {
        public int searchInsert(int[] nums, int target) {
            int start = 0;
            int end = nums.length-1;
            while(start < end) {
                int mid = (start +end) / 2;
                if(nums[mid] >= target) {
                    end = mid;
                }else {
                    start= mid +1;
                }
            }
            if(nums[start] >= target) {
                return start;
            }else {
                return start + 1;
            }
        }
    }

}
