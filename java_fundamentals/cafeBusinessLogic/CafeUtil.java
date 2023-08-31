import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal(){
        //Create a method that adds every integer from 1 to 10 and returns the sum. Include a paramenter numWeeks to change the number of weeks
        // int numWeeks = 0;
        int sum = 0;
        for (int i =1; i<=10;i++){
            sum +=i;
        }
        return sum;
    }
    
    public double getOrderTotal(double[] prices){
        //Given an array add all of the prices in the array and return the total sum
        double sum = 0;
        for (int i=0; i<prices.length; i++){
            sum += prices[i];
        }
        return sum;
    }
    public void displayMenu(ArrayList<String> menuItems){
        //Given an array list of strings print out each index and menu item starting at 0
        for (int i=0; i< menuItems.size(); i++){
            System.out.println(i + menuItems.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customers){
        //Print string "Please enter your name to console" and using: String username = System.console().readLine(); get the user input from the terminal and print the username to the console saying "Hello, [username input here]" and "There are ____ people ahead of you" depending on how many have been entered into the array. Add the name to the list and print the list to the terminal.
        System.out.println("Please enter your name: ");
        String username = System.console().readLine();
        customers.add(username);
        System.out.println("Hello, " + username);
        int position = customers.indexOf(username);
        if (position > 0){
            System.out.println("There are " + position + "people ahead of you.");
        } else {
            System.out.println("You are first in line.");
        }
    System.out.println("Customers in line: " + customers);
    }
}