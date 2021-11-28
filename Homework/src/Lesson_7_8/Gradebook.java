package Lesson_7_8;

import java.util.ArrayList;
import java.util.Random;

public class Gradebook {

    Random random=new Random();
    private String student,group;
    int sessionNo;
    Exams exams=new Exams();

    public Gradebook(String student, String group,int sessionNo) {
        this.student = student;
        this.group = group;
        this.sessionNo=sessionNo;
    }
    public void getResults(){
        exams.getResults();
        exams.printResults();
    }

    private class Exams{
        String[]exam={"Math","Science","Economics","Physics"};
        ArrayList resultsOfExam=new ArrayList();

        private void getResults(){
            for(int i=0;i<exam.length;i++){
                if(random.nextBoolean()){
                    resultsOfExam.add("Completed");
                }else{
                    resultsOfExam.add("Failed");
                }
            }
        }
        private void printResults(){
            System.out.println("Student: "+student+" Group: "+group+" Session number "+sessionNo);
            for(int i=0;i< exam.length;i++){
                System.out.println(exam[i]+" - "+resultsOfExam.get(i));
            }
        }

    }

    public static void main(String[] args) {
        Gradebook gradebook=new Gradebook("Pedro Pedruchio","FBI-322",1);
        gradebook.getResults();
    }
}
