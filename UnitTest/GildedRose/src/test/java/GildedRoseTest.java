import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GildedRoseTest {
    @Test
    void testNormal() {
        Item[] items = new Item[] {
                new Item("foo", 10, 10),
                new Item("foo", 0, 10),
                new Item("foo", 0, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("foo", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
        assertEquals(-1, app.items[1].sellIn);
        assertEquals(8, app.items[1].quality);
        assertEquals(0, app.items[2].quality);
    }

    @Test
    void testAgedBrie() {
        Item[] items = new Item[] {
                new Item("Aged Brie", 10, 10),
                new Item("Aged Brie", 0, 10),
                new Item("Aged Brie", 0, 0),
                new Item("Aged Brie", 10, 50),
                new Item("Aged Brie", 0, 49),
                new Item("Aged Brie", 10, 55)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
        assertEquals(-1, app.items[1].sellIn);
        assertEquals(12, app.items[1].quality);
        assertEquals(2, app.items[2].quality);
        assertEquals(50, app.items[3].quality);
        assertEquals(50, app.items[4].quality);
        assertEquals(50, app.items[5].quality);
    }

    @Test
    void testSulfuras() {
        Item[] items = new Item[] {
                new Item("Sulfuras, Hand of Ragnaros", 10, 50),
                new Item("Sulfuras, Hand of Ragnaros", 0, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
        assertEquals(0, app.items[1].sellIn);
    }

    @Test
    void testBackstagePass() {
        Item[] items = new Item[] {
                new Item("Backstage passes to a TAFKAL80ETC concert", 20, 40),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 30),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 15),
                new Item("Backstage passes to a TAFKAL80ETC concert", 0, 50)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(41, app.items[0].quality);
        assertEquals(32, app.items[1].quality);
        assertEquals(18, app.items[2].quality);
        assertEquals(0, app.items[3].quality);
    }

    @Test
    void testConjuredManaCake() {
        Item[] items = new Item[] {
                new Item("Conjured Mana Cake", 10, 50),
                new Item("Conjured Mana Cake", 1, 1),
                new Item("Conjured Mana Cake", 0, 4)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("Conjured Mana Cake", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(48, app.items[0].quality);
        assertEquals(0, app.items[1].quality);
        assertEquals(-1, app.items[2].sellIn);
        assertEquals(0, app.items[2].quality);
    }

}