import java.util.*;

public class test {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};
        System.out.println(findDifference(nums1, nums2));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] result = new int[2];
        int sum1 = 0;
        int sum2 = 0;
        for(int aliceSize : aliceSizes) {
            sum1 += aliceSize;
        }
        for(int bobSize : bobSizes) {
            sum2 += bobSize;
        }
        int mid = (sum1 - sum2) / 2;
        Set<Integer> set = new HashSet<>();
        for(int bobSize : bobSizes) {
            set.add(bobSize);
        }
        for(int i =0;i< aliceSizes.length;i++) {
            if(set.contains(aliceSizes[i] - mid)) {
                result[0] = aliceSizes[i];
                result[1] = aliceSizes[i] - mid;
            }
        }
        return result;
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
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
                if(result2.size() > 0) {
                    result2.remove(result2.indexOf(nums1[i]));
                }
            }
        }
        answer.add(result1);
        answer.add(result2);
        return answer;
    }


}
