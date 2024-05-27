package com.gildedrose.updaters;

import com.gildedrose.items.Item;

/**
 * Interface defining the contract for updating the quality of items.
 */
public interface ItemQualityUpdaterInterface {

    /**
     * Updates the quality of the given item.
     *
     * @param item The item whose quality to update.
     */
    void updateQuality(Item item);
}
