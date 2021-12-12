package Lesson_12;

import java.util.ArrayList;
import java.util.HashMap;

public class HomeworkTask8 {

    private static void createInputProducts(int quantity, ArrayList<String>names, ArrayList<Product>products){
        for (int i=0;i<quantity;i++){
            products.add(new Product(i));
            names.add((products.get(i)).getName());
        }
    }

    private static void getMapKeys(HashMap<String,Product> map){
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }

    private static void getMapValues(HashMap<String,Product> map){
        for (Product product : map.values()) {
            System.out.println(product);
        }
    }

    private static void getMapEntries(HashMap<String,Product> map){
        for (Object entry: map.entrySet()) {
            System.out.println(entry);
        }
    }


    public static void main(String[] args) {

        ArrayList<String>namesList=new ArrayList<>();
        ArrayList<Product>products=new ArrayList<>();
        int quantity=10;

        createInputProducts(quantity,namesList,products);

        HashMap<String, Product>productsHashMap=new HashMap<>();
        for(int i=0;i<quantity;i++){
            productsHashMap.put(namesList.get(i),products.get(i));
        }

        getMapEntries(productsHashMap);
        System.out.println();

        getMapKeys(productsHashMap);
        System.out.println();

        getMapValues(productsHashMap);
    }
}
