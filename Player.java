import java.util.LinkedList;

public class Player {
    private String name;
    private double health;
    private double maxhealth;
    private LinkedList<Effect> effects;
    private double coins;

    public Player(String name, double health, double maxhealth, LinkedList<Effect> effects, double coins) {
        this.name = name;
        this.health = health;
        this.maxhealth = maxhealth;
        this.effects = effects;
        this.coins = coins;
    }

    static Player player = new Player(null, 20, 20, new LinkedList<>(), 1);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCoin(){
        this.setCoins(this.getCoins()+1);
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getMaxhealth() {
        return maxhealth;
    }

    public void setMaxhealth(double maxhealth) {
        this.maxhealth = maxhealth;
    }

    public LinkedList<Effect> getEffects() {
        return effects;
    }

    public void setEffects(LinkedList<Effect> effects) {
        this.effects = effects;
    }

    public double getCoins() {
        return coins;
    }

    public void setCoins(double coins) {
        this.coins = coins;
    }
}
