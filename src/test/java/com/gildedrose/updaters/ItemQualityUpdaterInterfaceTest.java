package com.gildedrose.updaters;

import com.gildedrose.items.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemQualityUpdaterInterfaceTest {

    @Test
    void shouldUpdateQualityTest() {
        Item item = new Item("Test Item", 10, 20);
        shouldItemQualityUpdaterInterfaceTest updater = new shouldItemQualityUpdaterInterfaceTest();

        updater.updateQuality(item);

        assertEquals(9, item.sellIn);
        assertEquals(19, item.quality);
    }

    private static class shouldItemQualityUpdaterInterfaceTest implements ItemQualityUpdaterInterface {
        @Override
        public void updateQuality(Item item) {
            item.sellIn--;
            item.quality--;
        }
    }
}
