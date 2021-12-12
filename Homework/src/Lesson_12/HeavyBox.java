package Lesson_12;


public class HeavyBox implements Comparable {

    private int length =2, height=4, weight=8;

    public HeavyBox(int length, int height, int weight) {
        this.length = length;
        this.height = height;
        this.weight = weight;
    }

    public HeavyBox() {
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBoxVolume(){
        return this.length*this.weight*this.height;
    }

    @Override
    public String toString() {
        return "Typical HeavyBox with parameters: " +
                "length = " + length +
                ", height = " + height +
                ", weight = " + weight;
    }

    @Override
    public int compareTo(Object heavyBox) {
        return this.getBoxVolume();
    }
}
