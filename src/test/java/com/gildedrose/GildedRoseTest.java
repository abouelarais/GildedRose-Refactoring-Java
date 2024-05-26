package com.gildedrose;

import com.gildedrose.items.Item;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        List<Item> items = Collections.singletonList(new Item("foo", 0, 0));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items.get(0).name);
    }

    @Test
    void shouldUpdateQuality_NormalItemTest() {
        List<Item> items = Collections.singletonList(new Item("Normal Item", 10, 20));

        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Normal Item", app.items.get(0).name);
        assertEquals(9, app.items.get(0).sellIn);
        assertEquals(19, app.items.get(0).quality);
    }

    @Test
    void shouldUpdateQuality_AgedBrie() {

        List<Item> items = Collections.singletonList(new Item("Aged Brie", 10, 20));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items.get(0).name);
        assertEquals(9, app.items.get(0).sellIn);
        assertEquals(21, app.items.get(0).quality);
    }

    @Test
    void shouldUpdateQuality_BackstagePasses() {
        List<Item> items = Collections.singletonList(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items.get(0).name);
        assertEquals(9, app.items.get(0).sellIn);
        assertEquals(22, app.items.get(0).quality);
    }

    @Test
    void shouldUpdateQuality_SulfurasTest() {
        List<Item> items = Collections.singletonList(new Item("Sulfuras, Hand of Ragnaros", 10, 80));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items.get(0).name);
        assertEquals(10, app.items.get(0).sellIn);
        assertEquals(80, app.items.get(0).quality);
    }

    @Test
    void shouldUpdateQuality_BackstagePassesAfterConcertTest() {
        List<Item> items = Collections.singletonList(new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items.get(0).name);
        assertEquals(-1, app.items.get(0).sellIn);
        assertEquals(0, app.items.get(0).quality);
    }

    @Test
    void shouldUpdateQuality_AgedBrieMaxQualityTest() {
        List<Item> items = Collections.singletonList(new Item("Aged Brie", 10, 50));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items.get(0).name);
        assertEquals(9, app.items.get(0).sellIn);
        assertEquals(50, app.items.get(0).quality);
    }

}
