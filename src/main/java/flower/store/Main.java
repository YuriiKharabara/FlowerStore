package flower.store;

import java.util.List;

public class Main {
    public static String main(Store store, String wantedFlower) {

        if (store.CheckFlowers(wantedFlower)) {
            store.sell(wantedFlower);
            return ("We have flowers with such parameters");
        } else {
            return ("We don't have flowers with such parameters\n");
        }
    }
    public static String main(Store store, List<String> wantedFlowers) {
        return(sellingbucket(wantedFlowers, store));
    }


    public static String sellingbucket(List<String> wantedFlowers, Store store) {
        boolean available = store.CheckBucket(wantedFlowers);

        if(available){
            for (int i = 0; i < wantedFlowers.size(); i++) {
                store.sell(wantedFlowers.get(i));
            }
            return("We have flowers with such parameters");

        } else {
            return("We don't have such flowers");
        }
    }
    public static Store createstore(){
        Store store = new Store();

        Flower flower1 = new Rose();
        FlowerColor color = FlowerColor.RED;
        flower1.setColor(color);
        flower1.setSepalLength(10);
        flower1.setPrice(100);

        Flower flower2 = new Chamomile();
        color = FlowerColor.WHITE;
        flower2.setColor(color);
        flower2.setSepalLength(20);
        flower2.setPrice(200);

        Flower flower3 = new Tulip();
        color = FlowerColor.YELLOW;
        flower3.setColor(color);
        flower3.setSepalLength(30);
        flower3.setPrice(300);

        Flower flower4 = new Flower();
        color = FlowerColor.BLACK;
        flower4.setColor(color);
        flower4.setSepalLength(40);
        flower4.setPrice(400);

        store.addFlower(flower1);

        store.addFlower(flower2);
        store.addFlower(flower2);

        store.addFlower(flower3);
        store.addFlower(flower3);
        store.addFlower(flower3);

        store.addFlower(flower4);
        store.addFlower(flower4);
        store.addFlower(flower4);
        store.addFlower(flower4);

        List<Flower> flowers = store.getFlowers_();
        System.out.println("Hi, we have these flowers:");
        int intend = 0;
        for (Flower flower : flowers) {
            if(flower.getName() == "Rose"){
                intend = 7;
            }else if(flower.getName() == "Tulip"){
                intend = 6;
            }else if(flower.getName() == "Chamomile"){
                intend = 2;
            }else if(flower.getName() == "Flower"){
                intend = 5;
            }
            System.out.println(flower.getName() + " ".repeat(intend) + flower.getColor() + " " + flower.getSepalLength() + " " + flower.getPrice());
        }
        return store;
    }
}

