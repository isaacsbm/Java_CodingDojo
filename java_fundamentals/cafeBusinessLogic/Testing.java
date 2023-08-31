import java.util.ArrayList;

public class Testing {
    public static void main(String[] args) { //makes it accessible?? Check how this is being implemented? 
        CafeUtil CafeUtil = new CafeUtil(); //makes the instance
        
        //* Streak Goal
        int result = CafeUtil.getStreakGoal();
        System.out.println(result);

        //* Order Total
        double[] prices = {10, 1, 12};
        double total = CafeUtil.getOrderTotal(prices);
        System.out.println(total);

        //* Display Menu
        
        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("Coffee");
        menuItems.add("Tea");

        CafeUtil.displayMenu(menuItems);

        //* Print Username
        ArrayList<String> customerList = new ArrayList<>();
        CafeUtil.addCustomer(customerList);
        // CafeUtil.addCustomer(customerList);
    }
}