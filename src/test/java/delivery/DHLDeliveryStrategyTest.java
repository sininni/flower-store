package delivery;

import flowers.Flower;
import flowers.FlowerType;
import item.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {

    @BeforeEach
    void setUp() {
        Item flower = new Flower(FlowerType.CACTUS);
        Item flower2 = new Flower(FlowerType.CHAMOMILE);
        List<Item> items = new ArrayList<Item>();
        items.add(flower);
        items.add(flower2);
        DHLDeliveryStrategy dhl = new DHLDeliveryStrategy();
    }

    @Test
    void deliver() {
        assertTrue(deliver(items));
    }
}