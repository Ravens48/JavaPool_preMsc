import java.util.ArrayList;
import java.util.List;

public abstract class Sandwich implements Food {
    protected boolean vegetarian = false;
    protected float price;
    protected int calories;
    protected List<String> ingredients =  new ArrayList<>();

    protected Sandwich(float sPrice, int sCalories) {
        this.price = sPrice;
        this.calories = sCalories;
    }

    public boolean isVegetarian() {
        return this.vegetarian;
    }

    public List<String> getIngredients() {
        return this.ingredients;
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
