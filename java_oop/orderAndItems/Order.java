
import java.util.ArrayList;

public class Order {
    // String name, double total, boolean ready, arraylist<item> items
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items;

    public Order() {
        items = new ArrayList<>();
    }
}
