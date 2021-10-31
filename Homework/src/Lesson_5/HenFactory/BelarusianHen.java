package Lesson5.ChickenFactory;

public class BelarusianHen extends Hen{

    @Override
    public int getCountOfEggsPerMonth(){
        return (int) (super.eggsLayCapacityPerMonth*0.8);
    }

    @Override
    public String getDescription(){
        return super.getDescription()+". I'm from Belarus. I'm laying "+getCountOfEggsPerMonth()+" eggs per month";
    }
}
