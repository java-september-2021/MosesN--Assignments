import java.util.Date;

public class AlfredQuotes {
   
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name, String dayPeriod) {

        return String.format("Good %s, %s. Lovely to see you", dayPeriod, name);
    }

    public String dateAnnouncement() {
        return String.format("It is currently %s", new Date());
    }
    
    public String respondBeforeAlexis(String conversation) {
        
        if (phrase.indexOf("Alexis") > -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }

        if (phrase.indexOf("Alfred") > -1) {
            return "At your service. As you wish, naturally.";
        }
        return "place holder for snarky response return string";
    }

}
