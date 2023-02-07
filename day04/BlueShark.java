import java.util.Objects;

public class BlueShark extends Shark{
    public BlueShark(String sharkName) {
        super(sharkName);
    }

    //----method----
    @Override
    public boolean canEat(Animal animal) {
        if (Objects.equals(animal.getType(), "fish"))
            return true;
        else return false;
    }
}
