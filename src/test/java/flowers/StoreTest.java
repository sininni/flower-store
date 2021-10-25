package flowers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Flower flower;
    private FlowerPack flowerPack;
    private Store store;
    private FlowerPack searchFlowerPack;
    private FlowerPack searchUnrealPack;

    @BeforeEach
    void setUp() {

        flower = new Flower(FlowerType.ROSE);

        flowerPack = new FlowerPack();
        flowerPack.setFlower(flower);
        flowerPack.setAmount(10);

        searchFlowerPack = new FlowerPack();
        searchFlowerPack.setFlower(flower);
        searchFlowerPack.setAmount(9);

        searchUnrealPack = new FlowerPack();
        searchUnrealPack.setFlower(flower);
        searchUnrealPack.setAmount(14);

        store = new Store();
        store.addFlowers(flowerPack);
    }

    @Test
    void search() {
        assertTrue(store.search(searchFlowerPack));
        assertFalse(store.search(searchUnrealPack));
    }
}