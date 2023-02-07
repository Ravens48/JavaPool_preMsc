public abstract class Menu<T extends Food, V extends Food> {
    protected T drink;
    protected V meal;


    protected Menu(T mDrink, V mMeal) {
        this.drink = mDrink;
        this.meal = mMeal;
    }
    //----------method
    public T getDrink() {
        return this.drink;
    }

    public V getMeal() {
        return this.meal;
    }

    public float getPrice() {
        return (float) ((this.getDrink().getPrice() + this.getMeal().getPrice()) * 0.90);    }
}
