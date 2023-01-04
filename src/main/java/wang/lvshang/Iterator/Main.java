package wang.lvshang.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static  void  main() {
        SimonIterable<String> simonIterable = new SimonIterable<>();
        //

    }
}

class SimonIterable<T> implements Iterable<T>{

    private List<T> list = new ArrayList<>();

    public void add(T t) {
        list.add(t);
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseIterator(list.size());
    }

    class ReverseIterator implements Iterator<T> {
        int index;

        ReverseIterator(int index) {
            this.index = index;
        }

        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public T next() {
            index--;
            return SimonIterable.this.list.get(index);
        }
    }

}
