/*
FlowerStore
 */

package flower.store;

public class Flower {
    private String name_ = "Flower";
    private int sepalLength;
    private String color;
    private int price;

    public String getName() {
        /*
        return name;
        */
        return name_;
    }

    public void setName(String name) {
        /*
        set name;
        */
        this.name_ = name;
    }
    public int getSepalLength() {
        /*
        return Sepal length;
        */
        return sepalLength;
    }

    public void setSepalLength(int sepalLength) {
        /*
        set Sepal length;
         */
        this.sepalLength = sepalLength;
    }

    public String getColor() {
        /*
        return color;
         */
        return color;
    }

    public void setColor(FlowerColor color) {
        /*
        set color;
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
        /*
        return price;
         */

        return price;
    }

    public void setPrice(int price) {
        /*
        set price;
         */
        this.price = price;
    }
}
