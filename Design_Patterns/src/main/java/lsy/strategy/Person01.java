package lsy.strategy;

/**
 * @author lsy
 * use Comparable
 */
public class Person01 implements Comparable<Person01>{
    private int age;
    private int high;

    public Person01(int age, int high) {
        this.age = age;
        this.high = high;
    }

    public static void main(String[] args) {
        Person01 person01 = new Person01(12,160);
        Person01 test02 = new Person01(14,160);
        System.out.println(person01.compareTo(test02));
    }

    @Override
    public int compareTo(Person01 person01) {
        if(this.high> person01.high) return 1;
        else if(this.high< person01.high) return -1;
        return 0;
    }
}
