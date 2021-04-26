package lsy.Observer.v2;

/**
 * @author lsy
 * 定义了事件接口、观察者接口 具体类去分别实现
 * 解偶！！！
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        EventSource<Baby> baby = new Baby();
        Observer dad = new Dad();
        Observer mom = new Mom();

        while (true){
            Thread.sleep(2000);
            new Thread(){
                @Override
                public void run() {
                    baby.event();
                }
            }.start();
            new Thread(){
                @Override
                public void run() {
                    if(IsCry.cry) dad.action(baby);
                }
            }.start();
            if(IsCry.cry) mom.action(baby);
        }
    }
}
