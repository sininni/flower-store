package item;

import flowers.Flower;
import flowers.FlowerType;
import items.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {
    private Item flower;
    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(20.0);
    }

    @Test
    void price() {
        PaperDecorator paperDecorator = new PaperDecorator(flower);
        assertEquals(33.0, paperDecorator.price());
    }

    @Test
    void getDescribtion() {
        PaperDecorator paperDecorator = new PaperDecorator(flower);
        assertEquals("Done with PaperDecorator", paperDecorator.getDescribtion());
    }
}