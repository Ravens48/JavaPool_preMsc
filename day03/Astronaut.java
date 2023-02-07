import chocolate.Mars;

import java.util.Optional;

public class Astronaut {
    private String name;
    private int snacks;
    private String destination;
    private int AstronautId = 0;
    private static int id;

    public Astronaut(String n) {
        System.out.println(n+ " ready for launch!");
        this.name = n;
        this.AstronautId = this.id++;
    }

    //exo4:
    public void doActions() {
        System.out.println(this.name+": Nothing to do.");
        if (this.destination == null) {
            System.out.println(this.name+": I may have done nothing, but I have "+this.snacks+" Mars to eat at least!");
        }
    }

    public void doActions(Object obj) {
        if (obj instanceof planet.Mars) {
            System.out.println(this.name+ ": Started a mission!");
            this.destination = (((planet.Mars) obj).getLandingSite());
        }
        if (obj instanceof planet.moon.Phobos) {
            System.out.println(this.name+ ": Started a mission!");
            this.destination = (((planet.moon.Phobos) obj).getLandingSite());
        }
        else if (obj instanceof chocolate.Mars) {
            System.out.println(this.name+": Thanks for this mars number "+ ((chocolate.Mars) obj).getId());
            this.snacks += 1;
            if (this.destination == null) {
                System.out.println(this.name+": I may have done nothing, but I have "+this.snacks+" Mars to eat at least!");
            }
        }
    }

    //----------public get and setter--------------------//

    //----------Getter--------------//

    public String getName() {
        return this.name;
    }
    public int getId() {
        return this.AstronautId;
    }
    public int getSnacks() {
        return this.snacks;
    }
    public String getDestination() {
        return this.destination;
    }
}
