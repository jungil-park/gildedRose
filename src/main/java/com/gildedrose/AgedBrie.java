package com.gildedrose;

class AgedBrie extends Item {
    AgedBrie(int sellIn, int quality) {

        super(AGEDBRIE, sellIn, quality);
    }

    @Override
    void doUpdate() {
        sellIn--;
        if (quality < 50) quality++;
        if (sellIn < 0 && quality < 50) quality++;
    }
}
