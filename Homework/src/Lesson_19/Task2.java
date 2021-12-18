package Lesson_19;

/*
Условие:
даны две коллекции collection1 = Arrays.asList(«a1», «a2», «a3», «a1») и collection2 = Arrays.asList(«1,2,0», «4,5»)
используя map функции

1)Добавить "_1" к каждому элементу первой коллекции
2)В первой коллекции убрать первый символ и вернуть массив чисел (int[])
3)Из второй коллекции получить все числа, перечисленные через запятую из всех элементов
4)Из второй коллекции получить сумму всех чисел, перечисленных через запятую
 */

import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> collection1 = Arrays.asList("a1","a2","a3","a1");
        List<String> collection2 = Arrays.asList("1,2,0", "4,5");
        //1
        collection1.stream()
                .map(s->s+"_1")
                .forEach(s-> System.out.println(s));
        //2
        int[]resFor2=collection1.stream()
                .mapToInt(s->Integer.parseInt(s.substring(1))).toArray();
        for (int res:resFor2){
            System.out.println(res);
        }
        //3
        collection2.stream()
                .flatMap(s->Arrays.asList(s.split(","))
                        .stream()).toList().stream()
                .forEach(s1-> System.out.print(s1+" "));
        //4
        int sum=collection2.stream()
                .flatMap(s->Arrays.asList(s.split(","))
                                .stream())
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println("\n"+sum);
    }
}
