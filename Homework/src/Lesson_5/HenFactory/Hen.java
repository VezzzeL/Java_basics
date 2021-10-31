package Lesson5.ChickenFactory;

abstract class Hen {

    protected int eggsLayCapacityPerMonth = 30;

    abstract int getCountOfEggsPerMonth();
    public String getDescription(){
        return "I'm hen";
    }

}
