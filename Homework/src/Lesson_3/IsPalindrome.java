package Lesson_3;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String res="", testWord=scanner.nextLine();
        char wordToArr[] = testWord.toCharArray();
        int j=testWord.length()-1;
        for(int i=0; i<j; i++){
            res = (wordToArr[i]==wordToArr[j]) ? " is a palindrome" : " is not a palindrome";
            j--;
        }
        System.out.println(testWord+res);
    }
}
