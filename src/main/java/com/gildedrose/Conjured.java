package com.gildedrose;

public class Conjured extends Item {
    Conjured(int sellIn, int quality) {

        super("Conjured Mana Cake", sellIn, quality);
    }
    public void doUpdate() {
        sellIn = sellIn - 1;
        if (quality < 3) {
            quality = 0;
            return;
        }
        if (quality > 1 ) {
            quality = quality - 2;
        }
        if (sellIn < 0 && quality > 1) {
            quality = quality - 2;
        }
    }
}
