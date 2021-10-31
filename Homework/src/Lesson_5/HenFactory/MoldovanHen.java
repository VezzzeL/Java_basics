package Lesson5.ChickenFactory;

public class MoldovanHen extends Hen {

    @Override
    int getCountOfEggsPerMonth(){
        return (int) (super.eggsLayCapacityPerMonth*1.3);
    }
    @Override
    public String getDescription(){
        return super.getDescription()+". I'm from Moldova. I'm laying "+getCountOfEggsPerMonth()+" eggs per month";
    }
}
