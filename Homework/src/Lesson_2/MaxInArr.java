package Lesson_2;

import java.util.Random;

public class MaxInArr {
    public static void main(String[] args) {
        Random random=new Random();
        int size=12,index=0,min_dig=-15,max_dig=15;
        int arr[]=new int[size];
        int max=min_dig;
        for(int i=0;i<size;i++){
            arr[i]= random.nextInt(max_dig-min_dig+1)+min_dig;
            if(max<=arr[i]){
                max=arr[i];
                index=i+1;
            }
        }
        System.out.println("Max digit = "+max+" with index = "+index);
    }
}
