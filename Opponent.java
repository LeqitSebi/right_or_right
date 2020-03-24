import java.util.Arrays;
import java.util.List;

public class Opponent {
    private String name;
    private double health;
    private Weapon weapon;

    static List<Opponent> opponents = Arrays.asList(
            new Opponent("Skeleton", 12, Weapon.getByName("sharpened bone")),
            new Opponent("Spider", 8, Weapon.getByName("sharpened bone"))
    );

    public Opponent(String name, double health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public static List<Opponent> getOpponents() {
        return opponents;
    }

    public static void setOpponents(List<Opponent> opponents) {
        Opponent.opponents = opponents;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
