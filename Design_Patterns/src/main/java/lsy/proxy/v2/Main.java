package lsy.proxy.v2;

import com.sun.deploy.net.proxy.ProxyHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lsy
 * Spring AOP
 * 动态代理
 */
public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        Eat person = (Eat) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[]{Eat.class},
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("洗手");
                Object invoke = method.invoke(p,args);
                System.out.println("刷碗");
                return invoke;
            }
        });
        person.action();

    }
}
