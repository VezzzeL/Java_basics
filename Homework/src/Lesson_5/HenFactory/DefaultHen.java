package Lesson5.ChickenFactory;

import java.util.Random;

public class DefaultHen extends Hen{

    Random random = new Random();

    @Override
    int getCountOfEggsPerMonth() {
        return (random.nextInt(20)+10);
    }

    @Override
    public String getDescription(){
        return "I'm hen. My presence here is a mystery. I'm laying "+getCountOfEggsPerMonth()+" eggs per month";
    }
}
