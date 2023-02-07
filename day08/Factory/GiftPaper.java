package Factory;

public class GiftPaper {
    private Toy gift;
    public void wrap(Toy toyTowrap){
        this.gift = toyTowrap;
    }

    public Toy unwrap() {
        Toy temp = this.gift;
        this.gift = null;
        return temp;
    }
}
