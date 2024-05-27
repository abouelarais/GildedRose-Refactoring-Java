package com.gildedrose.updaters;

import com.gildedrose.items.Item;

/**
 * An implementation of {@link ItemQualityUpdaterInterface} for updating the quality of normal items.
 * Normal items decrease in quality over time, with a possible accelerated decrease after their sellIn date.
 */
public class NormalItemQualityUpdater implements ItemQualityUpdaterInterface {

    /**
     * Updates the quality of the normal item.
     *
     * @param item The normal item to update. Quality decreases by 1, and sellIn decreases by 1.
     */
    @Override
    public void updateQuality(Item item) {
        decreaseQuality(item);
        item.sellIn--;
    }

    /**
     * Decreases the quality of the item.
     * Quality decreases by 1, and if sellIn is less than 0, quality decreases by an additional 1.
     *
     * @param item The item whose quality to decrease.
     */
    private void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }

        if (item.sellIn < 0 && item.quality > 0) {
            item.quality--;
        }
    }

}
