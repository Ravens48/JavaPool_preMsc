package Composite;

import java.util.ArrayList;
import java.util.List;

public class SentenceComposite implements Sentence {
    private List<Sentence> childSentence = new ArrayList<>();

    @Override
    public void print() {
        for(Sentence sentence: childSentence) {
            sentence.print();
        }
    }

    public void add(Sentence s) {
        childSentence.add(s);
    }
    public void remove(Sentence s) {childSentence.remove(s);}
}
