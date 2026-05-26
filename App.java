public class App {

    public static void main(String[] args) {

        Knight knight = new Knight("Артур", 10, 100, 50);
        Archer archer = new Archer("Леголас", 8, 80, 30);
        Mage mage = new Mage("Мерлин", 12, 60, 200);

        System.out.println("=== Knight ===");
        knight.printInfo();
        knight.attack();
        System.out.println(knight);

        System.out.println("\nПроверка методов:");
        knight.attack("Орк");
        knight.attack("Дракон", 3);

        knight.takeDamage(30);

        System.out.println("\nПосле получения урона:");
        knight.printInfo();

        knight.levelUp();

        System.out.println("\nПосле повышения уровня:");
        knight.printInfo();

        knight.rest();

        System.out.println("\n\n=== Archer ===");
        archer.printInfo();
        archer.attack();
        System.out.println(archer);

        archer.takeDamage(50);

        System.out.println("\nПосле урона:");
        archer.printInfo();

        System.out.println("\n\n=== Mage ===");
        mage.printInfo();
        mage.attack();
        System.out.println(mage);

        System.out.println("\n\n=== Полиморфизм ===");

        Hero[] heroes = { knight, archer, mage };

        for (Hero hero : heroes) {
            hero.attack();
        }

        System.out.println("\n\n=== Статическое поле ===");
        Hero.printHeroesCreated();
    }
}
