package org.example;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    double discount;

    private static Map<String, Double> items = new HashMap<>();

    public Map<String, Double> addItems(String itemName, double price) {
        items.put(itemName, price);
        return items;
    }

    public double totalPrice(Map<String, Double> items) {
        double totalPrice = 0;
        for(double i : items.values()) {
            totalPrice += i;
        }
        return totalPrice;
    }

    public static Map<String, Double> getItems() {
        return items;
    }

    public short applyDiscount(double percentOff) {
        discount = percentOff;
        for(String item : items.keySet()){
            double newPrice = items.get(item)*(1-(percentOff*0.01));
            items.replace(item, newPrice);
        }
        return 0;
    }
}
