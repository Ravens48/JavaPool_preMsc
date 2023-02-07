public class TacticalMarine extends SpaceMarine{
    public TacticalMarine(String tName) {
        super(tName,100,20);
        super.recorvableAp = 12;
        PlasmaRifle plasma = new PlasmaRifle();
        super.equip(plasma);
        System.out.println(tName +" on duty.");
    }
}
