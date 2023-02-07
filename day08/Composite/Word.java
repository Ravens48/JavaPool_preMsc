package Composite;

public class Word implements Sentence{
    private String str;

    public Word(String string) {
        this.str = string;
    }

    @Override
    public void print() {
        System.out.println(str);
    }
}
