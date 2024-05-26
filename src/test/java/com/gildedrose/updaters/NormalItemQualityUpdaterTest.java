package com.gildedrose.updaters;

import com.gildedrose.items.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalItemQualityUpdaterTest {

    private NormalItemQualityUpdater updater;

    @BeforeEach
    public void setUp() {
        updater = new NormalItemQualityUpdater();
    }

    @Test
    public void shouldUpdateQualityBeforeSellInDateTest() {
        Item item = new Item("Normal Item", 10, 20);
        updater.updateQuality(item);
        assertEquals(19, item.quality, "Quality should decrease by 1");
        assertEquals(9, item.sellIn, "SellIn should decrease by 1");
    }

    @Test
    public void shouldUpdateQualityOnSellInDateTest() {
        Item item = new Item("Normal Item", 0, 20);
        updater.updateQuality(item);
        assertEquals(19, item.quality, "Quality should decrease by 1 after sellIn date");
        assertEquals(-1, item.sellIn, "SellIn should decrease by 1");
    }

    @Test
    public void shouldUpdateQualityAfterSellInDateTest() {
        Item item = new Item("Normal Item", -1, 20);
        updater.updateQuality(item);
        assertEquals(18, item.quality, "Quality should decrease by 2 after sellIn date");
        assertEquals(-2, item.sellIn, "SellIn should decrease by 1");
    }

    @Test
    public void QualityShouldDoesNotBecomeNegativeTest() {
        Item item = new Item("Normal Item", 10, 0);
        updater.updateQuality(item);
        assertEquals(0, item.quality, "Quality should not become negative");
        assertEquals(9, item.sellIn, "SellIn should decrease by 1");
    }
}
