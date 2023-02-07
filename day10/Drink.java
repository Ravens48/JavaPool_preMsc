public abstract class Drink implements Food{
    protected boolean aCan = false;
    protected float price;
    protected int calories;

    protected Drink(float dPrice, int dCalories) {
        this.price = dPrice;
        this.calories = dCalories;
    }

    //----getter
    public boolean isACan() {
        return this.aCan;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public int getCalories() {
        return this.calories;
    }
}
