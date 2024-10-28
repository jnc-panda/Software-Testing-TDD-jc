package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    @DisplayName("tests adding a new item updates the list of items")
    void testAddingItems() {
        ShoppingCart cart1 = new ShoppingCart();
        cart1.addItems("apple", 1);

        assertEquals(new ShoppingCart().addItems("apple", 1), cart1.getItems());

    }

    @Test
    @DisplayName("tests price is updated when item is added")
    void testTotalPrice() {
        ShoppingCart cart1 = new ShoppingCart();
        cart1.addItems("banana", 2);
        cart1.addItems("orange", 3);
        cart1.addItems("beef", 10);
        cart1.addItems("bread", 0.9);
        cart1.addItems("pasta", 5);

        assertEquals(20.9, cart1.totalPrice(cart1.getItems()));
    }


}