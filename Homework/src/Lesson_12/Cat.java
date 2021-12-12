package Lesson_12;

public class Cat extends Pet {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    protected void voice() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return name;
    }
}
