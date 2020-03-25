import java.util.Arrays;
import java.util.List;

public class Item {
    private String name;
    private String descritbtion;
    private int amount;

    static List<Item> items = Arrays.asList(
        new Item("rope", "just a rope", 0)
    );

    public Item(String name, String descritbtion, int amount) {
        this.name = name;
        this.descritbtion = descritbtion;
        this.amount = amount;
    }

    public String getDescritbtion() {
        return descritbtion;
    }

    public void setDescritbtion(String descritbtion) {
        this.descritbtion = descritbtion;
    }

    public static List<Item> getItems() {
        return items;
    }

    public static void setItems(List<Item> items) {
        Item.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
