import java.util.Arrays;
import java.util.List;

public class Effect {
    private String name;
    private double damageMult;
    private double dmgPerRound;
    private int lastingRounds;

    static List<Effect> effects = Arrays.asList(
            new Effect("poison 1", 0, 1, 2)
    );

    public Effect(String name, double damageMult, double dmgPerRound, int lastingRounds) {
        this.name = name;
        this.damageMult = damageMult;
        this.dmgPerRound = dmgPerRound;
        this.lastingRounds = lastingRounds;
    }

    public double getDamageMult() {
        return damageMult;
    }

    public void setDamageMult(double damageMult) {
        this.damageMult = damageMult;
    }

    public static List<Effect> getEffects() {
        return effects;
    }

    public static void setEffects(List<Effect> effects) {
        Effect.effects = effects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDmgPerRound() {
        return dmgPerRound;
    }

    public void setDmgPerRound(double dmgPerRound) {
        this.dmgPerRound = dmgPerRound;
    }

    public int getLastingRounds() {
        return lastingRounds;
    }

    public void setLastingRounds(int lastingRounds) {
        this.lastingRounds = lastingRounds;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
