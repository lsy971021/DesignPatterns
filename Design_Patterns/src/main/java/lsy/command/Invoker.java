package lsy.command;


/**
 * @author lsy
 */
public class Invoker {
    private Command command;
    public Invoker(Command command){
        this.command = command;
    }
    public void action(){
        System.out.println("开始执行操作====");
        System.out.println(".........");
        command.excute();
    }
}
