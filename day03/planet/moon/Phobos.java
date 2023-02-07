package planet.moon;

public class Phobos {
    private planet.Mars mars;
    private String landingSite;

    public Phobos(planet.Mars planet, String landing) {
        this.mars = planet;
        this.landingSite = landing;
        if (this.mars != null)
            System.out.println("Phobos placed in orbit.");
        else
            System.out.println("No planet given.");
    }
    //------getter and Setter------//
    public planet.Mars getMars() {
        return this.mars;
    }

    public String getLandingSite() {
        return this.landingSite;
    }
}