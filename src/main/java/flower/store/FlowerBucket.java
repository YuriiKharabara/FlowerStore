package flower.store;

public class FlowerBucket {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void add(FlowerPack flowerPack) {
        this.price = flowerPack.getPrice();
    }

}
