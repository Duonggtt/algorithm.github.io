package ONCLASS;

import java.util.*;

public class test {

    public static void main(String[] args) {


        int x = 2147395599;
        System.out.println(mySqrt(x));;

    }

    public static int mySqrt(int x) {
        int start = 1;
        int end = x;
        while(start <= end) {
            int mid = (start + end) / 2;
            int midDou = mid * mid;
            if(midDou > x) {
                end = mid - 1;
            }
            if(midDou < x) {
                start = mid + 1;
            }
            if(midDou == x) {
                return mid;
            }
        }
        return end;
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for(int i =nums.length-1;i>=0;i--) {
            for(int j =i-1;j>=0;j--) {
                if(nums[i] - nums[j] != 1 ) {
                    System.out.println(nums[i]);
                    System.out.println(nums[j]);
                    result = nums[i] - 1;
                    break;
                }
            }
        }
        return result;
    }

    public static int TKNP(int[] arr,int k,int start, int end) {
        while(start <= end) {
            int m = (start + end) / 2;
            if(arr[m] == k) {
                return m;
            } else if(arr[m] > k) {
                end = m -1;
            } else {
                start = m + 1;
            }
        }
        return -1;
    }

    public static int calPoints(String[] operations) {
        int sum = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0;i<operations.length;i++) {
            if(operations[i].equals("C")) {
                nums.remove(nums.get(i-1));
                sum -= Integer.parseInt(operations[i-1]);
            }else if(operations[i].equals("D")) {
                nums.add(nums.get(i-3) * 2);
                sum += nums.get(i-2);
            }else if(operations[i].equals("+")) {
                nums.add(nums.get(i- 3) + nums.get(i-4));
                sum += nums.get(i-2);
            }else {
                nums.add(Integer.parseInt(operations[i]));
                sum += Integer.parseInt(operations[i]);
            }
        }
        return sum;
    }

    public static int sumOfUnique(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> invalid = new HashSet<Integer>();
        int sum = 0;
        for (int n : nums) {
            if (invalid.contains(n)) {
                continue;
            }
            if (set.contains(n)) {
                set.remove(n);
                invalid.add(n);
                continue;
            }
            set.add(n);
        }
        for(Integer i : set) {
            System.out.println(i);
            sum += i;
        }
        return sum;
    }

    public static int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int result = 0;
        for(int i =0;i<nums.length;i++) {
            if(!set.contains(nums[i])) {
                set.add(nums[i]);
            }else {
                result = nums[i];
            }
        }
        return result;
    }

    public static boolean isSameAfterReversals(int num) {
        int temp = num;
        int newNum = 0;
        int result= 0;
        while(temp > 0) {
            newNum =newNum * 10 +( temp % 10);
            temp/=10;
        }
        System.out.println(newNum);
        while(newNum >0) {
            result = result * 10 +(newNum % 10);
            newNum /= 10;
        }
        System.out.println(result);
        if(result == num) {
            return true;
        }
        return false;
    }

    public static int[] sumZero(int n) {
        int[] nums = new int[n];
        int sum = 0;
        for(int i=0;i<n/2;i++) {
            nums[i] = (-1) * (n-i);
            nums[n-1-i] = n-i;
        }
        return nums;
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = left;i<=right;i++) {
            boolean isCheck = true;
            int temp = i;
            while(temp > 0) {
                int rel = temp % 10;
                if(rel == 0) {
                    isCheck = false;
                    break;
                }
                if(i % rel != 0) {
                    isCheck = false;
                    break;
                }
                temp /= 10;
            }
            if(isCheck) {
                list.add(i);
            }
        }
        return list;
    }

    public static String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if(n % 2 == 0) {
            for(int i =0;i<n-1;i++) {
                sb.append('p');
            }
            sb.append('z');
        }else {
            for(int i =0;i<n;i++) {
                sb.append('p');
            }
        }

        return sb.toString();
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(int i =0;i<allowed.length();i++) {
            set.add(allowed.charAt(i));
        }
        for(String word : words) {
            for(int i =0;i<word.length();i++) {
                if(!set.contains(word.charAt(i))) {
                    break;
                }else {
                    if(i == word.length()-1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int GiaiThua(int n) {
        if(n == 0) {
            return 1;
        }
        int t = n * GiaiThua(n-1);
        return t;
    }
    public static int Fibonacci(int n) {
        if(n > 0 && n <= 2) {
            return 1;
        }
        int f = Fibonacci(n-1) + Fibonacci(n-2);
        return f;
    }


    public static boolean isPowerOfTwo(int n) {
        if(n % 2 == 0 && n > 0) {
            n /= 2;
            System.out.println(n);
        }else {
            return false;
        }
        if(n == 1) {
            return true;
        }
        return isPowerOfTwo(n);
    }


    public static int singleNumber(int[] nums) {
        int result = 0;
        ArrayList<Integer> list = new ArrayList();
        for(int i =0; i< nums.length;i++) {
            if(list.contains(nums[i])) {
                result -= nums[i];
            }else {
                list.add(nums[i]);
                result += nums[i];
            }
        }
        return result;
    }

    public static int[] plusOne(int[] digits) {
        int[] result = new int[digits.length+1];
        for(int i = digits.length-1;i>=0;i--) {
            if(digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        result[0] = 1;
        return result;
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i =0;
        int j=i+1;
        while(j < nums.length) {
            if(nums[j] == nums[i]) {
                return true;
            }
            i++;
            j++;
        }
        return false;
    }

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for(int i =0;i<arr.length-2;i++) {
            for(int j=i+1;j<arr.length-1;j++) {
                for(int k = j+1;k<arr.length;k++) {
                    System.out.println("i: " +arr[i]);
                    System.out.println("j: " +arr[j]);
                    System.out.println("k: " +arr[k]);
                    if(Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <=c) {
                        count++;
                        System.out.println("Count :" +count);
                    }
                }
            }
        }
        return count;
    }

    public static boolean isHappy(int n) {

        int temp = n;
        while(temp != 1) {
            ArrayList<Integer> nums = new ArrayList<>();
            int sum = 0;
            while(temp > 0) {
                int num = temp % 10;
                sum += Math.pow(num, 2);
                temp /= 10;
            }
            if(nums.contains(sum)) {
                return false;
            }
            nums.add(sum);
            temp = sum;
        }
        return true;
    }
    public static int searchInsert(int[] nums, int target) {
        int result = 0;
        for(int i =0;i<nums.length;i++) {
            if(target == nums[i]) {
                return i;
            }
            if(nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }
    public static boolean isValid(String s) {
        for(int i =0;i<s.length();i+=2) {
            if(s.charAt(i) == '[' && s.charAt(i+1) == ']') {
                return true;
            }else if(s.charAt(i) == '(' && s.charAt(i+1) == ')') {
                return true;
            }else if(s.charAt(i) == '{' && s.charAt(i+1) == '}') {
                return true;
            }
        }
        return false;
    }



    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        if(i >= j) {
            return;
        }
        char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        i++;
        j--;
        reverseString(s);
    }

}
