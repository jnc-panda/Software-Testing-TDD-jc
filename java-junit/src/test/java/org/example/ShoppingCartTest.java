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

    @Test
    @DisplayName("tests discount is applied and stored in shopping cart")
    void testDiscountApplied() {
        ShoppingCart cart1 = new ShoppingCart();
        cart1.addItems("banana", 2);
        cart1.addItems("orange", 3);
        cart1.addItems("beef", 10);
        cart1.addItems("bread", 0.9);
        cart1.addItems("pasta", 5);

        cart1.applyDiscount(20.0);


        assertEquals(20.0, cart1.discount);
        assertEquals(0.8*20.9, cart1.applyDiscount(cart1.totalPrice(cart1.getItems())));


        }
    }
}