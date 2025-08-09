
public class Main {
    public static void main(String[] args) {
        Mage magePrototype = new Mage("Gandalf", 50, "White Magic");

        Mage mageClone = (Mage) magePrototype.clone();

        Warrior warriorPrototype = new Warrior("Aragorn", 45, "Sword");

        Warrior warriorClone = (Warrior) warriorPrototype.clone();

        magePrototype.showInfo();
        mageClone.showInfo();
        warriorPrototype.showInfo();
        warriorClone.showInfo();
    }
}
