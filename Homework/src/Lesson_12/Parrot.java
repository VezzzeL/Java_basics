package Lesson_12;

public class Parrot extends Pet{
    private String name;

    public Parrot(String name) {
        this.name = name;
    }

    @Override
    protected void voice() {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
