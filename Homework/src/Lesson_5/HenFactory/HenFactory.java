package Lesson5.ChickenFactory;

public class HenFactory {

    public static Hen getHen(String country){
        switch (country) {
            case "Ukraine":
                return new UkrainianHen();
            case "Belarus":
                return new BelarusianHen();
            case "Moldova":
                return new MoldovanHen();
            case "Poland":
                return new PolishHen();
            default:
                return new DefaultHen();
        }
    }

    public static void main(String[] args) {
     String henList[]={"Ukraine","Belarus","Moldova","Poland","Italy","Ukraine",""};
     for(int i=0;i<henList.length;i++){
         Hen chick=getHen(henList[i]);
         System.out.println(chick.getDescription());
     }
    }
}
