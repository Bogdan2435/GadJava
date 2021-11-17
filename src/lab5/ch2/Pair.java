package lab5.ch2;

public class Pair <T> extends Shoe {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
        if(!first.getColor().equals(second.getColor())){
            throw new Exception("Color must match.");
        }

        if(first.getSize()!=second.getSize())
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
