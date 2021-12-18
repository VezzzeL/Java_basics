package Lesson_19;

/*
Условие:
Дана коллекция строк Arrays.asList(«a1», «b2», «c3», «a1»)
используя collect и toArray

1)Получить список без дубликатов
2)Получить массив строк без дубликатов и в верхнем регистре
3)Объединить все элементы в одну строку через разделитель ':' и обернуть тегами <b>… </b>
4)Преобразовать в map, где первый символ ключ, второй символ значение
5)Преобразовать в map, сгруппировав по первому символу строки
6)Преобразовать в map, сгруппировав по первому символу строки и объединим вторые символы через ':'
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        //1
        List<String>list1=Arrays.asList("a1", "b2", "c3", "a1").stream()
                .distinct()
                .collect(Collectors.toList());
        for(String elem:list1){
            System.out.print(elem+" ");
        }

        System.out.println();

        //2
        String[]array2=Arrays.asList("a1", "b2", "c3", "a1").stream()
                .distinct()
                .map(String::toUpperCase)
                .toArray(String[]::new);
        for(String elem:array2){
            System.out.print(elem+" ");
        }

        System.out.println();

        //3
        System.out.println(Arrays.asList("a1", "b2", "c3", "a1").stream()
                .collect(Collectors.joining(":","<b>","</b>")));

        //4
        Map<String,String> map4=Arrays.asList("a1", "b2", "c3", "a1").stream()
                .distinct()
                .collect(Collectors.toMap(s->s.substring(0,1),s->s.substring(1,2)));
        System.out.println(map4);

        //5
        Map<Object, List<String>> map5=Arrays.asList("a1", "b2", "c3", "a1").stream()
                .collect(Collectors.groupingBy(s->s.substring(0,1)));
        System.out.println(map5);

        //6
        Map<String,String> map6=Arrays.asList("a1", "b2", "c3", "a1").stream()
                .collect(Collectors.groupingBy(s->s.substring(0,1),
                        Collectors.mapping(s->s.substring(1,2),
                        Collectors.joining(":"))));
        System.out.println(map6);

    }
}
