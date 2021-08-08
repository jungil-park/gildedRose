package com.gildedrose;

public class Item {
    //Constants
    static final String AGEDBRIE = "Aged Brie";
    static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    static final String CONJURED = "Conjured Mana Cake";

    String name;
    int sellIn;
    int quality;

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public static Item createItem(String name, int sellIn, int quality) {

        switch (name) {
            case AGEDBRIE:
                return new AgedBrie(sellIn, quality);
            case BACKSTAGE:
                return new Backstage(sellIn, quality);
            case SULFURAS:
                return new Sulfuras(sellIn, quality);
            //New product "Conjured" add / date 2021-08-01
            case CONJURED:
                return new Conjured(sellIn, quality);
            default:
                return new GeneralProduct(name, sellIn, quality);
        }
    }

    void doUpdate() {
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

}

