package Lesson_2;

public class PrintNumsInc {
    public static void main(String[] args) {
        int size=5;
        for(int i=1;i<=size;i++){
            if(i<size){
                System.out.print(i+" ");
            }else{
                System.out.print(i);
            }
        }
    }
}
