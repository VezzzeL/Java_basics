package Lesson_7_8;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Europe {
    Random random=new Random();
    Countries countries=new Countries();
    public void createCountry(String country){
        countries.addCountry(country);
    }
    public void cancelCountry(){
        countries.removeCountry();
    }
    public void showMeHistory(){
        countries.returnHistory();
    }
    private class Countries {
        ArrayList europeanCountries = new ArrayList(List.of("Austria", "Belgium", "Bulgaria", "Croatia", "Denmark",
                "Republic of Cyprus", "Czech Republic", "Estonia", "Finland", "France", "Germany", "Greece", "Hungary",
                "Ireland", "Italy", "Latvia", "Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal",
                "Romania", "Slovakia", "Slovenia", "Spain", "Sweden", "Ukraine"));
        ArrayList history=new ArrayList();

        private void removeCountry(){
            int temp=random.nextInt(europeanCountries.size());
            history.add(europeanCountries.get(temp)+" had been canceled");
            europeanCountries.remove(temp);
        }
        private void addCountry(String country){
            history.add("New country created -> "+country);
            europeanCountries.add(country);
        }
        private void returnHistory(){
            for(Object hist : history) {
                System.out.println(hist);
            }
        }
    }

    public static void main(String[] args) {
        Europe europe=new Europe();
        for (int i=0;i<3;i++){
            europe.cancelCountry();
        }
        europe.createCountry("Truhlandia");
        europe.showMeHistory();
    }
}
