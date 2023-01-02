import java.util.Arrays;

public class MergaSort {

    public static void main(String[] args) {
        int[] c = {9,5,2,3,1,6,7,4};
        //============================================
        mergaSort(c,0,c.length-1);
        for (int i =0;i<c.length;i++) {
            System.out.print(c[i] + " ");
        }
    }

    public static void mergaSort(int[] c,int start,int end) {
        if(start < end) {
            int mid = (start + end) / 2;
            mergaSort(c,start,mid);
            mergaSort(c,mid + 1,end);
            merga(c,start,mid,end);
        }
    }

    public static int[] merga(int[] c,int start,int mid,int end) {
        int aLength = mid - start + 1;
        int bLength = end - mid;

        int[] a = new int[aLength];
        int[] b = new int[bLength];
        for(int i =0;i<aLength;i++) {
            a[i] = c[start + i];
        }
        for(int i =0;i<aLength;i++) {
            b[i] = c[mid + 1 + i];
        }

        int i=0;
        int j=0;
        int u = start;
        while(i <aLength && j <bLength) {
            if(a[i] <= b[j]) {
                c[u] = a[i];
                i++;
            }else {
                c[u] = b[j];
                j++;
            }
            u++;
        }
        while(i < aLength) {
            c[u] = a[i];
            i++;
            u++;
        }
        while(j < bLength) {
            c[u] = b[j];
            j++;
            u++;
        }
        return c;
    }

}
