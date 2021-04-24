package lsy;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Student {
    public static void main(String[] args) throws Exception {
        Class<?> person = Class.forName("lsy.Person");
        Object o = person.newInstance();
        Field[] fields = person.getDeclaredFields();
        System.out.println(Arrays.toString(fields));
        fields[2].set(new Person(),33);
        System.out.println(Arrays.toString(fields));
        System.out.println(person.getMethod("getAge", null).invoke(o));
    }
}
