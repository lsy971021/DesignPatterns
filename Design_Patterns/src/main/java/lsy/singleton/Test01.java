package lsy.singleton;

import org.junit.Test;

/**
 * @author lsy
 * 饿汉式
 * 类加载到内存后就实例化一个单利，JVM保证线程安全
 * Class.forName("")
 * 简单实用，推荐使用！
 * 唯一缺点：不管用到与否，类装载时就完成实例化
 */
public class Test01 {
    public static final Test01 test01 = new Test01();

    /**
     * 用private确保别人不能new
     */
    private Test01() {
    }
    public static Test01 getTest01(){
        return test01;
    }
}
