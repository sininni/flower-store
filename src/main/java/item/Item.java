package item;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Item {
    private String describtion;

    public abstract double price();
}
