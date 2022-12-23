package BTVN.LamThem;

import java.util.Arrays;

public class LeetCode1561 {

    class Solution {
        public int maxCoins(int[] piles) {
            Arrays.sort(piles);
            int result = 0;
            for(int i = piles.length / 3;i< piles.length;i+=2) {
                result += piles[i];
            }
            return result;
        }
    }

}
