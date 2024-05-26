package com.gildedrose.updaters;

import com.gildedrose.items.Item;

/**
 * An implementation of {@link ItemQualityUpdaterInterface} for updating the quality of backstage pass items.
 * Backstage pass items increase in quality over time, with an accelerated increase as the sellIn date approaches,
 * and their quality drops to 0 after the sellIn date has passed.
 */
public class BackstagePassQualityUpdater implements ItemQualityUpdaterInterface {

    /**
     * Updates the quality of the backstage pass item.
     *
     * @param item The backstage pass item to update.
     */
    @Override
    public void updateQuality(Item item) {
        increaseQuality(item);
        item.sellIn--;

        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

    /**
     * Increases the quality of the item based on its sellIn value.
     * Quality increases over time, with an accelerated increase as the sellIn date approaches.
     * Quality drops to 0 after the sellIn date has passed.
     *
     * @param item The item whose quality to increase.
     */
    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality++;

            if (item.sellIn < 11) {
                item.quality++;
            }

            if (item.sellIn < 6) {
                item.quality++;
            }
        }
    }
}
