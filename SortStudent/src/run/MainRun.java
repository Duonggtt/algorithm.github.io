package run;

import entity.Student;
import logicHandle.StudentHandle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainRun {

    public static ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        Student st1 = new Student("Nguyen Van A", 19, 9);
        Student st2 = new Student("Nguyen Van B", 20, 8);
        Student st3 = new Student("Tran Van A", 21, 7);
        Student st4 = new Student("Tran Van A", 17, 10);
        Student st5 = new Student("Bui Van A", 15, 6);
        students = new ArrayList<>(Arrays.asList(st1,st2,st3,st4,st5));

        StudentHandle studentHandle = new StudentHandle();
        while(true){
            System.out.println("\n==========================");
            System.out.println("1. Sắp xếp học sinh theo fullName, nếu giống fullName thì ai nhiều tuổi hơn thì đứng trước.");
            System.out.println("2. Sắp xếp học sinh theo tuổi tăng dần, nếu bằng tuổi thì xếp theo GPA giảm dần.");
            System.out.println("3. Sắp xếp theo tên. (Ví dụ là Hoàng Văn A, thì chỉ xét A thôi).");
            System.out.println("4. Thoát.");
            System.out.println("\n==========================");
            System.out.println("Chọn thao tác: ");

            int functionChoice;
            do{
                functionChoice = Integer.parseInt(new Scanner(System.in).nextLine());
                if(functionChoice >=1 && functionChoice <=4) {
                    break;
                }
                System.out.println("Vui lòng chọn đúng thao tác!");
            }while(true);
            switch (functionChoice) {
                case 1:
                    //#1. Sắp xếp học sinh theo fullName, nếu giống fullName thì ai nhiều tuổi hơn thì đứng trước.
                    System.out.println("\n\nList student sau khi sort theo ca ho ten: ");
                    studentHandle.sortStudentByName(students);
                    for (Student student : students) {
                        System.out.println(student);
                    }
                    break;
                case 2:
                    //#2. Sắp xếp học sinh theo tuổi tăng dần, nếu bằng tuổi thì xếp theo GPA giảm dần
                    System.out.println("\n\nList student sau khi sort theo tuoi: ");
                    studentHandle.sortStudentByAge(students);
                    for (Student student : students) {
                        System.out.println(student);
                    }
                    break;
                case 3:
                    //#3. Sắp xếp theo tên. (Ví dụ là Hoàng Văn A, thì chỉ xét A thôi)
                    System.out.println("\n\nList student sau khi sort theo ten ten: ");
                    studentHandle.sortStudentByAge(students);
                    for (Student student : students) {
                        System.out.println(student);
                    }
                    break;
                case 4:
                    System.exit(functionChoice);
            }
        }
    }

}
