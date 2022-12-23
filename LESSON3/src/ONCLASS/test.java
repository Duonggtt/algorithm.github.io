package ONCLASS;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class test {

    public static void main(String[] args) {
        int[] piles = {9,8,7,6,5,1,2,3,4}; //8
        Arrays.sort(piles);
        int result = 0;
        for(int i = 0;i<piles.length;i+=2) {
            while(i >= 1) {
                result += piles[piles.length - 2 - i];
                System.out.println(result);
                break;
            }
        }
        System.out.println(result - piles[0]);
    }

}
