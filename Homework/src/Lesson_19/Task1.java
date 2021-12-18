package Lesson_19;

import java.util.Arrays;
import java.util.List;

/*
Условие:
дана коллекция строк Arrays.asList(«a1», «a2», «a3», «a1»)
используя методы filter, findFirst, findAny, skip и count:

1)Вернуть количество вхождений объекта «a1»
2)Вернуть первый элемент коллекции или 0, если коллекция пуста
3)Вернуть последний элемент коллекции или «empty», если коллекция пуста
4)Найти элемент в коллекции равный «a3» или кинуть ошибку
5)Вернуть третий элемент коллекции по порядку
6)Вернуть два элемента начиная со второго
7)Выбрать все элементы по шаблону (елемент имеет 1 в имени)
*/

public class Task1 {
    public static void main(String[] args) {
        //1
        System.out.println(Arrays.asList("a1","a2","a3","a1")
                .stream()
                .filter("a1"::equals)
                .count());
        //2
        System.out.println(Arrays.asList("a1","a2","a3","a1")
                .stream()
                .findFirst()
                .orElse("0"));
        //3
        List<String> temp=Arrays.asList("a1","a2","a3","a1");
        System.out.println(temp.stream()
                .skip(temp.size()-1)
                .findFirst()
                .orElse("empty"));
        //4
        System.out.println(Arrays.asList("a1","a2","a3","a1")
                .stream()
                .filter("a3"::equals)
                .findFirst()
                .get());
        //5
        System.out.println(Arrays.asList("a1","a2","a3","a1")
                .stream()
                .skip(2)
                .findFirst()
                .get());
        //6
        Arrays.asList("a1","a2","a3","a1")
                .stream()
                .skip(1)
                .limit(2)
                .forEach(s-> System.out.println(s));
        //7
        Arrays.asList("a1","a2","a3","a1")
                .stream()
                .filter(s->s.contains("1"))
                .forEach(s-> System.out.println(s));
    }
}
