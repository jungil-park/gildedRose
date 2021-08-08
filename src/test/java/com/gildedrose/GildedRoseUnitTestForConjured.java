package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseUnitTestForConjured {

    @Test
    void checkQuantityZero() {
        Item[] items = new Item[] {  Item.createItem("Conjured Mana Cake", 2, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Conjured Mana Cake", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    // check 3 quality
    @Test
    void checkQuantityThree() {
        Item[] items = new Item[] {  Item.createItem("Conjured Mana Cake", 2, 3) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Conjured Mana Cake", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
    }

    // check sellIn 0
    @Test
    void checkSellInZero() {
        Item[] items = new Item[] {  Item.createItem("Conjured Mana Cake", 0, 3) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Conjured Mana Cake", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
    }

    // check sellIn 0 & quality 4
    @Test
    void checkSellInZeroAndQnalityfour() {
        Item[] items = new Item[] {  Item.createItem("Conjured Mana Cake", 0, 4) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Conjured Mana Cake", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

}
