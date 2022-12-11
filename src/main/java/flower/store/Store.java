package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Flower> flowers_ = new ArrayList<Flower>();

    public List<Flower> getFlowers_() {
        return flowers_;
    }

    public void addFlower(Flower flower) {
        flowers_.add(flower);
    }

    public boolean CheckFlowers(String wantedflower) {
        for (Flower flower : flowers_) {
            if(flower.getName_()==wantedflower) {
                return true;
            }
        }
        return false;
    }

    public void sell(Flower flower) {
        flowers_.remove(flower);
    }

    public void sell(String flower) {
        for (int i = 0; i < flowers_.size(); i++) {
            if (flowers_.get(i).getName_().equals(flower)) {
                flowers_.remove(i);
                break;
            }
        }
    }

    public boolean CheckBucket(List<String> wantedFlowers) {
        int count = 0;
        for (int j = 0; j < wantedFlowers.size(); j++) {
            for (int i = 0; i < flowers_.size(); i++) {
                if (flowers_.get(i).getName_().equals(wantedFlowers.get(j))) {
                    count++;
                    break;
                }
            }

        }
        if(count == wantedFlowers.size()) {
            return true;
        }
        return false;
    }

    public static String FindByParameters(List<String> color, int length, int price, Store store) {
        int StoreSize = store.getFlowers_().size();
        FlowerBucket bucket = new FlowerBucket();
        List<Flower> Chosen = new ArrayList<Flower>();
        if(!color.equals("")) {
            List<Flower> ByColor = FindByColor(color, store);
            for (int i = 0; i < ByColor.size(); i++) {
                if (StoreSize > 0) {
                    Chosen.add(ByColor.get(i));
                    StoreSize--;
                }
            }
        }
        if(length != -1){
            for (int i = 0; i < Chosen.size(); i++) {
                if(Chosen.get(i).getSepalLength() != length){
                    Chosen.remove(i);
                }
            }
        }
        if(price != -1){
            int summ = 0;
            for (int i = 0; i < Chosen.size(); i++) {
                summ = summ + Chosen.get(i).getPrice();
                if(summ > price){
                    Chosen.remove(i);
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < Chosen.size(); i++) {
            if (i >= 1) {
                if (Chosen.get(i - 1) == Chosen.get(i)) {
                    counter++;
                } else {
                    FlowerPack flowerPack = new FlowerPack(Chosen.get(i - 1), counter);
                    bucket.add(flowerPack);
                    counter = 0;
                }
            }else{
                counter++;
            }
            FlowerPack flowerPack = new FlowerPack(Chosen.get(i), counter);
            bucket.add(flowerPack);
        }
        String result = "That's bucket, we can propose you: ";
        for (int i = 0; i < bucket.getFlowers_().size(); i++) {

            result += bucket.getFlowers_().get(i).getName_() + ", ";
        }
        result = result.substring(0, result.length() - 2);
        if(result.equals("That's bucket, we can propose you")){
            result = "Sorry, we don't have such flowers";
        }
        return result;
    }


    public static List<Flower> FindByColor(List<String> color, Store store) {
        List<Flower> ByColor = new ArrayList<Flower>();
        for (int j = 0; j < color.size(); j++) {
            for (int i = 0; i < store.getFlowers_().size(); i++) {
                if (store.getFlowers_().get(i).getColor().equals(color.get(j))) {
                    ByColor.add(store.getFlowers_().get(i));
                    store.sell(store.getFlowers_().get(i));
                }
            }
        }
        return ByColor;
    }



}

