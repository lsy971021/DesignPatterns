package lsy.strategy;

/**
 * @author lsy
 */
public interface Comparable<T> {
    /**
     * compare to
     * 比较两个值的大小
     * @param t
     * @return
     */
    int compareTo(T t);
}
