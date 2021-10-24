package Lesson_2;

import java.util.Scanner;

public class EzPuzzle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Синій, великий, з вусами і заповнений зайцями - що це?");
        int i =0;
        while(i<3){
            String res=scanner.next();
            if(res.equals("Тролейбус")){
                System.out.println("Правильно!");
                break;
            }else if(res.equals("Здаюсь")){
                System.out.println("Правильна відповідь: \"Тролейбус\"");
                break;
            }else{
                System.out.println("Подумайте ще");
            }
            i++;
        }
    }
}
