package Decorator;

public class Shield extends StuffDecorator{
    public Shield(Warrior w) {
        super.holder = w;
        System.out.println("May this shield protect me against every enemy.");
    }

    @Override
    public int getHp() {
        return super.getHp() + 10;
    }
}
