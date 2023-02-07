import chocolate.*;
import planet.*;

public class Example {
    public static void main(String[] arg) {
        Astronaut mutta = new Astronaut("Mutta");
        Astronaut hibito = new Astronaut("Hibito");
        System.out.println(mutta.getId()) ;
        System.out.println(hibito.getId());

        //exo3
        System.out.println("Check ex03: ");
        chocolate.Mars snack = new chocolate.Mars();
        planet.Mars rock = new planet.Mars("Viking 1");
        System.out.println(snack.getId());
        System.out.println(rock.getLandingSite());

        //exo4:
        System.out.println("Check ex04: ");
        hibito.doActions();
        hibito.doActions(snack);
        hibito.doActions(rock);
        hibito.doActions(snack);
        System.out.println(hibito.getSnacks());

        //exo5:
        planet.moon.Phobos phobos1 = new planet.moon.Phobos(rock, "Alpha 3");
        new planet.moon.Phobos(rock, "Beta 1");
        System.out.println(phobos1.getLandingSite());

        //exo6
        Astronaut serika = new Astronaut("Serika");
        Team spaceBro = new Team("SpaceBrothers");
        spaceBro.add(mutta);
        spaceBro.add(hibito);
        spaceBro.add(serika);

        System.out.println(spaceBro.countMembers());
        mutta.doActions(rock);
        spaceBro.showMembers();
        System.out.println(spaceBro.countMembers());
        System.out.println(spaceBro.countMembers());
        spaceBro.showMembers();

        //exo07
        Astronaut glandu = new Astronaut("glandu");
        spaceBro.add(glandu);
        spaceBro.doActions();
        spaceBro.doActions(snack);
        System.out.println("mutta have " + mutta.getSnacks() +" snack.");
        System.out.println("serika have " +serika.getSnacks() + " snack.");
        spaceBro.doActions(phobos1);
    }

}