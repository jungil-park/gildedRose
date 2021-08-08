package com.gildedrose;

public class Backstage extends Item {
    Backstage(int sellIn, int quality) {

        super(BACKSTAGE, sellIn, quality);
    }

    @Override
    void doUpdate() {

        if (quality < 50) {
            quality++;

            if (sellIn < 11 && quality < 50) quality++;
            if (sellIn < 6 && quality < 50) quality++;
        }
        sellIn = sellIn - 1;
        if (sellIn < 0) quality = 0;

    }
}
