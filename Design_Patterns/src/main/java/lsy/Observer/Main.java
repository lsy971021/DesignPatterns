package lsy.Observer;

/**
 * @author lsy
 * 爸爸和妈妈观察孩子是否型了，如果醒了就哭，爸爸妈妈做出响应动作不让孩子哭
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Baby baby = new Baby();
        Observer dad = new Dad();
        Observer mom = new Mom();
        while (true){
            Thread.sleep(2000);
            new Thread(){
                @Override
                public void run() {
                    baby.wakeUp();
                }
            }.start();
            new Thread(){
                @Override
                public void run() {
                    if(baby.cry) dad.action(baby);
                }
            }.start();
            if(baby.cry) mom.action(baby);
        }
    }
}
