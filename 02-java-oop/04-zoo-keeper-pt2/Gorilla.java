package Zoo_Keeper_Part_2;

public class Gorilla(int energyLevel) {
    super(energyLevel);
}

public void throwSomething() {
    System.out.println("trhowing stuff here");
    energyLevel -= 5;

}

public void eatBanana() {
    System.out.println("eating bananas");
    energyLevel += 10;
}

public void climb() {
    System.out.println("climbing stuff here")
}
