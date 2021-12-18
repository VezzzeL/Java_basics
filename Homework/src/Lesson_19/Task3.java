package Lesson_19;

/*
Условие:
даны две коллекции коллекция строк Arrays.asList(«a1», «a4», «a3», «a2», «a1», «a4»)
и коллекция людей класса People (с полями name — имя, age — возраст, sex — пол),
вида Arrays.asList( new People(«Pedro», 16, Sex.MAN), new People(«Francois», 23, Sex.MAN),
new People(«Helen», 42, Sex.WOMAN),
new People(«Florian Baptiste», 69, Sex.MAN)).

1)Отсортировать коллекцию строк по алфавиту
2)Отсортировать коллекцию строк по алфавиту в обратном порядке
3)Отсортировать коллекцию строк по алфавиту и убрать дубликаты
4)Отсортировать коллекцию строк по алфавиту в обратном порядке и убрать дубликаты
5)Отсортировать коллекцию людей по имени в обратном алфавитном порядке
6)Отсортировать коллекцию людей сначала по полу, а потом по возрасту
7)Найти максимальное значение среди коллекции строк
8)Найти минимальное значение среди коллекции строк
9)Найдем человека с максимальным возрастом
10)Найдем человека с минимальным возрастом
 */

import java.util.Arrays;
import java.util.Comparator;

public class Task3 {

    private enum Sex{
        MAN,WOMAN
    }

    private static class People{
        private int age;
        private String name;
        private Sex sex;

        public People(String name,int age, Sex sex) {
            this.name = name;
            this.age = age;
            this.sex=sex;

        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public Sex getSex() {
            return sex;
        }

        @Override
        public String toString() {
            return "Name-"+name+
                    " age-" + age +
                    " sex=" + sex;
        }
    }

    public static void main(String[] args) {
        //1
        Arrays.asList("a1", "a4", "a3", "a2", "a1", "a4").stream()
                .sorted()
                .forEach(s-> System.out.print(s+" "));

        System.out.println("\n");

        //2
        Arrays.asList("a1", "a4", "a3", "a2", "a1", "a4").stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s-> System.out.print(s+" "));

        System.out.println("\n");

        //3
        Arrays.asList("a1", "a4", "a3", "a2", "a1", "a4").stream()
                .distinct()
                .sorted()
                .forEach(s-> System.out.print(s+" "));

        System.out.println("\n");

        //4
        Arrays.asList("a1", "a4", "a3", "a2", "a1", "a4").stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(s-> System.out.print(s+" "));

        System.out.println("\n");

        //5
        Arrays.asList(new People("Pedro", 16, Sex.MAN), new People("Francois", 23, Sex.MAN),
                new People("Helen", 42, Sex.WOMAN), new People("Florian Baptiste", 69, Sex.MAN))
                    .stream()
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                .forEach(person-> System.out.println(person));

        System.out.println();

        //6
        Arrays.asList(new People("Pedro", 16, Sex.MAN), new People("Francois", 23, Sex.MAN),
                new People("Helen", 42, Sex.WOMAN), new People("Florian Baptiste", 69, Sex.MAN))
                .stream()
                .sorted((o1, o2) -> o1.getSex()!=o2.getSex()?
                        o1.getSex().compareTo(o2.getSex()):
                        o1.getAge()-o2.getAge()<0? 1 : -1)
                .forEach(person-> System.out.println(person));

        System.out.println();

        //7
        System.out.println(Arrays.asList("a1", "a4", "a3", "a2", "a1", "a4").stream()
                .max(String::compareTo).get());

        System.out.println();

        //8
        System.out.println(Arrays.asList("a1", "a4", "a3", "a2", "a1", "a4").stream()
                .min(String::compareTo).get());

        System.out.println();

        //9

        System.out.println(Arrays.asList(new People("Pedro", 16, Sex.MAN),
                                            new People("Francois", 23, Sex.MAN),
                                            new People("Helen", 42, Sex.WOMAN),
                                            new People("Florian Baptiste", 69, Sex.MAN))
                .stream()
                .max((o1, o2) -> o1.getAge()- o2.getAge()<0 ? -1 : 1).get());

        System.out.println();

        //10

        System.out.println(Arrays.asList(new People("Pedro", 16, Sex.MAN),
                        new People("Francois", 23, Sex.MAN),
                        new People("Helen", 42, Sex.WOMAN),
                        new People("Florian Baptiste", 69, Sex.MAN))
                .stream()
                .min((o1, o2) -> o1.getAge()- o2.getAge()<0 ? -1 : 1).get());
    }
}
