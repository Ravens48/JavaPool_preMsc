package Factory;

public abstract class Toy {
    protected String title;


    protected Toy(String tName) {
        this.title = tName;
    }

    public String getTitle() {
        return title;
    }
}
