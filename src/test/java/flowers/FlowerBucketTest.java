package flowers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private Flower flower;
    private FlowerPack flowerPack;
    private FlowerBucket flowerBucket;

    @BeforeEach
    void setUp() {
        flowerPack = new FlowerPack();
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(10);
        flowerPack.setFlower(flower);
        flowerPack.setAmount(3);

        flowerBucket = new FlowerBucket();
        flowerBucket.addFlowers(flowerPack);
        flowerBucket.addFlowers(flowerPack);
    }

    @Test
    void getPrice() {
        assertEquals(60, flowerBucket.price());
    }
}