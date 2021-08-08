package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.approvaltests.legacycode.Range;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        String[] items = {"foo",
            "Aged Brie",
            "Backstage passes to a TAFKAL80ETC concert",
            "Sulfuras, Hand of Ragnaros",
            "Conjured Mana Cake"};
        Integer[] sellIn = Range.get(-1,15);
        Integer[] quality =  {-1, 0, 1, 2, 49, 50, 51};

        CombinationApprovals.verifyAllCombinations(this::getGildedRose, items, sellIn, quality);
    }

    private String getGildedRose(String item, int sellIn, int quality) {
        Item[] items = new Item[] {Item.createItem(item, sellIn, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app.items[0].toString().trim();
    }
}
