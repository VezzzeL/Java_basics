package Lesson_3;

import java.util.Scanner;

public class StrWithEvenId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String testText = scanner.nextLine(), resText="";
        System.out.println("The given string is: " + testText);
        String testTextT_Arr[] = testText.split(" ");
        for(int j=0; j<testTextT_Arr.length; j++) {
            char textT_Arr[] = testTextT_Arr[j].toCharArray();
            for (int i = 0; i < textT_Arr.length; i++) {
                if (i % 2 == 0) {
                    resText += textT_Arr[i];
                }
            }
            if(j<(testTextT_Arr.length-1)) {
                resText += " ";
            }
        }
        System.out.println("The result is: " + resText);
    }
}
