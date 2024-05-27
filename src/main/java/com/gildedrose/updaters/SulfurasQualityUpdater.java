package com.gildedrose.updaters;

import com.gildedrose.items.Item;

/**
 * An implementation of {@link ItemQualityUpdaterInterface} for updating the quality of Sulfuras items.
 * Sulfuras items never change in quality or sellIn value.
 */
public class SulfurasQualityUpdater implements ItemQualityUpdaterInterface {

    /**
     * Updates the quality of the Sulfuras item.
     *
     * @param item The Sulfuras item to update. Quality and sellIn of Sulfuras items remain unchanged.
     */
    @Override
    public void updateQuality(Item item) {
        // Sulfuras never changes quality or sellIn
    }
}
