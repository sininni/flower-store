package item;

import flowers.Flower;
import flowers.FlowerType;
import items.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {
    private Item flower;
    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(20.0);
    }

    @Test
    void price() {
        RibbonDecorator ribbonDecorator = new RibbonDecorator(flower);
        assertEquals(33.0, ribbonDecorator.price());
    }

    @Test
    void getDescribtion() {
        RibbonDecorator ribbonDecorator = new RibbonDecorator(flower);
        assertEquals("Done with RibbonDecorator", ribbonDecorator.getDescribtion());
    }
}