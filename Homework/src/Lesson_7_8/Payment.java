package Lesson_7_8;

import java.util.ArrayList;
import java.util.Random;

public class Payment {

    ArrayList toPayList=new ArrayList();

    int paymentLimit =0;

    public void choseGoods(){
        Basket basket = new Basket();
        basket.buySmth();
    }

    public void pay(){
        System.out.println("You created a payment for:");
        for(int i=0;i<paymentLimit;i++){
            System.out.println(toPayList.get(i));
        }
    }

    private class Basket{

        String[]goods={"Apple","Bicycle","Beer","Water","Trumpet"};
        private void buySmth() {
            Random random=new Random();
            int counter=random.nextInt(5);
            if (counter == 0) {
                toPayList.add("NOTHING");
                paymentLimit++;
            } else {
                for (int i = random.nextInt(counter); i <= counter; i++) {
                    toPayList.add(goods[i]);
                    paymentLimit++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Payment payment=new Payment();
        payment.choseGoods();
        payment.pay();
    }
}
