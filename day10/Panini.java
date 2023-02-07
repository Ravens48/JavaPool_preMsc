import java.util.List;

public class Panini extends Sandwich{
    public Panini(){
        super((float)3.50, 120);
        String[] paniniIngredients ={"tomato", "salad", "cucumber", "avocado", "cheese"} ;
        super.ingredients.addAll(List.of(paniniIngredients));
        super.vegetarian = true;
    }
}
