package delivery;

import flowers.Flower;
import flowers.FlowerType;
import items.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {
    private List<Item> items;
    private DHLDeliveryStrategy dhl;
    @BeforeEach
    void setUp() {
        Item flower = new Flower(FlowerType.CACTUS);
        Item flower2 = new Flower(FlowerType.CHAMOMILE);
        items = new ArrayList<>();
        items.add(flower);
        items.add(flower2);
        dhl = new DHLDeliveryStrategy();
    }

    @Test
    void deliver() {
        assertTrue(dhl.deliver(items));
    }
}