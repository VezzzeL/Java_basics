package Lesson_12;

import java.util.ArrayList;

public class HomeworkTask2 {

    public static void main(String[] args) {

        HeavyBox heavyBox1=new HeavyBox(3,6,16);
        HeavyBox heavyBox2=new HeavyBox(6,3,21);
        HeavyBox heavyBox3=new HeavyBox();

        ArrayList <HeavyBox> heavyBoxesList=new ArrayList<HeavyBox>();
        heavyBoxesList.add(heavyBox1);
        heavyBoxesList.add(heavyBox2);
        heavyBoxesList.add(heavyBox3);

        //2.1
        HeavyBox [] arrHeavyBoxes1 = new HeavyBox[heavyBoxesList.size()];
        for (int i=0; i<arrHeavyBoxes1.length;i++){
            arrHeavyBoxes1[i]=heavyBoxesList.get(i);
            System.out.println(arrHeavyBoxes1[i]);
        }

        System.out.println();

        //2.2
        Object [] arrHeavyBoxes2 = heavyBoxesList.toArray();
        for(Object hbox:arrHeavyBoxes2){
            System.out.println(hbox);
        }

        System.out.println();

        //2.3
        HeavyBox [] arrHeavyBoxes3=heavyBoxesList.toArray(HeavyBox[]::new);
        for(Object hbox:arrHeavyBoxes3){
            System.out.println(hbox);
        }
    }
}
