package Lesson_12;

import java.util.HashMap;
import java.util.Map;

public class HomeworkTask10 {
    private static void printPetTypes(Map<String,Pet>petMap){
        for(String petType:petMap.keySet()){
            System.out.println(petType);
        }

    }
    public static void main(String[] args) {
        Map<String,Pet> petMap = new HashMap<>();
        petMap.put("cat",new Cat("Charlotte"));
        petMap.put("dog",new Dog("York"));
        petMap.put("parrot",new Parrot("Pedro"));

        printPetTypes(petMap);
    }

}
