public interface Fighter {
    boolean equip(Weapon weapon);
    boolean attack(Fighter fighter);
    void receiveDamage(int damage);
    boolean moveCloseTo(Fighter fighter);
    void recoverAP();
    String getName();
    int getAp();
    int getHp();
}
