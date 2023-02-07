package Decorator;

public class StuffDecorator extends Warrior{
    protected Warrior holder;

    @Override
    public int getDmg() {
        return holder.getDmg();
    }

    @Override
    public int getHp() {
        return holder.getHp();
    }
}
