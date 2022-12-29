import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        int[] nums = {0,1,2,3,5,6,7};
        System.out.println(missingNumber(nums));
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
