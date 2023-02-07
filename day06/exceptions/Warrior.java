import java.util.Objects;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name, "Warrior");
        super.life = 100;
        super.strength = 10;
        super.agility = 8;
        super.wit = 3;
        System.out.println(name + ": My name will go down in history!");
    }

    //--------method-----

    @Override
    public void attack(String weapon) throws WeaponException {
        if (Objects.equals(weapon, "")) {
            throw new WeaponException(this.name + ": I refuse to fight with my bare hands.");
        }
        if (!Objects.equals(weapon, "hammer") && !Objects.equals(weapon, "sword"))
            throw new WeaponException(this.name + ": A " + weapon + "?? What should I do with this?!");
        else {
            super.attack(weapon);
            System.out.println(super.name +": I'll crush you with my "+ weapon+ "!");
        }
    }

    @Override
    public void moveRight() {
        System.out.println(this.name + ": moves right like a bad boy.");
    }

    @Override
    public void moveLeft() {
        System.out.println(this.name + ": moves left like a bad boy.");
    }

    @Override
    public void moveBack() {
        System.out.println(this.name + ": moves back like a bad boy.");
    }

    @Override
    public void moveForward() {
        System.out.println(this.name + ": moves forward like a bad boy.");
    }

    public void tryToAttack(String weapon) {
        try {
            attack(weapon);
        } catch (WeaponException e) {
            System.out.println(e.getMessage());
        }
    }
}
