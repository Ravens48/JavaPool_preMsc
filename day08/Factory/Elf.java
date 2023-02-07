package Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Elf {
    private Toy toy = null;
    private List<GiftPaper> papers = new ArrayList<>();
    private Factory factory;
    private GiftPaper paperGift;

    public Elf(Factory elfFacto) {
        this.factory = elfFacto;
    }

    public boolean pickToy(String toyName) {
/*        if (!Objects.equals(toyName, "teddy") && !Objects.equals(toyName, "gameboy")) {
            System.out.println("I didn't find any "+ toyName +'.');
            return false;
        }
        else if(Objects.equals(toyName, "teddy") && this.toy != null) {
            this.toy =
        }
        else if(Objects.equals(toyName, "gameboy") && this.toy != null) {
            this.toy = new GameBoy();
        }*/
        if (this.toy != null) {
            System.out.println("Minute please?! I'm not that fast.");
            return false;
        }
        try {
            this.toy = this.factory.create(toyName);
            System.out.println("What a nice one! I would have liked to keep it...");
            return true;
        } catch (Exception e) {
            System.out.println("I didn't find any "+ toyName + ".");
            return false;
        }
    }

   public boolean pickPapers(int nPapers) {
        this.papers = this.factory.getPapers(nPapers);
        return true;
    }

    public GiftPaper pack() {
        if (this.papers.size() == 0) {
            System.out.println("Wait... I can't pack it with my shirt.");
            return null;
        }
        else if (this.toy == null) {
            System.out.println("I don't have any toy, but hey at least it's paper!");
            this.paperGift = this.papers.get(0);
            this.papers.remove(0);
            return this.paperGift;
        }
        else {
            System.out.println("And another kid will be happy!");
            this.paperGift = this.papers.get(0);
            this.papers.remove(0);
            this.paperGift.wrap(this.toy);
            this.toy = null;
            return this.paperGift;
        }
    }
}