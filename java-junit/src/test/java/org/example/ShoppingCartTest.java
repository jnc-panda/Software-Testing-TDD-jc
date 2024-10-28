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
        Map<String, Double> expectedItem = new HashMap<>();


        Map<String, Double> result = ShoppingCart.addItems("newItem", 5);

        assertEquals(("newItem", result.);
    }

    @Test
    @DisplayName("tests price is updated when item is added")
    void testTotalPrice() {
    }
}