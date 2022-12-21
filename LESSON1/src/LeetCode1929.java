public class LeetCode1929 {

    class Solution {
        public int[] getConcatenation(int[] nums) {
            int[] ans = new int[nums.length*2];
            for(int i =0;i<nums.length;i++){
                ans[i] = nums[i];
            }
            int j =0;
            for(int i=nums.length;i<2 * nums.length;i++){
                ans[i] = nums[j++];
            }
            return ans;
        }
    }

}
