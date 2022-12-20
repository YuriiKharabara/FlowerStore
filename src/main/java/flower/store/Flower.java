/**
 * FlowerStore
 */
package flower.store;

public class Flower {
    /**
     * FlowerStore
     */
    private String name_ = "Flower";
    private int sepalLength;
    private String color;
    private int price;

    public String getName() {
        /**
         * FlowerStore
         */
        return name_;
    }

    public void setName(String name) {
        /**
         * FlowerStore
         */
        this.name_ = name;
    }
    public int getSepalLength() {
        /**
         * FlowerStore
         */
        return sepalLength;
    }

    public void setSepalLength(int sepalLength) {
        /**
         * FlowerStore
         */
        this.sepalLength = sepalLength;
    }

    public String getColor() {
        /**
         * FlowerStore
         */
        return color;
    }

    public void setColor(FlowerColor color) {
        /**
         * FlowerStore
         */
        switch (color) {
            case RED: this.color = "#FF0000"; break;
            case BLUE: this.color = "#0000FF"; break;
            case WHITE: this.color = "#FFFFFF"; break;
            case YELLOW: this.color = "#FFFF00"; break;
            case PURPLE: this.color = "#A020F0"; break;
            case PINK: this.color = "#FFC0CB"; break;
            case BLACK: this.color = "#000000"; break;

        }
    }

    public int getPrice() {
        /**
         * FlowerStore
         */

        return price;
    }

    public void setPrice(int price) {
        /**
         * FlowerStore
         */
        this.price = price;
    }
}
