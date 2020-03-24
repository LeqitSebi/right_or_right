import java.util.Optional;

public class Potion {
    private String name;
    private Effect effect;
    private int count;

    public Potion(String name, String effect, int count) {
        this.name = name;
        Optional<Effect> possibleEffect = Effect.effects.stream().filter(n -> n.getName().equals(effect)).findFirst();
        if (possibleEffect.isPresent()){
            this.effect = possibleEffect.get();
        }else{
            throw new IllegalArgumentException("Effect doesn't exist!");
        }
        this.count = count;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
