package lsy.strategy;

/**
 * @author lsy
 * use Comparator
 */
public class Test02 implements Comparator<Test02>{
    private double a;

    public Test02(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Test02 t1 = new Test02(11.11);
        Test02 t2 = new Test02(11.13);
        System.out.println(t1.compare(t1, t2));
    }
    @Override
    public int compare(Test02 t1, Test02 t2) {
        if(t1.getA()>t2.getA()) return 1;
        else if(t1.getA()<t2.getA()) return -1;
        return 0;
    }
}
