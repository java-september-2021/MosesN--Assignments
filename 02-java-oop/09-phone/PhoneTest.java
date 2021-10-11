package Phone;

public class PhoneTest {
    
}
public class PhoneTester {
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("S9", 99, "T-Mobile", "Ring");
        IPhone iPhone10 = new IPhone("X", 100, "Att", "" );
        s9.displayInfo();
        iPhone10.displayInfo();
    }
}