package lsy.singleton;

/**
 * @author lsy
 * 饿汉式
 * 跟01一样
 */
public class Hungry02 {
    public static final Hungry02 test02;
    static {
         test02 = new Hungry02();
    }
    private Hungry02() {
    }
    public static Hungry02 getTest02(){
        return test02;
    }
}
