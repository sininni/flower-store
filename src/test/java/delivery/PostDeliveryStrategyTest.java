package delivery;

import flowers.Flower;
import flowers.FlowerType;
import items.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {

    private List<Item> items;
    private PostDeliveryStrategy post;

    @BeforeEach
    void setUp() {
        Item flower = new Flower(FlowerType.CACTUS);
        Item flower2 = new Flower(FlowerType.CHAMOMILE);
        items = new ArrayList<>();
        items.add(flower);
        items.add(flower2);
        post = new PostDeliveryStrategy();
    }

    @Test
    void deliver() {
        assertTrue(post.deliver(items));
    }
}