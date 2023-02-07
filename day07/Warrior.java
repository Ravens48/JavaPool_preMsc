import java.util.Objects;

public class Warrior extends Character{
    public Warrior(String name) {
        super(name, "Warrior");
        super.life = 100;
        super.strength = 10;
        super.agility = 8;
        super.wit = 3;
        System.out.println(name + ": My name will go down in history!");
    }

    public Warrior(String name, Integer wCapacity) {
        super(name, "Warrior", wCapacity);
        super.life = 100;
        super.strength = 10;
        super.agility = 8;
        super.wit = 3;
        super.capacity = wCapacity;
        System.out.println(name + ": My name will go down in history!");
    }

    //--------method-----


    @Override
    public int compareTo(Character charac) {
        if (charac instanceof Mage) {
            if (this.capacity % charac.capacity == 0)
                return 1;
            else return -1;
        }
        else return super.compareTo(charac);
    }

    @Override
    public void attack(String weapon) {
        if (!Objects.equals(weapon, "hammer") && !Objects.equals(weapon, "sword"))
            return;
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
}
