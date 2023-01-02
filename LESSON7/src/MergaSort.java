import java.util.Arrays;

public class MergaSort {

    public static void main(String[] args) {
        int[] a = {9,5,2,3,1,6,7,4};
        int[] c = new int[a.length];
        int start = 0;
        int end = a.length-1;
        //============================================
        System.out.println(Arrays.toString(mergaSort(c, a, start, end)));
    }

    public static int[] mergaSort(int[] c,int[] a,int start,int end) {
        if(start >= end ) {
            return  a;
        }
        int mid = (start + end) / 2;
        mergaSort(c,a,start,mid);
        mergaSort(c,a,mid + 1,end);
        int i=start;
        int j=mid+1;
        int u=start;
        while(i <= mid && j <= end) {
            if(a[i] > a[j]){
                c[u] = a[j];
                j++;
                u++;
            }else {
                c[u] = a[i];
                u++;
                i++;
            }
        }
        if(i<=mid) {
            while(i<=mid) {
                c[u] = a[i];
                i++;
                u++;
            }
        }
        if(j <= end) {
            while(j <= end) {
                c[u] = a[j];
                j++;
                u++;
            }
        }
        return c;
    }

}
