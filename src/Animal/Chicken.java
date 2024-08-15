package Animal;

public class Chicken extends Animal implements Edible {
    public Chicken() {
        super("Chicken");
    }

    @Override
    public void howToEat() {
        System.out.println("Boiled chicken is not bad, but BBQ is the best!");
    }

    @Override
    public void makeSound() {
        System.out.println("咕咕");
    }
}
