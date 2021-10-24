package Lesson_2;

import java.util.Random;

public class RandArr_plus_replaceOdd {
    public static void main(String[] args) {
        int size=8;
        Random random=new Random();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=1+random.nextInt(10);
            System.out.println(arr[i]);
        }
        System.out.println("");
        for(int i =0;i<size;i++){
            if(arr[i]%2!=0){
                arr[i]=0;
            }
            System.out.println(arr[i]);
        }
    }
}
