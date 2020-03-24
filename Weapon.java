import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Weapon {
    private String name;
    private double dmg;
    private double crit;
    private String effect;
    private boolean equiped;

    static List<Weapon> weapons = Arrays.asList(
            new Weapon("knife", 2, 3,"none" ,false),
            new Weapon("sharpened bone", 1, 2, "none" ,false),
            new Weapon("poison dart", 2, 1, "poison 1" ,false)
    );

    @Override
    public String toString() {
        return this.name;
    }

    public void setEquiped(String name) {
        this.equiped = true;
    }

    public void unEquip(String name) {
        this.equiped = false;
    }

    public Weapon(String name, double dmg, double crit, String effect, boolean equiped) {
        this.name = name;
        this.dmg = dmg;
        this.crit = crit;
        this.effect = effect;
        this.equiped = equiped;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDmg() {
        return dmg;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    public double getCrit() {
        return crit;
    }

    public void setCrit(double crit) {
        this.crit = crit;
    }

    public boolean isEquiped() {
        return equiped;
    }

    public void setEquiped(boolean equiped) {
        this.equiped = equiped;
    }

    public static List<Weapon> getWeapons() {
        return weapons;
    }

    public static void setWeapons(List<Weapon> weapons) {
        Weapon.weapons = weapons;
    }

    public static Weapon getByName(String name){
        Optional<Weapon> weapon = weapons.stream().filter(n -> n.getName().equals(name)).findFirst();
        if (weapon.isPresent()){
            return weapon.get();
        }else{
            throw new IllegalArgumentException("Weapon doesn't exist");
        }
    }
}
