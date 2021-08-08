package com.gildedrose;

public class GeneralProduct extends Item {
    public GeneralProduct(String name, int sellIn, int quality) {

        super(name, sellIn, quality);
    }

    public void doUpdate() {
        if (quality > 0) {
            quality = quality - 1;
        }
        sellIn = sellIn - 1;
        if (sellIn < 0 && quality > 0) {
            quality = quality - 1;
        }
    }
}
