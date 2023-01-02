import java.util.Arrays;

public class MergaSort {

    public static void main(String[] args) {
        int[] a = {1,2,4,5,3,7,9,8};
        int[] c = new int[a.length];
        //============================================
        System.out.println(Arrays.toString(mergaSort(a,c, 0, c.length - 1)));
    }

    public static int[] mergaSort(int[] a, int[] c,int start,int end) {
        if(start >= end) {
            return a;
        }
        int mid = (start + end) /2;
        mergaSort(a,c,start,mid);
        mergaSort(a,c,mid+1,end);
        int i=start;
        int j=mid+1;
        int u=start;
        while(i <= mid && j <= end) {
            if(a[i] > a[j]){
                c[u] = a[j];
                j++;
                u++;
            }
            if(a[i] <= a[j]) {
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
            while(j<=end) {
                c[u] = a[j];
                j++;
                u++;
            }
        }
        return c;
    }


}
