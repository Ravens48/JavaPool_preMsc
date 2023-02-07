public abstract class Bread implements Food{

    protected float price;
    protected int calories;
    protected int bakingTime = 0;

    protected Bread(float bPrice, int bCalories) {
        this.price = bPrice;
        this.calories = bCalories;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public int getCalories() {
        return this.calories;
    }

    public int getBakingTime() {
        return this.bakingTime;
    }
}
