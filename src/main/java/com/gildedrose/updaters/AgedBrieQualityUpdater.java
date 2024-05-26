package com.gildedrose.updaters;

import com.gildedrose.items.Item;

/**
 * An implementation of {@link ItemQualityUpdaterInterface} for updating the quality of Aged Brie items.
 * Aged Brie items increase in quality over time, even after their sellIn date has passed.
 */
public class AgedBrieQualityUpdater implements ItemQualityUpdaterInterface {

    /**
     * Updates the quality of the Aged Brie item.
     *
     * @param item The Aged Brie item to update.
     */
    @Override
    public void updateQuality(Item item) {
        increaseQuality(item);
        item.sellIn--;
    }

    /**
     * Increases the quality of the item.
     * Quality increases over time, even after the sellIn date has passed.
     *
     * @param item The item whose quality to increase.
     */
    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }

        if (item.sellIn < 0 && item.quality < 50) {
            item.quality++;
        }
    }
}
