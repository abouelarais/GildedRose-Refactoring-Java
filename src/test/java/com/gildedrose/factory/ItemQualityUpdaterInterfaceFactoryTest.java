package com.gildedrose.factory;

import com.gildedrose.items.Item;
import com.gildedrose.updaters.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ItemQualityUpdaterInterfaceFactoryTest {

    @Test
    public void shouldGetUpdaterForAgedBrieTest() {
        Item item = new Item("Aged Brie", 5, 10);
        ItemQualityUpdaterInterface updater = ItemQualityUpdaterFactory.getUpdater(item);
        assertInstanceOf(AgedBrieQualityUpdater.class, updater, "Should return AgedBrieQualityUpdaterInterface");
    }

    @Test
    public void shouldGetUpdaterForBackstagePassesTest() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10);
        ItemQualityUpdaterInterface updater = ItemQualityUpdaterFactory.getUpdater(item);
        assertInstanceOf(BackstagePassQualityUpdater.class, updater, "Should return BackstagePassQualityUpdaterInterface");
    }

    @Test
    public void shouldGetUpdaterForSulfurasTest() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        ItemQualityUpdaterInterface updater = ItemQualityUpdaterFactory.getUpdater(item);
        assertInstanceOf(SulfurasQualityUpdater.class, updater, "Should return SulfurasQualityUpdaterInterface");
    }

    @Test
    public void shouldGetUpdaterForNormalItemTest() {
        Item item = new Item("Normal Item", 5, 10);
        ItemQualityUpdaterInterface updater = ItemQualityUpdaterFactory.getUpdater(item);
        assertInstanceOf(NormalItemQualityUpdater.class, updater, "Should return NormalItemQualityUpdater");
    }
}
