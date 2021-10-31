package Lesson5.ChickenFactory;

public class UkrainianHen extends Hen{

    @Override
    public int getCountOfEggsPerMonth(){
        return super.eggsLayCapacityPerMonth*2;
    }
    @Override
    public String getDescription(){
        return super.getDescription()+". I'm from Ukraine. I'm laying "+getCountOfEggsPerMonth()+" eggs per month";
    }
}
