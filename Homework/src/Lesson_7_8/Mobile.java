package Lesson_7_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mobile {
    Random random=new Random();
    public void giveInfo(){
        new Nokia().showInfo();
        new Iphone().showInfo();
    }
    private class Nokia{
        String benchmark="Nokia_", model=benchmark+random.nextInt(9999);
        ArrayList functions=new ArrayList(List.of("Call","KillGods","Messages","Games", "Immortality"));
        private void showInfo(){
            System.out.println(model);
            System.out.println(functions);
        }
    }
    private class Iphone{
        String benchmark="Iphone ", model=benchmark+random.nextInt(12);
        ArrayList functions=new ArrayList(List.of("Call","Internet","Games","Messages"));
        private void showInfo(){
            System.out.println(model);
            System.out.println(functions);
        }
    }

    public static void main(String[] args) {
        Mobile mobile=new Mobile();
        mobile.giveInfo();
    }
}
