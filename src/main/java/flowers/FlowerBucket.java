package flowers;

import java.util.ArrayList;
import java.util.List;

class FlowerBucket {
    private List<FlowerPack> flowerPackList = new ArrayList<FlowerPack>();
    private double price;

    public double getPrice() {
        for (FlowerPack flowerPack : flowerPackList) {
            price += flowerPack.price();
        }
        return price;
    }

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPackList.add(flowerPack);
    }
}

