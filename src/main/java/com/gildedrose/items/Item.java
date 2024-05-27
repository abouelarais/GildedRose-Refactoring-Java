package com.gildedrose.items;

/**
 * Represents an item in the inventory of the Gilded Rose shop.
 */
public class Item {

    /** The name of the item. */
    public String name;

    /** The number of days before the item's quality decreases. */
    public int sellIn;

    /** The quality of the item. */
    public int quality;

    /**
     * Constructs a new item with the given name, sellIn value, and quality.
     *
     * @param name    The name of the item.
     * @param sellIn  The number of days before the item's quality decreases.
     * @param quality The quality of the item.
     */
    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    /**
     * Returns a string representation of the item.
     *
     * @return A string containing the name, sellIn value, and quality of the item.
     */
    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

}
