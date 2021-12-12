package Lesson_12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HomeworkTask5 {

    private static void union(Set<Integer>set1, Set<Integer>set2){
        Set<Integer>unitedSet=new HashSet<>(set1);
        unitedSet.addAll(set2);
        System.out.println(unitedSet);
    }

    private static void intersect(Set<Integer>set1, Set<Integer>set2){
        Set<Integer>intersect=new HashSet<Integer>(set1);
        intersect.retainAll(set2);
        System.out.println(intersect);
    }

    public static void main(String[] args) {

        Set<Integer>testSet1=new HashSet<>();
        Set<Integer>testSet2=new HashSet<>();


        testSet1.add(2);
        testSet1.add(3);
        testSet1.add(4);

        testSet2.add(4);
        testSet2.add(5);
        testSet2.add(6);

        union(testSet1,testSet2);
        intersect(testSet1,testSet2);
    }
}
