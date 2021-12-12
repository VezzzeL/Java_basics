package Lesson_12;

import java.util.ArrayList;

public class HomeworkTask7 {

    private static void findTooHeavyBoxes(ArrayList<HeavyBox> boxesList, ArrayList<HeavyBox>tooHeavyList){
        for(int i=0;i<boxesList.size();i++){
            if(boxesList.get(i).getWeight()>=300){
                tooHeavyList.add(boxesList.get(i));
            }
        }
        boxesList.removeAll(tooHeavyList);
    }

    public static void main(String[] args) {

        ArrayList<HeavyBox> heavyBoxes=new ArrayList();
        ArrayList<HeavyBox> tooHeavyBoxes=new ArrayList();

        heavyBoxes.add(new HeavyBox(3, 6, 150));
        heavyBoxes.add(new HeavyBox(6, 3, 450));
        heavyBoxes.add(new HeavyBox(5, 5, 300));
        heavyBoxes.add(new HeavyBox());

        findTooHeavyBoxes(heavyBoxes, tooHeavyBoxes);

        System.out.println(heavyBoxes);
        System.out.println(tooHeavyBoxes);
    }
}
