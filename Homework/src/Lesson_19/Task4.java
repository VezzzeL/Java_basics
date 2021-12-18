package Lesson_19;

/*
Условие:
Дана коллекция чисел Arrays.asList(1, 2, 3, 4, 2)
используя reduce.

1)Получить сумму чисел или вернуть 0
2)Вернуть максимум или -1
3)Вернуть сумму нечетных чисел или 0
 */

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        //1
        System.out.println(Arrays.asList(1, 2, 3, 4, 2).stream()
                .reduce((i1,i2)->i1+i2)
                .orElse(0));

        //2
        System.out.println(Arrays.asList(1, 2, 3, 4, 2).stream()
                .reduce(Integer::max)
                .orElse(-1));

        //3
        System.out.println(Arrays.asList(1, 2, 3, 4, 2).stream()
                .filter(i->i%2!=0)
                .reduce((i1,i2)->i1+i2)
                .orElse(0));
    }
}
