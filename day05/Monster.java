public abstract class Monster extends Unit{
    protected int damage = 0;
    protected int apcost = 0;

    protected Monster(String mName, int mHp, int mAp) {
        super(mName, mHp,mAp);
        super.maxAp = mAp;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getApcost() {
        return this.apcost;
    }

    public boolean equip(Weapon weapon) {
        System.out.println("Monsters are proud and fight with their own bodies.");
        return false;
    }

    public boolean attack(Fighter fighter) {
        if (this.hp == 0)
            return false;
        //use f
        if (fighter == this.fighterNearYou) {
            if (this.ap >= this.apcost) {
                this.ap -= this.apcost;
                System.out.println(this.name+ " attacks " +fighter.getName()+ ".");
                fighter.receiveDamage(this.damage);
                return true;
            }
            else return false;
        }
        else {
            System.out.println(this.name + ": I'm too far away from "+ fighter.getName()+"." );
            return false;
        }
    }
}
