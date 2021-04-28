package lsy.iterator;

import java.util.List;

/**
 * @author lsy
 */
public class Main {
    public static void main(String[] args) {
        lsy.iterator.ArrayList arrayList = new lsy.iterator.ArrayList();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(10);
        Iterator_<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
