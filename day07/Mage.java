import java.util.Objects;

public class Mage extends Character{
    public Mage(String name) {
        super(name, "Mage");
        super.life = 70;
        super.strength = 3;
        super.agility = 10;
        super.wit = 10;
        System.out.println(name + ": May the gods be with me.");
    }

    public Mage(String name, Integer mCapacity) {
        super(name, "Mage", mCapacity);
        super.life = 70;
        super.strength = 3;
        super.agility = 10;
        super.wit = 10;
        super.capacity = mCapacity;
        System.out.println(name + ": May the gods be with me.");
    }

    @Override
    public int compareTo(Character charac) {
        if (charac instanceof Warrior) {
            if (charac.capacity % this.capacity == 0)
                return -1;
            else return 1;
        }
        else return super.compareTo(charac);
    }

    @Override
    public void attack(String weapon) {
        if (!Objects.equals(weapon, "magic") && !Objects.equals(weapon, "wand"))
            return;
        else {
            super.attack(weapon);
            System.out.println(super.name +": Feel the power of my "+ weapon+ "!");
        }
    }

    @Override
    public void moveRight() {
        System.out.println(this.name + ": moves right furtively.");
    }

    @Override
    public void moveLeft() {
        System.out.println(this.name + ": moves left furtively.");
    }

    @Override
    public void moveBack() {
        System.out.println(this.name + ": moves back furtively.");
    }

    @Override
    public void moveForward() {
        System.out.println(this.name + ": moves forward furtively.");
    }
}

//------method

