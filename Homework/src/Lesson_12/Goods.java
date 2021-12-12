package Lesson_12;


import java.util.Comparator;

public class Goods{
    private String name="undefined good";
    private double price=1.0, rating=1.0;


    public Goods(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Goods() {
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

//    class NamesComparator implements Comparator<Goods>{
//        public int compare(Goods goodName1, Goods goodName2){
//            return goodName1.getName().compareTo(goodName2.getName());
//        }
//    }
//    class PriceComparator implements Comparator<Goods>{
//        public int compare(Goods goodPrice1, Goods goodPrice2) {
//            if(goodPrice1.getPrice()-goodPrice2.getPrice()<0){
//                return 1;
//            }else {
//                return 0;
//            }
//        }
//    }
//    class RatingComparator implements Comparator<Goods>{
//        public int compare(Goods goodRating1, Goods goodRating2) {
//            if(goodRating1.getPrice()-goodRating2.getPrice()<0){
//                return 1;
//            }else {
//                return 0;
//            }
//        }
//    }
}

