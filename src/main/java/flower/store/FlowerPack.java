/*
Flowerstore
 */


package flower.store;

public class FlowerPack {
    private int price_ = 0;

    public Flower getFlower_() {
        return flower_;
    }

    private Flower flower_;

    public int getPrice() {
        return price_;
    }

    public void setPrice(int price) {
        this.price_ = price;
    }

    public FlowerPack(Flower flower, int quantity) {
        price_ += flower.getPrice() * quantity;
        this.flower_ = flower;
    }
}
