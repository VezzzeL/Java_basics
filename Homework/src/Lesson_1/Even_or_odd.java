package Lesson_1;

public class Even_or_odd {
    public static void main(String[]args){
        int a=2;
        if(a%2==0&&a!=0){
            System.out.println("Число "+a+" - парне");
        }else if(a==0){
            System.out.println("Число "+a+" - ні парне, ні непарне");
        }else{
            System.out.println("Число "+a+" - непарне");
        };
    }
}
