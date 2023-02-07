public abstract class Dessert implements Food{
    protected float price;
    protected int calories;

    protected Dessert(float dPrice, int dCalories) {
        this.price = dPrice;
        this.calories = dCalories;
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
