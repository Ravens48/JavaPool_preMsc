import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Breakfast <T extends Drink, V extends Bread> extends Menu{
    public Breakfast(Food mDrink, Food mMeal) {
            super(mDrink , mMeal);
    }
}
