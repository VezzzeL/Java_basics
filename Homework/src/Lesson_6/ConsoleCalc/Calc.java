package Lesson6.ConsoleCalculator;

import java.util.Scanner;

public class Calc implements BasicOperations {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        System.out.printf("%.2f",BasicOperations.completeOperation(input));

    }
}
