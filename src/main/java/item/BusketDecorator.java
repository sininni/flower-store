package item;

import item.ItemDecorator;
import item.Item;

public class BusketDecorator extends ItemDecorator {
    private Item item;

    public BusketDecorator (Item item) {
        super(item);
    }

    public double price() {
        return 4 + item.price();
    }

        @Override
    public String getDescribtion() {
        return "Done with BusketDecorator";
    }
}
