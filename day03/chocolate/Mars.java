package chocolate;

public class Mars {
    static int id = 0;
    private int planetId;
    public Mars() {
        planetId = this.id++;
    }
    public int getId() {
        return this.planetId;
    }
}