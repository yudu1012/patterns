public class Warrior implements Character{
    private String name;
    private int level;
    private String weapon;

    public Warrior(String name, int level, String weapon) {
        this.name = name;
        this.level = level;
        this.weapon = weapon;
    }

    @Override
    public Character clone() {
        return new Warrior(this.name,this.level,this.weapon);
    }

    @Override
    public void showInfo() {
        System.out.println("name " + name + "level" + level + " weapon" + weapon);
    }
}
