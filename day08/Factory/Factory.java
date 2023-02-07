package Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Factory {

    public Toy create (String toyName) throws NoSuchToyException {
        if (Objects.equals(toyName, "teddy"))
            return new TeddyBear();
        else if (Objects.equals(toyName, "gameboy")) {
            return new Gameboy();
        }
        else throw new NoSuchToyException("No such toy: " + toyName+".");
    }

    public List<GiftPaper> getPapers(int nGpaper) {
        List<GiftPaper> gPaperList = new ArrayList<>();
        for (int i=0; i < nGpaper; i++)
            gPaperList.add(new GiftPaper());
        return gPaperList;
    }
}
