public class B3_Leetcode2215 {

    class Solution {
        public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
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
            for(int aliceSize : aliceSizes) {
                for(int bobSize : bobSizes) {
                    if(aliceSize - bobSize == mid) {
                        result[0] = aliceSize;
                        result[1] = bobSize;
                    }
                }
            }
            return result;
        }
    }

}
