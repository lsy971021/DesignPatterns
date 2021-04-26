package lsy.singleton;

/**
 * @author lsy
 * 懒汉式
 * getTest03_3、getTest03_4 可以解决getTest03_4更合适；
 */
public class Lazy {
    private static Lazy lazy;

    private Lazy() {
    }

    /**
     * 线程不安全
     *
     * @return
     */
    public static Lazy getLazy() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }

    /**
     * 效率低
     *
     * @return
     */
    public static synchronized Lazy getTest03_1() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }

    /**
     * 线程不安全，效率低
     *
     * @return
     */
    public static Lazy getTest03_2() {
        if (lazy == null) {
            synchronized ("lock") {
                lazy = new Lazy();
            }
        }
        return lazy;
    }

    /**
     * 可以解决，但效率也低
     *
     * @return
     */
    public static Lazy getTest03_3() {
        if (lazy == null) {
            synchronized ("lock") {
                if (lazy == null) {
                    lazy = new Lazy();
                }
            }
        }
        return lazy;
    }

    /**
     * 静态内部类解决！
     * 加载外部类不会加在内部类，可以实现懒加载
     */
    private static class Test{
         public static final Lazy LAZY = new Lazy();
    }
    public static Lazy getTest03_4(){
        return Test.LAZY;
    }

}
