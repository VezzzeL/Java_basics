package Lesson_2;

public class PrintProdSequence {
    public static void main(String[] args) {
        int size=9, base_dig=2;
        for(int i=0;i<=size;i++){
            if(i<size){
                System.out.printf("%.0f ",Math.pow(base_dig,i));
            }else{
                System.out.printf("%.0f",Math.pow(base_dig,i));
            }
        }
    }
}
