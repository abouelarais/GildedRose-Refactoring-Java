package com.gildedrose;

import com.gildedrose.items.Item;
import com.gildedrose.updaters.ItemQualityUpdaterInterface;
import com.gildedrose.factory.ItemQualityUpdaterFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the inventory management system of the Gilded Rose shop.
 */
class GildedRose {

    /** The list of items in the inventory. */
    final List<Item> items;

    /**
     * Constructs a new GildedRose object with the given list of items.
     *
     * @param items The list of items in the inventory.
     */
    public GildedRose(List<Item> items) {
        this.items = new ArrayList<>(items);
    }

    /**
     * Updates the quality of all items in the inventory.
     */
    public void updateQuality() {
        for (Item item : items) {
            updateItemQuality(item);
        }
    }

    /**
     * Updates the quality of the given item using the appropriate quality updater.
     *
     * @param item The item whose quality to update.
     */
    private void updateItemQuality(Item item) {
        ItemQualityUpdaterInterface updater = ItemQualityUpdaterFactory.getUpdater(item);
        updater.updateQuality(item);
    }
}
