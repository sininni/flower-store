package item;

import item.Item;

abstract class ItemDecorator extends Item {
    private Item item;

    public ItemDecorator (Item itemDecorator) {
        this.item = itemDecorator;
    }

    public String getDescribtion() {
        return item.getDescribtion();
    }
}
