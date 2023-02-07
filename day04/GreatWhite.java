public class GreatWhite extends Shark{
    public GreatWhite(String sharkName) {
        super(sharkName);
    }

    //----method-----
    @Override
    public boolean canEat(Animal animal) {
        if (animal instanceof Canary) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public void eat(Animal animal) {
        if (canEat(animal) && (animal instanceof Shark)) {
            System.out.println(super.getName() + ": The best meal one could wish for.");
        }
        super.eat(animal);
    }
}
