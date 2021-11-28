package Lesson_7_8;


import java.util.ArrayList;

public class Account {
    private int id=10000, balance=100_000, cash=100, counter=0;
    Operations operations=new Operations();
    ArrayList<String> operationsHistory=new ArrayList<>();

    public void makeOperation(String operation, int value) {

        switch (operation) {
            case "toCash":
               operations.intoCash(value);
               break;
            case "pay":
                operations.pay(value);
                break;
            case "earnIncome":
                operations.earnIncome(value);
                break;
            default:
                operationsHistory.add("Wrong type of operation detected. Balance hadn't been change");
                counter++;
        }
    }
    public void getHistory(){
        System.out.println("Account id : "+id);
        operations.returnHistory();
    }

    private class Operations{

        private void earnIncome(int income){
            balance=balance+income;
            operationsHistory.add("Income: "+income+"; Actual balance: "+balance);
            counter++;
        }
        private void intoCash(int toCash){
            balance=balance-toCash;
            cash=cash+toCash;
            operationsHistory.add("Into cash:  "+toCash+"; Actual balance: "+balance);
            counter++;
        }
        private void pay(int payment){
            balance=balance-payment;
            operationsHistory.add("Created a payment for: "+payment+"; Actual balance: "+balance);
            counter++;
        }
        private void returnHistory(){
            for(int i=0;i<counter;i++){
                System.out.println("Operation "+(i+1));
                System.out.println(operationsHistory.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Account account=new Account();
        account.makeOperation("toCash",5000);
        account.makeOperation("earnIncome",150_000);
        account.makeOperation("pay",52_000);
        account.makeOperation("toGift",100_000);
        account.getHistory();
    }
}
