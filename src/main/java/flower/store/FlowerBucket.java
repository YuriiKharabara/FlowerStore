package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private int price;
    private List<Flower> flowers_ = new ArrayList<Flower>();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Flower> getFlowers_() {
        return flowers_;
    }

    public void setFlowers_(List<Flower> flowers_) {
        this.flowers_ = flowers_;
    }

    public void add(FlowerPack flowerPack) {
        this.price = flowerPack.getPrice();
        this.flowers_.add(flowerPack.getFlower_());
    }


}
