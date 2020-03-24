import java.util.Optional;

public class Potion {
    private String name;
    private Effect effect;

    //TODO: add Potion List

    public Potion(String name, String effect) {
        this.name = name;
        Optional<Effect> possibleEffect = Effect.effects.stream().filter(n -> n.getName().equals(effect)).findFirst();
        if (possibleEffect.isPresent()){
            this.effect = possibleEffect.get();
        }else{
            throw new IllegalArgumentException("Effect doesn't exist!");
        }
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
