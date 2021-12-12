package Lesson_12;

import java.util.ArrayList;

public class HomeworkTask9 {

    private static void checkRating(ArrayList<Student>studentsList){
        for (int i=0;i<studentsList.size();i++){
                if (studentsList.get(i).getRating()<3){
                    studentsList.remove(i);
                    i--;
                } else {
                    studentsList.get(i).nextCourse();
            }
        }
    }

    private static void printStudent(ArrayList<Student>studentList,int course){
        for (Student student:studentList) {
            if(student.getCourse()==course){
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        Student student1=new Student("Pedro",2,5);
        Student student2=new Student("Bembo");
        Student student3=new Student("York",3,3);
        Student student4=new Student("Chole",3,2);

        ArrayList<Student> studentsList=new ArrayList<Student>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);

        checkRating(studentsList);
        System.out.println(studentsList);

        printStudent(studentsList,3);
        printStudent(studentsList,4);
    }
}
