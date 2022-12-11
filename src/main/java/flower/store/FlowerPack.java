package flower.store;

public class FlowerPack {
    private int price = 0;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public FlowerPack(Flower flower, int quantity) {
        price += flower.getPrice() * quantity;
    }
}
