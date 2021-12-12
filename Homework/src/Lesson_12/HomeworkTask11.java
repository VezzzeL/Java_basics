package Lesson_12;

import java.util.ArrayList;
import java.util.Comparator;

public class HomeworkTask11 {


    static class NamesComparator implements Comparator<Goods>{
        public int compare(Goods goodName1, Goods goodName2){
            return goodName1.getName().compareTo(goodName2.getName());
        }
    }
    static class PriceComparator implements Comparator<Goods> {
        public int compare(Goods goodPrice1, Goods goodPrice2) {
            if(goodPrice1.getPrice()-goodPrice2.getPrice()<0){
                return 1;
            }else {
                return -1;
            }
        }
    }
    static class RatingComparator implements Comparator<Goods>{
        public int compare(Goods goodRating1, Goods goodRating2) {
            if(goodRating1.getRating()-goodRating2.getRating()<0){
                return 1;
            }else {
                return -1;
            }
        }
    }
    
    public static void main(String[] args) {
        NamesComparator namesComparator=new NamesComparator();
        PriceComparator priceComparator=new PriceComparator();
        RatingComparator ratingComparator=new RatingComparator();

        Goods good1=new Goods("violin",999.99,2);
        Goods good2=new Goods("trumpet",899.99,3);
        Goods good3=new Goods("drums",799.99,4);
        Goods good4=new Goods("guitar",699.99,5);
        Goods good5=new Goods();

        ArrayList<Goods>catalog=new ArrayList<>();
        catalog.add(good1);
        catalog.add(good2);
        catalog.add(good3);
        catalog.add(good4);
        catalog.add(good5);

        System.out.println("Sorted by names:");
        catalog.sort(namesComparator);
        System.out.println(catalog);

        catalog.sort(namesComparator.reversed());
        System.out.println(catalog);

        System.out.println("Sorted by rating:");
        catalog.sort(ratingComparator);
        System.out.println(catalog);

        catalog.sort(ratingComparator.reversed());
        System.out.println(catalog);

        System.out.println("Sorted by price:");
        catalog.sort(priceComparator);
        System.out.println(catalog);

        catalog.sort(priceComparator.reversed());
        System.out.println(catalog);

        System.out.println();
    }
}
