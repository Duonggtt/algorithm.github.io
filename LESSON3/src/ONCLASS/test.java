package ONCLASS;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class test {

    public static void main(String[] args) {
        int[] nums = {3,5,4,2,4,6}; //8
        Arrays.sort(nums);
        int max = 0;
        for(int i = 0;i< nums.length / 2;i++) {
            int sum = 0;
            sum += (nums[i] + nums[nums.length - 1 - i]);
            if(sum >= max) {
                max = sum;
            }
        }
        System.out.println(max);
    }

}
