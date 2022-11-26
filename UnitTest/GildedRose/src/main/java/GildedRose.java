public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                switch (item.name) {
                    case "Aged Brie":
                        item.sellIn -= 1;
                        if (item.sellIn >= 0) item.quality += 1;
                        else item.quality += 2;
                        continue;
                    case "Conjured Mana Cake":
                        item.sellIn -= 1;
                        if (item.sellIn >= 0) item.quality -= 2;
                        else item.quality -= 4;
                        continue;
                    case "Backstage passes to a TAFKAL80ETC concert":
                        item.sellIn -= 1;
                        if (item.sellIn < 0) item.quality = 0;
                        else if (item.sellIn <= 5) item.quality += 3;
                        else if (item.sellIn <= 10) item.quality += 2;
                        else item.quality += 1;
                        continue;
                    default:
                        item.sellIn -= 1;
                        if (item.sellIn >= 0) item.quality -= 1;
                        else item.quality -= 2;
                        continue;
                }
            }
        }
        for (Item item : items) {
            if (item.quality > 50) item.quality = 50;
            if (item.quality < 0) item.quality = 0;
        }
    }
}