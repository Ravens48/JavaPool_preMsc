public abstract class Unit implements Fighter {
    protected String name;
    protected int hp;
    protected int ap;
    protected int maxAp = 50;
    protected int recorvableAp = 7;
    protected Fighter fighterNearYou = null;

    protected Unit(String fName, int fHp, int fAp) {
        this.name = fName;
        this.hp = fHp;
        this.ap = fAp;
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public int getAp() {
        return this.ap;
    }

    public void receiveDamage(int damage) {
        //reduce hp
        if (this.hp - damage < 0)
            this.hp = 0;
        else this.hp -= damage;
    }

    public boolean moveCloseTo(Fighter fighter) {
        //false if dead
        if (this.hp == 0)
            return false;
        if ((fighter != this) && fighterNearYou != fighter) {
            fighterNearYou = fighter;
            System.out.println(this.name + " is moving closer to "+ fighter.getName()+".");
            return true;
        }else return false;
    }

    public void recoverAP() {
        if (this.hp == 0)
            return;
        if (this.ap + recorvableAp > maxAp ) {
            this.ap = maxAp;
        }
        else this.ap += recorvableAp;
    }
}
