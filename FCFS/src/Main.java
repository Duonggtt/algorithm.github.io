import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Nhập số tiến trình: ");
        int n = new Scanner(System.in).nextInt();
        float timeWaitting = 0;
        float timeStaying = 0;
        int[] process = new int[n];
        int[] arrivalTime = new int[n];
        int[] burstTime = new int[n];
        int[] wtSum = new int[n];
        int[] stSum = new int[n];
        int[] sum = new int[n];
        for(int i =0;i< n;i++) {
            System.out.println("Nhập tiến trình p" + (i+1) + " : ");
            System.out.println("Nhập thời điểm nạp: ");
            arrivalTime[i] = new Scanner(System.in).nextInt();
            System.out.println("Nhập thời gian hoạt động: ");
            burstTime[i] = new Scanner(System.in).nextInt();
            process[i] = i+1;
        }
        System.out.println("Bảng chi tiết các tiến trình:\n");
        System.out.printf("\n| %-20s| %-20s| %-20s|","Process" , "Arrival Time", "Burst Time");
        System.out.println("\n-------------------------------------------------------------------");
        for(int i=0;i<n;i++){
            System.out.printf("\n| P%-20s| %-20s| %-20s|", process[i], arrivalTime[i], burstTime[i]);
        }
        System.out.println("\n-------------------------------------------------------------------");

        for(int i=0;i<n;i++){
            for(int j =0;j<n -1;j++){
                if(arrivalTime[j] > arrivalTime[j+1]){
                    int temp = arrivalTime[j];
                    arrivalTime[j] = arrivalTime[j+1];
                    arrivalTime[j+1] = temp;

                    temp = burstTime[j];
                    burstTime[j] = burstTime[j+1];
                    burstTime[j+1] = temp;

                    temp = process[j];
                    process[j] = process[j+1];
                    process[j+1] = temp;
                }
            }
        }

        for(int i =0;i<n;i++){
            if(i == 0) {
                sum[i] = arrivalTime[i] + burstTime[i];
            }else {
                if(arrivalTime[i] > sum[i-1]){
                    sum[i] = arrivalTime[i] + burstTime[i];
                }else{
                    sum[i] = sum[i-1] + burstTime[i];
                }
            }
            stSum[i] += sum[i] - arrivalTime[i];
            wtSum[i] += stSum[i] - burstTime[i];
            timeWaitting += wtSum[i];
            timeStaying += stSum[i];
        }
        System.out.println("\nThời gian trung bình lưu lại hệ thống: " + (timeStaying / n));
        System.out.println("Thời gian chờ đợi trung bình: " + (timeWaitting / n));
    }
}