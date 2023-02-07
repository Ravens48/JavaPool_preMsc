package planet;

public class Mars {
    static int id = 0;
    private int planetId;
    private String landingSite;
    public Mars(String n) {
        this.landingSite = n;
        planetId = this.id++;
    }
    public int getId() {
        return this.planetId;
    }

    public String getLandingSite() {
        return this.landingSite;
    }
}