package com.gildedrose.updaters;

import com.gildedrose.items.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AgedBrieQualityUpdaterTest {

    @Test
    void shouldIncreaseQualityBeforeSellByDateTest() {
        Item item = new Item("Aged Brie", 5, 10);
        AgedBrieQualityUpdater updater = new AgedBrieQualityUpdater();

        updater.updateQuality(item);

        assertEquals(11, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    void shouldNotIncreaseQualityAboveFiftyTest() {
        Item item = new Item("Aged Brie", 5, 50);
        AgedBrieQualityUpdater updater = new AgedBrieQualityUpdater();

        updater.updateQuality(item);

        assertEquals(50, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    void shouldIncreaseQualityTwiceAfterSellByDateTest() {
        Item item = new Item("Aged Brie", -1, 48);
        AgedBrieQualityUpdater updater = new AgedBrieQualityUpdater();

        updater.updateQuality(item);

        assertEquals(50, item.quality);
        assertEquals(-2, item.sellIn);
    }

    @Test
    void shouldNotIncreaseQualityAboveFiftyAfterSellByDateTest() {
        Item item = new Item("Aged Brie", -1, 50);
        AgedBrieQualityUpdater updater = new AgedBrieQualityUpdater();

        updater.updateQuality(item);

        assertEquals(50, item.quality);
        assertEquals(-2, item.sellIn);
    }
}
