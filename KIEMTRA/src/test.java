import java.util.*;

public class test {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
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
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i =0;i<nums1.length;i++) {
            for(int j = 0;j<nums2.length;j++) {
                if(nums1[i] != nums2[j]) {
                    if(!answer.contains(nums1[i])) {
                        answer.add(nums1[i]);
                        break;
                    }
                }else {
                    break;
                }
            }
        }
        System.out.println(Collections.singletonList(answer));
        return new ArrayList<>(ArrayList<>(answer)) ;
    }


}
