package linkedlist;
import java.lang.annotation.Inherited;
import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
    private E[] values;
    private int index;

    public ArrayIterator(E[] values) {
        this.values = values;
        this.index = 0;
    }

    public <T> ArrayIterator(Node<T> head) {
    }
    public boolean hasNext() {return index < values.length;}
    public E next() {return values[index++];}


}
