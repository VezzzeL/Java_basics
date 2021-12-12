package Lesson_12;

import java.util.TreeSet;

public class HomeworkTask3{
    public static void main(String[] args) {
        HeavyBox heavyBox1=new HeavyBox(6,11,16);
        HeavyBox heavyBox2=new HeavyBox(3,2,1);
        HeavyBox heavyBox3=new HeavyBox();

        TreeSet<HeavyBox> heavyBoxTreeSet=new TreeSet<>();
        heavyBoxTreeSet.add(heavyBox1);
        heavyBoxTreeSet.add(heavyBox2);
        heavyBoxTreeSet.add(heavyBox3);

        for (HeavyBox heavyBox : heavyBoxTreeSet) {
            System.out.println(heavyBox);
        }

    }
}
