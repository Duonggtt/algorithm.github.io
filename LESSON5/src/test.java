import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class test {

    public static void main(String[] args) {

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        int[] result = new int[4];
        int j =0;
        for(int i=0;i<nums1.length;i++) {
            for (int num2 : nums2) {
                if (nums1[i] == num2) {
                    if (!set.contains(nums1[i])) {
                        set.add(nums1[i]);
                        result[j] = nums1[i];
                        j++;
                    }
                }
            }
        }
        return result;
    }

    public static int missingNumber(int[] nums) {
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

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        if(nums[end] < target) {
            return end + 1;
        }
        while(start < end) {
            int mid = (start +end) / 2;
            int midD = mid * mid;
            if(midD < target) {
                start = mid ;
            }else if(midD > target) {
                end = mid - 1;
            }
            if(nums[start] == target || nums[start] > target) {
                return start;
            }
        }
        return end;
    }

}
