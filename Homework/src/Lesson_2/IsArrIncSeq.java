package Lesson_2;

import java.util.Random;

public class IsArrIncSeq {
    public static void main(String[] args) {
        Random random = new Random();
        int size=4;
        boolean progression_typeCheck=true;
        int arr[]=new int[size];
        for(int i = 0;i<size;i++){
            arr[i]= random.nextInt(90)+10;
            System.out.print(arr[i]+" ");
        }
        for(int i=1;i<size;i++){
            if(arr[i]<arr[i-1]){
                progression_typeCheck=false;
            }
        }
        if(progression_typeCheck==true){
            System.out.print("\nСтрого зростаюча послідовність");
        }else{
            System.out.print("\nПослідовність не є строго зростаючою");
        }
    }
}
