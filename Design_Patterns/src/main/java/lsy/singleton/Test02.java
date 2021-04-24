package lsy.singleton;

/**
 * @author lsy
 * 饿汉式
 * 跟01一样
 */
public class Test02 {
    public static final Test02 test02;
    static {
         test02 = new Test02();
    }
    private Test02() {
    }
    public static Test02 getTest02(){
        return test02;
    }
}
