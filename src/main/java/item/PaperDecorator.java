package item;

import item.ItemDecorator;
import item.Item;

public class PaperDecorator extends ItemDecorator {
    private Item item;

    public PaperDecorator (Item item) {
        super(item);
    }

    public double price() {
        return 13 + this.item.price();
    }

    @Override
    public String getDescribtion() {
        return "Done with PaperDecorator";
    }
}
