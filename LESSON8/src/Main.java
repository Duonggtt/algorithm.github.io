import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(greatestLetter("nzmguNAEtJHkQaWDVSKxRCUivXpGLBcsjeobYPFwTZqrhlyOIfdM"));
    }

    public static String greatestLetter(String s) {
        String result = new String();
        for(int i =0;i<s.length()-1;i++) {
            if(s.charAt(i) - s.charAt(i+1) == 32 ) {
                result = String.valueOf(s.charAt(i+1));
                break;
            }else if(s.charAt(i+1) - s.charAt(i) == 32) {
                result = String.valueOf(s.charAt(i));
                break;
            }else {
                for(int j = i+1;j<s.length()-1;i++) {
                    if(s.charAt(i) - s.charAt(j) == 32) {
                        result = String.valueOf(s.charAt(j));
                        break;
                    }else  if(s.charAt(j) - s.charAt(i) == 32) {
                        result = String.valueOf(s.charAt(i));
                        break;
                    }
                }
                break;
            }
        }
        return result;
    }

    public static int[] frequencySort(int[] nums) {
        int[] result = new int[nums.length];
        int num = 0;
        for(int i =0;i<nums.length;i++) {
            int count = 0;
            for(int j =0;j<nums.length;j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count > num) {
                num = count;
                result[i] = nums[i];
            }
            System.out.println(num);
        }
        return result;
    }

    public static List<String> fizzBuzz(int n) {
        ArrayList<String> nums = new ArrayList<>();
        for(int i =1;i<=n;i++) {
            if(i % 5 ==0 && i % 3 == 0) {
                nums.add("FizzBuzz");
            }else if(i % 5 == 0) {
                nums.add("Buzz");
            }else if(i % 3 == 0) {
                nums.add("Fizz");
            }else {
                nums.add(String.valueOf(i));
            }
        }
        return nums;
    }
}