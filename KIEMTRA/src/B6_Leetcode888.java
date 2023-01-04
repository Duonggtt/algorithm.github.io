import java.util.ArrayList;
import java.util.List;

public class B6_Leetcode888 {

    class Solution {
        public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            List<List<Integer>> answer = new ArrayList<List<Integer>>();
            List<Integer> list = new ArrayList<>();
            List<Integer> result1 = new ArrayList<>();
            List<Integer> result2 = new ArrayList<>();
            for(int num : nums2) {
                if(!list.contains(num)) {
                    list.add(num);
                }
                if(!result2.contains(num)) {
                    result2.add(num);
                }
            }
            for(int i =0;i<nums1.length;i++) {
                if(!list.contains(nums1[i])) {
                    if(!result1.contains(nums1[i])) {
                        result1.add(nums1[i]);
                    }
                }else {
                    result2.remove(result2.indexOf(nums1[i]));
                }
            }
            answer.add(result1);
            answer.add(result2);
            return answer;
        }
    }

}
