package alfredBot;

import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        return "Hello," + name;
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "Today's date is " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        Boolean alexis = false;
        Boolean alfred = false;
        if (alexis) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
            // System.out.println("Right away, sir. She certainly isn't sophisticated enough
            // for that.");
        } else if (alfred) {
            return "At your service. As you wish, naturally.";
            // System.out.println("At your service. As you wish, naturally.");
        } else {
            return "Right. And with that I shall retire.";
            // System.out.println("Right. And with that I shall retire.");
        }
    }

    // NINJA BONUS
    // See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have
    // learned!
}
