package ONCLASS;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1,5,3,2,4};
        for(int i =0;i<arr.length;i++) {
            int max = i;
            for(int j = i+1;j<arr.length;j++) {
                if(arr[j] > arr[max]) {
                    max = j;
                }
                int temp = arr[j];
                arr[j] = arr[max];
                arr[max] = temp;
            }
        }
        for(int i =0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

    }

}