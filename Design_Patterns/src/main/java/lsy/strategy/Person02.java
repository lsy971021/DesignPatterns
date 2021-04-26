package lsy.strategy;

/**
 * @author lsy
 * use Comparator
 */
public class Person02 implements Comparator<Person02>{
    private double high;

    public Person02(double a) {
        this.high = a;
    }

    public double getA() {
        return high;
    }

    public void setA(double a) {
        this.high = a;
    }

    public static void main(String[] args) {
        Person02 t1 = new Person02(11.11);
        Person02 t2 = new Person02(11.13);
        System.out.println(t1.compare(t1, t2));
    }
    @Override
    public int compare(Person02 t1, Person02 t2) {
        if(t1.getA()>t2.getA()) return 1;
        else if(t1.getA()<t2.getA()) return -1;
        return 0;
    }
}
