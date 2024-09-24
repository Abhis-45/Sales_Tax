import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    private List<Item> items;

    public ShoppingBasket() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
