package Lesson_1;

public class Arr_sortInc {
    public static void main(String[] args) {
        int a=5,b=6,c=-2;
        int arr[]={a,b,c};
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
        a=arr[0];
        b=arr[1];
        c=arr[2];
        System.out.println(a+" "+b+" "+c);
    }
}
