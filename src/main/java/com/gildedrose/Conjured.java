package com.gildedrose;

class Conjured extends Item {
    Conjured(int sellIn, int quality) {

        super(CONJURED, sellIn, quality);
    }

    @Override
    void doUpdate() {
        sellIn = sellIn - 1;
        if (quality < 3) {
            quality = 0;
            return;
        }
        quality -= 2;
        if (sellIn < 0 && quality > 1) quality = quality - 2;
    }
}
