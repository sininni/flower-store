package item;

import item.ItemDecorator;
import item.Item;

public class RibbonDecorator extends ItemDecorator {
    private Item item;

    public RibbonDecorator (Item item) {
        super(item);
    }

        public double price() {
        return 13 + this.item.price();
    }

        @Override
        public String getDescribtion() {
        return "Done with RibbonDecorator";
    }
}
