package Lesson6.DegreesConverter;

import java.util.Scanner;

public class BaseConverter implements DegreeConverter{

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter base unit(C or K or F)");
        String baseUnit=scanner.next();
        System.out.println("Enter degree");
        double baseDegree=scanner.nextDouble();
        System.out.println("Enter result unit (C or K or F)");
        String resultUnit=scanner.next();

        System.out.printf("%.2f", DegreeConverter.convert(baseUnit, resultUnit, baseDegree));
    }
}
