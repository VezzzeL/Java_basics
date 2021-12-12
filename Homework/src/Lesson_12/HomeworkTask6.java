package Lesson_12;

import java.util.ArrayDeque;


public class HomeworkTask6 {

    public static void main(String[] args) {
        HeavyBox heavyBox1=new HeavyBox(3,6,16);
        HeavyBox heavyBox2=new HeavyBox(6,3,21);
        HeavyBox heavyBox3=new HeavyBox();

        ArrayDeque<HeavyBox>boxesDeque=new ArrayDeque<>();
        boxesDeque.offer(heavyBox1);
        boxesDeque.offer(heavyBox2);
        boxesDeque.offer(heavyBox3);

        System.out.println(boxesDeque);

        boxesDeque.poll();
        System.out.println(boxesDeque);

        boxesDeque.poll();
        System.out.println(boxesDeque);

        boxesDeque.poll();
        System.out.println(boxesDeque);

    }
}
