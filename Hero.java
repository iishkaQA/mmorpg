public class Hero {

    protected String name;
    protected int level;
    protected int health;

    public static final int MAX_LEVEL = 100;

    public static int heroesCreated = 0;

    public Hero(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
        heroesCreated++;
    }

    public void printInfo() {
        System.out.println("Имя: " + name +
                ", уровень: " + level +
                ", здоровье: " + health);
    }

    public void takeDamage(int damage) {
        health -= damage;

        if (health < 0) {
            health = 0;
        }
    }

    public void levelUp() {
        if (level < MAX_LEVEL) {
            level++;
        }
    }

    public void attack() {
        System.out.println("Герой наносит обычный удар");
    }

    // перегрузка
    public void attack(String target) {
        System.out.println("Герой атакует " + target);
    }

    // перегрузка
    public void attack(String target, int times) {
        System.out.println("Герой атакует " + target +
                " " + times + " раз");
    }

    public static void printHeroesCreated() {
        System.out.println("Создано героев: " + heroesCreated);
    }

    public final void rest() {
        System.out.println("Герой отдыхает и восстанавливает силы");
    }

    @Override
    public String toString() {
        return "Hero{name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                '}';
    }
}
