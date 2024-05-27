package com.gildedrose.factory;

import com.gildedrose.items.Item;
import com.gildedrose.updaters.*;

/**
 * Factory class for creating item quality updaters based on item types.
 */
public class ItemQualityUpdaterFactory {

    /**
     * Item types supported by the factory.
     */
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

    /**
     * Gets the appropriate quality updater for the given item.
     *
     * @param item The item for which to get the quality updater.
     * @return An instance of {@link ItemQualityUpdaterInterface} appropriate for the given item.
     */
    public static ItemQualityUpdaterInterface getUpdater(Item item) {
        switch (item.name) {
            case AGED_BRIE:
                return new AgedBrieQualityUpdater();
            case BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT:
                return new BackstagePassQualityUpdater();
            case SULFURAS_HAND_OF_RAGNAROS:
                return new SulfurasQualityUpdater();
            default:
                return new NormalItemQualityUpdater();
        }
    }
}
