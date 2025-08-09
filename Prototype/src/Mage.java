public class Mage implements Character{
    private String name;
    private int level;
    private String magicType;

    public Mage(String name, int level, String magicType) {
        this.name = name;
        this.level = level;
        this.magicType = magicType;
    }

    @Override
    public Character clone() {
        return new Mage(this.name,this.level,this.magicType);
    }

    @Override
    public void showInfo() {
        System.out.println("name " + name + " level " + level + " magicType " + magicType);
    }
}
