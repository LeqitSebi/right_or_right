import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Potion {
    private String name;
    private Effect effect;
    private int amount;

    static List<Potion> potions = Arrays.asList(
            new Potion("damage", "damage 1", 0)
    );

    public Potion(String name, String effect, int amount) {
        this.name = name;
        Optional<Effect> possibleEffect = Effect.effects.stream().filter(n -> n.getName().equals(effect)).findFirst();
        if (possibleEffect.isPresent()){
            this.effect = possibleEffect.get();
        }else{
            throw new IllegalArgumentException("Effect doesn't exist!");
        }
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public static List<Potion> getPotions() {
        return potions;
    }

    public static void setPotions(List<Potion> potions) {
        Potion.potions = potions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Effect getEffect() {
        return effect;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }



    @Override
    public String toString() {
        return this.getName();
    }
}
