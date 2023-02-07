public class Shark extends Animal{
    private boolean frenzy;
    public Shark(String sharkName){
        super(sharkName, 0, Type.FISH);
        System.out.println("A KILLER IS BORN!");
        this.frenzy = false;
    }

    //-------method------
    public void smellBlood(boolean value) {
        this.frenzy = value;
    }

    public void status() {
        if (this.frenzy) {
            System.out.println(super.getName() + " is smelling blood and wants to kill.");
        } else {
            System.out.println(super.getName() + " is swimming peacefully.");
        }
    }

    public boolean canEat(Animal animal) {
        return animal != this;
    }

    public void eat(Animal animal) {
        if (canEat(animal)) {
            System.out.println(super.getName() + " ate a " + animal.getType() + " named "+ animal.getName()+".");
            if (this.frenzy) {
                this.frenzy = false;
            }
        }
        else {
            if (animal instanceof Canary)
                System.out.println(super.getName() + ": Next time you try to give me that to eat, I'll eat you instead.");
            else {System.out.println(super.getName() + ": It's not worth my time.");}
        }
    }
}
