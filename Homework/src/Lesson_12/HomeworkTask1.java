package Lesson_12;

import java.util.ArrayList;

public class HomeworkTask1 {

    public static void main(String[] args) {

        HeavyBox heavyBox1=new HeavyBox(3,6,16);
        HeavyBox heavyBox2=new HeavyBox(6,3,21);
        HeavyBox heavyBox3=new HeavyBox();

        //1.a:
        ArrayList<HeavyBox>heavyBoxes=new ArrayList<>();
        heavyBoxes.add(heavyBox1);
        heavyBoxes.add(heavyBox2);
        heavyBoxes.add(heavyBox3);

        //1.b:
        for (HeavyBox heavyBox : heavyBoxes) {
            System.out.println(heavyBox);
        }
        System.out.println();

        //1.c:
        heavyBoxes.get(0).setWeight(1);
        //1.g:
        heavyBoxes.remove(heavyBoxes.size()-1);
        //1.d:
        for (int i=0;i<heavyBoxes.size();i++){
            System.out.println(heavyBoxes.get(i));
        }
        System.out.println();

        System.out.println(heavyBoxes.toArray());
        System.out.println();

        System.out.println(heavyBoxes);
        System.out.println();
    //1.e:
        heavyBoxes.removeAll(heavyBoxes);
    }
}
