package flowers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack flowerPack;
    private Flower flower;

    @BeforeEach
    void setUp() {
        flowerPack = new FlowerPack();
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(10);
        flowerPack.setFlower(flower);
        flowerPack.setAmount(3);
    }

    @Test
    void price() {
        assertEquals(30, flowerPack.price());
    }
}