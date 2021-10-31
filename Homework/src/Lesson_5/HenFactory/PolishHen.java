package Lesson5.ChickenFactory;

public class PolishHen extends Hen{

    @Override
    public int getCountOfEggsPerMonth(){
        return (int) (super.eggsLayCapacityPerMonth*1.5);
    }
    @Override
    public String getDescription(){
        return super.getDescription()+". I'm from Poland. I'm laying "+getCountOfEggsPerMonth()+" eggs per month";
    }
}
