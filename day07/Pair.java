public class Pair<T,V> {
    private T first;
    private V second;
    public Pair(T pFirst, V pSecond) {
        this.first = pFirst;
        this.second = pSecond;
    }

    public void display() {
        System.out.println("first: "+ this.first + ", second: "+ this.second + ".");
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}
