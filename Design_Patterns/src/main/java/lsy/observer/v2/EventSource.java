package lsy.observer.v2;

/**
 * @author lsy
 * 事件源
 */
public interface EventSource<T> {
    T getSource();
    void event();
}
