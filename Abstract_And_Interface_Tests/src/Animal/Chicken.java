package Animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String howtoEat() {
        return "boiled";
    }

    @Override
    public String makeSound() {
        return "Chicken: Chip Chip";
    }

}
