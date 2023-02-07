public class SuperMutant extends Monster{
    private static int supernumber = 1;
    public SuperMutant() {
        super(("SuperMutant #"+supernumber), 170, 20);
        super.damage = 60;
        super.apcost = 20;
        System.out.println(super.getName()+": Roaarrr!");
        supernumber++;
    }

    @Override
    public void recoverAP() {
        if (super.hp + 10 > 170)
            super.hp = 170;
        else super.hp+=10;
        super.recoverAP();
    }
}
