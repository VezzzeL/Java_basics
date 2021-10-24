package Lesson_2;

import java.util.Random;

public class HighestAverageBtwArr {

    public static void arr_print(int arr[]){
        for(int i=0;i<arr.length;i++) {
            if (i < (arr.length - 1)) {
                System.out.print(arr[i] + " ");
            }else{
                System.out.println(arr[i]);
            }
        }
    }

    public static double arr_average(int arr[]){
        double sum=0.0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double average=sum/arr.length;
        return average;
    }

    public static void main(String[] args){
        int size=5;
        Random random = new Random();
        int arr1[]=new int[size];
        int arr2[]=new int[size];
        for(int i=0;i<size;i++) {
            arr1[i]=random.nextInt(size+1);
            arr2[i]=random.nextInt(size+1);
        }
        arr_print(arr1);
        arr_print(arr2);
        System.out.println(arr_average(arr1)+" "+arr_average(arr2));
        if(arr_average(arr1)>arr_average(arr2)){
            System.out.println("Середнє значення масиву 1 є більшим");
        }else if(arr_average(arr1)<arr_average(arr2)){
            System.out.println("Середнє значення масиву 2 є більшим");
        }else{
            System.out.println("Середнє значення однакове");
        }
    }
}
