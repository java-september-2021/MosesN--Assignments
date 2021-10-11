package Zoo_Keeper_Part_2;

public class Bat(int energyLevel) {
    super(300);
}

public void fly() {
    System.out.print("Bat");
    energyLevel -= 50;
}

public void eatHumans() {
    System.out.println("eat humans");
    energyLevel += 25;
}

public void attackTwon() {
    System.out.println("attack town")
    energyLevel -= 100;
}
