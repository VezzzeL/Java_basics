package Lesson_2;

public class PrintNumsDec {
    public static void main(String[] args) {
        int size=5;
        for(int i=size;i>=1;i--){
            if(i>1){
                System.out.print(i+" ");
            }else{
                System.out.print(i);
            }
        }
    }
}
