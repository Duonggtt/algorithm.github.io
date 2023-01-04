import java.util.*;

public class test {

    public static void main(String[] args) {
        int[] nums = {8,19,4,2,15,3};
        System.out.println(findFinalValue(nums,2));
    }

    //leetcode2154
    public static int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == original) {
                original *= 2;
            }
        }
        return original;
    }

//Leetcode2032
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        ArrayList<Integer> nums = new ArrayList<>();
        for(int num : nums1) {
            set1.add(num);
        }
        for(int num : nums2) {
            if(set1.contains(num) && !nums.contains(num)) {
                nums.add(num);
            }
            set2.add(num);
        }
        for(int num : nums3) {
            if(set1.contains(num) && !nums.contains(num) || set2.contains(num) && !nums.contains(num)) {
                nums.add(num);
            }
        }
        return nums;
    }

    //leetcode2000
    public static String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(int i =0;i<word.length();i++) {
            if(word.charAt(i) == ch) {
                index = i;
                for(int j = 0;j<=index;j++) {
                    sb.append(word.charAt(j));
                }
                sb.reverse();
                for(int j = index+1;j<word.length();j++) {
                    sb.append(word.charAt(j));
                }
                break;
            }
            if(i == word.length()-1) {
                if(word.charAt(i) != ch) {
                    return word;
                }
            }
        }

        return sb.toString();
    }

}
