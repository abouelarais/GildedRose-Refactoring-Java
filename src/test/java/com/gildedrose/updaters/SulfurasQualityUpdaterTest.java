package com.gildedrose.updaters;

import com.gildedrose.items.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SulfurasQualityUpdaterTest {

    private SulfurasQualityUpdater updater;

    @BeforeEach
    public void setUp() {
        updater = new SulfurasQualityUpdater();
    }

    @Test
    public void shouldUpdateQualityTest() {
        Item sulfuras = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        updater.updateQuality(sulfuras);
        assertEquals(80, sulfuras.quality, "Quality should remain unchanged");
        assertEquals(0, sulfuras.sellIn, "SellIn should remain unchanged");
    }
}
