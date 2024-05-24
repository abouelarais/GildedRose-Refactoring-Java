package com.gildedrose;

class GildedRose {
    Item[] items;

    /**
     * Constructor for GildedRose.
     *
     * @param items An array of Item objects.
     */
    public GildedRose(Item[] items) {
        this.items = items;
    }

    /**
     * Updates the quality of all items in the inventory.
     * Depending on the type of item, the quality and sellIn values are updated accordingly.
     */
    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case "Aged Brie":
                    updateAgedBrie(item);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    updateBackstagePasses(item);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    // Sulfuras does not need to be updated
                    break;
                default:
                    updateNormalItem(item);
                    break;
            }
        }
    }

    /**
     * Updates the quality and sellIn values for Aged Brie.
     * The quality of Aged Brie increases as it ages.
     *
     * @param item The item to be updated.
     */
    private void updateAgedBrie(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
        item.sellIn--;
        if (item.sellIn < 0 && item.quality < 50) {
            item.quality++;
        }
    }

    /**
     * Updates the quality and sellIn values for Backstage passes.
     * The quality increases as the sellIn date approaches, and drops to 0 after the concert.
     *
     * @param item The item to be updated.
     */
    private void updateBackstagePasses(Item item) {
        if (item.quality < 50) {
            item.quality++;
            if (item.sellIn < 11 && item.quality < 50) {
                item.quality++;
            }
            if (item.sellIn < 6 && item.quality < 50) {
                item.quality++;
            }
        }
        item.sellIn--;
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

    /**
     * Updates the quality and sellIn values for normal items.
     * The quality decreases as the sellIn date approaches, and decreases twice as fast after the sellIn date has passed.
     *
     * @param item The item to be updated.
     */
    private void updateNormalItem(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
        item.sellIn--;
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality--;
        }
    }
}
