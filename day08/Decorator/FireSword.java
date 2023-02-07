package Decorator;

public class FireSword extends StuffDecorator{
    public FireSword(Warrior w) {
        super.holder = w;
        System.out.println("I can slice and burn like the wind and the flames.");
    }

    @Override
    public int getDmg() {
        return super.getDmg()+3;
    }
}
