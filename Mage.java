public class Mage extends Hero {

    private int mana;

    public Mage(String name, int level, int health, int mana) {
        super(name, level, health);
        this.mana = mana;
    }

    @Override
    public void attack() {
        System.out.println("Маг запускает огненный шар");
    }

    @Override
    public String toString() {
        return "Mage{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                ", mana=" + mana +
                '}';
    }
}
