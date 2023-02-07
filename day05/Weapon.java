public abstract class Weapon {
    protected String name;
    protected int apcost;
    protected int damage;
    protected boolean melee;
    private boolean isEquiped = false;

    protected Weapon(String wName, int wApcost, int wDamage, boolean wMelee) {
        this.name = wName;
        this.apcost = wApcost;
        this.damage = wDamage;
        this.melee = wMelee;
    }

    public String getName() {
        return this.name;
    }

    public int getApcost() {
        return this.apcost;
    }

    public int getDamage() {
        return this.damage;
    }

    public boolean isMelee() {
        return this.melee;
    }

    public boolean isEquiped(){
        return this.isEquiped;
    }

    public void setIsEquiped(boolean value) {
        this.isEquiped = value;
    }


    public abstract void attack();
}
