import java.util.ArrayList;
import java.util.List;

public class Battalion<T extends Character> {
    //no ctor
    private List<Character> characters = new ArrayList<>();

    public <T extends Character> void add(List<T>  characList) {
        for (Character perso: characList) {
            characters.add(perso);
        }
    }

    public void display() {
        for (Character perso: characters) {
            System.out.println(perso.getName());
        }
    }

    public boolean fight() {
        int res;
        if (characters.size() > 1) {
            res = characters.get(0).compareTo(characters.get(1));
            if (res < 0) {
                characters.remove(0);
                return true;
            }
            else if (res > 0) {
                characters.remove(1);
                return true;
            }
            else characters.remove(0);characters.remove(0);
            return true;
        };
        return false;
    }
}
