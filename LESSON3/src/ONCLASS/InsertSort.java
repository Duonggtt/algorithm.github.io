package ONCLASS;

public class InsertSort {

    public static void main(String[] args) {
        int[] arr = {1,5,4,7,6,2,9,8,3};
        int n = arr.length;
        for(int i =1;i<n;i++) {
            int j = i-1;
            int value = arr[i];
            while(j>=0 && arr[j] > value) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = value;
        }
        for(int i =0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
