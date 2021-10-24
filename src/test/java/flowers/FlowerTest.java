package flowers;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(10);
        flower.setSepalLength(1.2);
        flower.setColor(Color.YELLOW);
    }

    @org.junit.jupiter.api.Test
    void getSepalLength() {
        assertEquals(1.2, flower.getSepalLength());
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(10, flower.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getFlowerType() {
        assertEquals(FlowerType.ROSE, flower.getFlowerType());
    }

    @org.junit.jupiter.api.Test
    void getColor() {
        assertEquals(Color.YELLOW, flower.getColor());
    }
}