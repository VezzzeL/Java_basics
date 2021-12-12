package Lesson_12;

public class Dog extends Pet{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    protected void voice() {
        System.out.println("woof");
    }

    @Override
    public String toString() {
        return name;
    }
}
