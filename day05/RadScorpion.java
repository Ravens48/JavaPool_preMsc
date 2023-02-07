public class RadScorpion extends Monster {
    private static int radnumber = 1;
    public RadScorpion(){
        super(("RadScorpion #"+radnumber), 80, 50);
        super.damage = 25;
        super.apcost = 8;
        System.out.println(super.getName()+ ": Crrr!");
        radnumber++;
    }

    @Override
    public boolean attack(Fighter fighter) {
        if(fighter instanceof TacticalMarine)
            super.damage = super.damage * 2;
        return super.attack(fighter);
    }
}
