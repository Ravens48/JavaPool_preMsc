public abstract class SpaceMarine extends Unit{
    protected Weapon weapon;
    protected SpaceMarine(String spName, int spHp, int spAp) {
        super(spName, spHp, spAp);
        this.recorvableAp = 9;
        this.maxAp = spAp;
    }

    @Override
    public boolean equip(Weapon wp) {
        if (wp != null && wp.isEquiped() == false ) {
            System.out.println(this.name + " has been equipped with a "+ wp.name+".");
            wp.setIsEquiped(true);
            this.weapon = wp;
            return true;
        }
        return false;
    }

    @Override
    public boolean attack(Fighter fighter) {
        if (getWeapon() != null) {
            if (getWeapon().isMelee() && this.fighterNearYou == fighter && this.ap >= getWeapon().getApcost()) {
                if (this.ap >= getWeapon().getApcost()) {
                    this.ap -= getWeapon().getApcost();
                    fighter.receiveDamage(getWeapon().getDamage());
                    System.out.println(this.name+ " attacks " +fighter.getName()+ " with a " + getWeapon().getName() +".");
                    return true;
                }
                else {
                    System.out.println("I'm too far away from "+fighter.getName()+"." );
                    return false;
                }
            }
            else if (!getWeapon().isMelee() && this.ap >= getWeapon().getApcost()) {
                if (this.ap >= getWeapon().getApcost()) {
                    this.ap -= getWeapon().getApcost();
                    fighter.receiveDamage(getWeapon().getDamage());
                    System.out.println(this.name + " attacks " + fighter.getName() + " with a " + getWeapon().getName() + ".");
                    return true;
                } else {
                    return false;
                }
            }
            else return false;
        }
        System.out.println(this.name + ": Hey, this is crazy. I'm not going to fight this empty-handed.");
        return false;
    }

    @Override
    public boolean moveCloseTo(Fighter fighter) {
        //false if dead
        if (this.hp == 0)
            return false;
        if ((fighter != this) && getWeapon().isMelee() && this.fighterNearYou != fighter) {
            this.fighterNearYou = fighter;
            System.out.println(this.name + " is moving closer to "+ fighter.getName()+".");
            return true;
        }else return false;
    }

    //---------getter----------
    public Weapon getWeapon() {
        return this.weapon;
    }
}
