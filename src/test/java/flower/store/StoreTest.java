package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StoreTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private Store store;

    @BeforeEach
    public void init() {store = new Store(); }

    @Test
    public void testStore() {
        store = Main.createstore();

        Assertions.assertEquals("We have flowers with such parameters", Main.main(store, "Rose"));

        List<String> wantedFlowers = new ArrayList<String>();
        wantedFlowers.add("Rose");
        wantedFlowers.add("Chamomile");
        wantedFlowers.add("Chamomile");
        wantedFlowers.add("Tulip");

        Assertions.assertEquals("We don't have such flowers", Main.main(store, wantedFlowers));


        List<String> wantedFlowers2 = new ArrayList<String>();
        wantedFlowers2.add("Chamomile");
        wantedFlowers2.add("Chamomile");
        wantedFlowers2.add("Tulip");

        Assertions.assertEquals("We have flowers with such parameters", Main.main(store, wantedFlowers2));

    }

    @Test
    public void testParameterSearch(){
        store = Main.createstore();
        List<String> wantedColors = new ArrayList<String>();
        wantedColors.add("#FFFF00");
        String result = store.FindByParameters( wantedColors, 30, 300, store);
        Assertions.assertEquals("That's bucket, we can propose you: Tulip", result);

        wantedColors.add("#FF0000");
        result = store.FindByParameters( wantedColors, -1, 700, store);
        Assertions.assertEquals("That's bucket, we can propose you: Tulip, Tulip, Rose", result);
        wantedColors.clear();
        wantedColors.add("#FF0000");
        result = store.FindByParameters( wantedColors, -1, 700, store);
        Assertions.assertEquals("Sorry, we don't have such flowers", result);
    }
}
