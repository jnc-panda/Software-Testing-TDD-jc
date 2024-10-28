package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    public Map<String, Double> getItems() {
        return items;
    }

    public void setItems(Map<String, Double> items) {
        this.items = items;
    }

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
}
