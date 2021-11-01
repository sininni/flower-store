package delivery;

import flowers.Flower;
import flowers.FlowerType;
import item.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {

    @BeforeEach
    void setUp() {
        Item flower = new Flower(FlowerType.CACTUS);
        Item flower2 = new Flower(FlowerType.TULIP);

        List<Item> flowers = new ArrayList<Item>();
        flowers.add(flower);
        flowers.add(flower2);

        PostDeliveryStrategy post = new PostDeliveryStrategy();
    }

    @Test
    void deliver() {
        assertTrue(post);
    }
}