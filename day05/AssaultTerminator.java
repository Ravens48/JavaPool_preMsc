public class AssaultTerminator extends SpaceMarine {
    public AssaultTerminator(String tName) {
        super(tName, 150, 30);
        super.equip(new PowerFist());
        System.out.println(tName +" has teleported from space." );
    }
    @Override
    public void receiveDamage(int damage) {
        if (damage - 3 <= 1) {
            super.receiveDamage(1);
        } else super.receiveDamage(damage - 3);
    }
}
