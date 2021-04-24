package lsy.strategy;

/**
 * @author lsy
 * use Comparable
 */
public class Test01 implements Comparable<Test01>{
    private int age;
    private int high;

    public Test01(int age, int high) {
        this.age = age;
        this.high = high;
    }

    public static void main(String[] args) {
        Test01 test01 = new Test01(12,160);
        Test01 test02 = new Test01(14,160);
        System.out.println(test01.compareTo(test02));
    }

    @Override
    public int compareTo(Test01 test01) {
        if(this.high>test01.high) return 1;
        else if(this.high<test01.high) return -1;
        return 0;
    }
}
