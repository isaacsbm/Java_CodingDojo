import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        // Menu items
        Item item1 = new Item(); // instance
        item1.name = "Mocha";
        item1.price = 5;
        Item item2 = new Item(); // instance
        item2.name = "Latte";
        item2.price = 5.25;
        Item item3 = new Item(); // instance
        item3.name = "Drip Coffee";
        item3.price = 1.99;
        Item item4 = new Item(); // instance
        item4.name = "Cappuccino";
        item4.price = 4.75;
        // Order variables -- order1, order2 etc.
        Order order1 = new Order(); // instance
        order1.name = "Cindhuri";
        Order order2 = new Order();
        order2.name = "Jimmy";
        Order order3 = new Order();
        order3.name = "Noah";
        Order order4 = new Order();
        order4.name = "Sam";

        // Application Simulations
        // * Add item1 to order2's list
        order2.items = new ArrayList<>();
        order2.items.add(item1);
        order2.total += item1.price;

        // * Noah's Cappuccino */

        order3.items = new ArrayList<>();
        order2.items.add(item4);
        order2.total += item4.price;

        // * Sam's latte */
        order4.items = new ArrayList<>();
        order4.items.add(item2);
        order4.total += item2.price;

        // *Cindhuri's Ready Order
        order1.ready = true;

        // *Sam's Extra Drinks
        order4.items.add(item1);
        order4.items.add(item3);
        order4.total += (item1.price + item3.price);

        // *Jimmy's Ready Order
        order2.ready = true;
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        // Order2
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        // Order3
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        // Order4
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);

    }
}
