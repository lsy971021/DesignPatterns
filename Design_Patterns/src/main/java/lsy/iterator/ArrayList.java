package lsy.iterator;

import java.util.List;

/**
 * @author lsy
 */
public class ArrayList implements Collection_{
    List list = new java.util.ArrayList();
    @Override
    public void add(Object o) {
        list.add(o);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator_ iterator() {
        Iterator_ iterator_ = new Iterator_() {
            private int currentNum = 0;
            @Override
            public boolean hasNext() {
                if(currentNum>=list.size()) return false;
                return true;
            }

            @Override
            public Object next() {
                return list.get(currentNum++);
            }
        };
        return iterator_;
    }

}
