package Lesson_2;

public class ArrReplace {
    public static void main(String[] args) {
        String arr[]={"V","o","l","o","d","y","m","y","r"};
        int p=0;
        for(int i=(arr.length-1);i>p;i--){
            if(i>p){
                String utility_sort=arr[i];
                arr[i]=arr[p];
                arr[p]=utility_sort;
            }
            p++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
