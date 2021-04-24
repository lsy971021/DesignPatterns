package lsy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lsy
 */
public class Proxy {
    public static void main(String[] args) {
        Compare compare = new Compare(10);
        Comparable<Compare> c =(Comparable<Compare>) java.lang.reflect.Proxy.newProxyInstance(Compare.class.getClassLoader(), compare.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object invoke = method.invoke(compare, args);
                return invoke;
            }
        });
        System.out.println(c.compareTo(new Compare(12)));
    }
}
