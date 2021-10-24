package Lesson_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SimCharCheckForStrs {

    static void checkExOfWord(String searchWord, String elForCheck){
        boolean printChecked=true;
        for(int i=0; i<searchWord.length();i++){
            if(!elForCheck.contains(String.valueOf(searchWord.charAt(i)))){
                printChecked=false;
            }
        }
        if(printChecked){
            System.out.println(elForCheck);
        }
    }

    static String removeDuplicates(String searchWord){
        String res="";
        for(int i=0; i<searchWord.length(); i++){
            if(!res.contains(String.valueOf(searchWord.charAt(i)))){
                res=res.concat(String.valueOf(searchWord.charAt(i)));
            }
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text, pls");
        String entryText =" "+scanner.nextLine();
        System.out.println("Enter a search word, pls");
        String searchWord=scanner.nextLine();

        System.out.println("The given strings are: "+entryText);
        System.out.println("The given word is: "+searchWord);

        String entTextTArr[] = entryText.split("\s+");
        List <String> entList = new ArrayList <> (Arrays.asList(entTextTArr));

        searchWord=removeDuplicates(searchWord);
        System.out.println("\nThe strings containing all the letters of the given word are:");
        for(int i = 1; i<entList.size(); i++){
            checkExOfWord(searchWord, entList.get(i));
        }
    }
}
