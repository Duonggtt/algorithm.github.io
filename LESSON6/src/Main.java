import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        System.out.println(Arrays.toString(quickSort(nums, 0, nums.length - 1)));;
    }

    public static int[] quickSort(int[] nums, int start, int end) {
        if(start >= end) {
            return nums;
        }
        int mid = (start + end) / 2;
        int key = nums[mid];
        int i = start;
        int j = end;
            while(i<j) {
                while(nums[i] < key) {
                    i++;
                }
                while(nums[j] > key) {
                    j--;
                }
                if(i <=j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                }
            }
            quickSort(nums,start, j);
            quickSort(nums,i, end);
            return nums;
    }
}