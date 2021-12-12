package Lesson_12;

public class Product {
    private double price;
    private String action="sing", name;
    private int id=0;

    public Product(double price, String name) {
        this.price = price;
        this.action = name;
    }

    public Product(int number) {
        price=1.0;
        name="Joy "+number;
    }

    public double getPrice() {
        return price;
    }

    public String getAction() {
        return action;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", action='" + action + '\'';
    }
}
