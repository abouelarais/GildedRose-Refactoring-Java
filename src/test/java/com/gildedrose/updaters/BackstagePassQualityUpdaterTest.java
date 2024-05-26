package com.gildedrose.updaters;

import com.gildedrose.items.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BackstagePassQualityUpdaterTest {

    @Test
    void shouldIncreaseQualityByOneBeforeElevenDaysTest() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 10);
        BackstagePassQualityUpdater updater = new BackstagePassQualityUpdater();

        updater.updateQuality(item);

        assertEquals(11, item.quality);
        assertEquals(14, item.sellIn);
    }

    @Test
    void shouldIncreaseQualityByTwoBeforeTenDaysTest() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10);
        BackstagePassQualityUpdater updater = new BackstagePassQualityUpdater();

        updater.updateQuality(item);

        assertEquals(12, item.quality);
        assertEquals(9, item.sellIn);
    }

    @Test
    void shouldIncreaseQualityByThreeBeforeFiveDaysTest() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10);
        BackstagePassQualityUpdater updater = new BackstagePassQualityUpdater();

        updater.updateQuality(item);

        assertEquals(13, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    void shouldNotIncreaseQualityAboveFiftyTest() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 50);
        BackstagePassQualityUpdater updater = new BackstagePassQualityUpdater();

        updater.updateQuality(item);

        assertEquals(50, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    void shouldSetQualityToZeroAfterSellByDateTest() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", -1, 10);
        BackstagePassQualityUpdater updater = new BackstagePassQualityUpdater();

        updater.updateQuality(item);

        assertEquals(0, item.quality);
        assertEquals(-2, item.sellIn);
    }
}
