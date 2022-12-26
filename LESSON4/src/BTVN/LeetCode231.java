package BTVN;

public class LeetCode231 {

    class Solution {
        public boolean isPowerOfTwo(int n) {
            if(n == 1) {
                return true;
            }
            if(n % 2 == 0 && n > 0) {
                n /= 2;
            }else {
                return false;
            }
            return isPowerOfTwo(n);
        }
    }

}
