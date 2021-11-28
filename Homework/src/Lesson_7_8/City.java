package Lesson_7_8;

import java.util.ArrayList;
import java.util.Random;

public class City {
    Random random=new Random();
    CityAvenues cityAvenues=new CityAvenues();
    CityStreets cityStreets=new CityStreets();
    CitySquares citySquares=new CitySquares();
    String cityName;

    public City(String cityName) {
        this.cityName = cityName;
    }

    public void showInfo(){
    cityAvenues.generateAvenuesNames();
    cityStreets.generateStreetsNames();
    citySquares.generateSquaresNames();
        System.out.println(cityName);
    cityAvenues.printAvenues();
    cityStreets.printStreets();
    citySquares.printSquares();
    }

    private class CityAvenues{
        int quantityOfAvenues=random.nextInt(5);
        ArrayList avenues=new ArrayList();

        private void generateAvenuesNames(){
            for(int i=0;i<quantityOfAvenues;i++) {
                avenues.add("St Pedruchio "+random.nextInt(1000)+" avenue");
            }
        }
        private void printAvenues(){
            for (int i=0;i<avenues.size();i++){
            System.out.println(avenues.get(i));
            }
        }
    }
    private class CityStreets{
        int quantityOfStreets=random.nextInt(10);
        ArrayList streets=new ArrayList();

        private void generateStreetsNames(){
            for(int i=0;i<quantityOfStreets;i++) {
                streets.add("St Pedro "+random.nextInt(1000)+" street");
            }
        }
        private void printStreets(){
            for (int i=0;i<streets.size();i++){
                System.out.println(streets.get(i));
            }
        }
    }
    private class CitySquares{
        int quantityOfSquares=random.nextInt(7);
        ArrayList squares=new ArrayList();

        private void generateSquaresNames(){
            for(int i=0;i<quantityOfSquares;i++) {
                squares.add("Holy Charlotte "+random.nextInt(1000)+" square");
            }
        }
        private void printSquares(){
            for (int i=0;i<squares.size();i++){
                System.out.println(squares.get(i));
            }
        }
    }

    public static void main(String[] args) {
        City city=new City("Kenitra");
        city.showInfo();
    }
}
