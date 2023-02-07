import java.util.List;

public class HamSandwich extends Sandwich{
    public HamSandwich() {
        super((float)4.00 , 230);
        String[] hamIngredients ={"tomato", "salad", "cheese", "ham", "butter"} ;
        super.ingredients.addAll(List.of(hamIngredients));
        super.vegetarian = false;
    }
}
