package item;

import flowers.Flower;
import flowers.FlowerType;
import items.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusketDecoratorTest {
    private Item flower;
    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(20.0);
    }

    @Test
    void price() {
        BusketDecorator busketDecorator = new BusketDecorator(flower);
        assertEquals(24.0, busketDecorator.price());
    }
}