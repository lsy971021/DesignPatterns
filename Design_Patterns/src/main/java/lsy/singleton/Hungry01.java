package lsy.singleton;



/**
 * @author lsy
 * 饿汉式
 * 类加载到内存后就实例化一个单利，JVM保证线程安全
 * Class.forName("")
 * 简单实用，推荐使用！
 * 唯一缺点：不管用到与否，类装载时就完成实例化
 */
public class Hungry01 {
    public static final Hungry01 HUNGRY_01 = new Hungry01();

    /**
     * 用private确保别人不能new
     */
    private Hungry01() {
    }
    public static Hungry01 getHungry01(){
        return HUNGRY_01;
    }
}
