package BTVN;

public class LeetCode2160 {

    class Solution {
        public int minimumSum(int num) {
            int[] arr = new int[4];
            int index = 0;
            int num1,num2;
            while(num >0 ) {
                arr[index++] = num % 10;
                num /= 10;
            }
            // Arrays.sort(arr);
            for(int i = 0; i<arr.length;i++) {
                for(int j = i+1;j<arr.length;j++) {
                    if(arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            num1 = arr[0] * 10 + arr[2];
            num2 = arr[1] * 10 + arr[3];
            return num1 + num2;
        }
    }

}
