package ONCLASS;

public class test {

    public static void main(String[] args) {

//        char[] s = {'h','e','l','l','o'};
//        reverseString(s);

        int n = 20;
        System.out.println(isPowerOfTwo(n));;
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
        }else {
            return false;
        }
        if(n == 1) {
            return true;
        }
        return isPowerOfTwo(n);
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
