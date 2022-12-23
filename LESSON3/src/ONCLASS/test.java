package ONCLASS;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class test {

    public static void main(String[] args) {
        int[] nums = {4,1,5,1,2,5,1,5,5,4}; //8
        int max = 0;
        int min = 0;
        for(int i =0;i<nums.length;i++) {
            for(int j = i+1;j<nums.length;j++) {
                max = Math.max(nums[i], nums[j]);
                min = Math.min(nums[i], nums[j]);
            }
        }
//        int max = nums[0] + nums[nums.length-1];

        nums[0] = min;
        nums[nums.length-1] = max;
        int j = 2;
        for(int i =1;i<nums.length-1;i+=2) {
            System.out.println("num[i]: " + nums[i]);
            System.out.println("num[j]: " + nums[j]);
            if(nums[i] + nums[j] > max) {
                max = nums[i] + nums[j];
            }
            j+=2;
        }
        System.out.println(max);
    }

}
