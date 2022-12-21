package logicHandle;

import entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentHandle {

    public void sortStudentByName(ArrayList<Student> students) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getFullName().equals(o2.getFullName())) {
                    return o1.getAge() - o2.getAge();
                }
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });
    }

    public void sortStudentByAge(ArrayList<Student> students){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAge() == o2.getAge()){
                    return o1.getGPA() - o2.getGPA();
                }
                return o1.getAge() - o2.getAge();
            }
        });
    }

    public void sortStudentByLastName(ArrayList<Student> students) {
        for(int i =0;i<students.size();i++){
            for(int j =0;j<students.size();j++){

            }
        }
    }

}
