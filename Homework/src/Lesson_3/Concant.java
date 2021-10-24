package Lesson_3;

import java.util.Scanner;

public class Concant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String basicText = "PHP Exercises and";
        String entText=scanner.nextLine();
        System.out.println(String.join(" ", basicText, entText));
    }
}
