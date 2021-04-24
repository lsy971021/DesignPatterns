package lsy.singleton;

/**
 * @author lsy
 * 懒汉式
 * getTest03_3、getTest03_4 可以解决getTest03_4更合适；
 */
public class Test03 {
    private static Test03 test03;

    private Test03() {
    }

    /**
     * 线程不安全
     *
     * @return
     */
    public static Test03 getTest03() {
        if (test03 == null) {
            test03 = new Test03();
        }
        return test03;
    }

    /**
     * 效率低
     *
     * @return
     */
    public static synchronized Test03 getTest03_1() {
        if (test03 == null) {
            test03 = new Test03();
        }
        return test03;
    }

    /**
     * 线程不安全，效率低
     *
     * @return
     */
    public static Test03 getTest03_2() {
        if (test03 == null) {
            synchronized ("lock") {
                test03 = new Test03();
            }
        }
        return test03;
    }

    /**
     * 可以解决，但效率也低
     *
     * @return
     */
    public static Test03 getTest03_3() {
        if (test03 == null) {
            synchronized ("lock") {
                if (test03 == null) {
                    test03 = new Test03();
                }
            }
        }
        return test03;
    }

    /**
     * 静态内部类解决！
     * 加载外部类不会加在内部类，可以实现懒加载
     */
    private static class Test{
         public static final Test03 test03 = new Test03();
    }
    public static Test03 getTest03_4(){
        return Test.test03;
    }

}
