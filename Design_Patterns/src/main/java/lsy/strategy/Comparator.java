package lsy.strategy;

/**
 * @author lsy
 * 比较器
 */
public interface Comparator<T> {
    /**
     * 对两个T进行比较
     * @param t1
     * @param t2
     * @return
     */
    int compare(T t1,T t2);
}
