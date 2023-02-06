import java.util.*;

public class test {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        System.out.println(findDifference(nums1,nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        Set<Integer> set4 = new HashSet<>();
        for(int num1 : nums1) {
            set1.add(num1);
        }
        for(int num2 : nums2) {
            set2.add(num2);
        }
        for(int num : nums1) {
            if(!set2.contains(num)) {
                set3.add(num);
            }
        }
        for(int num : nums2) {
            if(!set1.contains(num)) {
                set4.add(num);
            }
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.addAll(set3);
        list2.addAll(set4);
        return  Arrays.asList(list1,list2);
    }

}
