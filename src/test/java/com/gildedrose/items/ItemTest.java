package com.gildedrose.items;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {

    @Test
    public void testItemConstructor() {
        String name = "Test Item";
        int sellIn = 5;
        int quality = 10;

        Item item = new Item(name, sellIn, quality);

        assertEquals(name, item.name, "Name should be initialized correctly");
        assertEquals(sellIn, item.sellIn, "SellIn should be initialized correctly");
        assertEquals(quality, item.quality, "Quality should be initialized correctly");
    }

    @Test
    public void testToString() {
        String name = "Test Item";
        int sellIn = 5;
        int quality = 10;

        Item item = new Item(name, sellIn, quality);

        String expectedString = name + ", " + sellIn + ", " + quality;
        assertEquals(expectedString, item.toString(), "toString() should return the correct representation");
    }
}
