package com.gildedrose;

class GeneralProduct extends Item {
    GeneralProduct(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void doUpdate() {
        sellIn--;
        if (quality > 0) quality = quality - 1;
        if (sellIn < 0 && quality > 0) quality--;
    }
}
