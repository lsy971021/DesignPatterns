package lsy.command;

import java.util.concurrent.locks.LockSupport;

/**
 * @author lsy
 * 命令（Command）模式的定义如下：将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。这样两者之间通过命令对象
 * 进行沟通，这样方便将命令对象进行储存、传递、调用、增加与管理。
 * <p>
 * 命令模式的主要优点如下。
 * 通过引入中间件（抽象接口）降低系统的耦合度。
 * 扩展性良好，增加或删除命令非常方便。采用命令模式增加与删除命令不会影响其他类，且满足“开闭原则”。
 * 可以实现宏命令。命令模式可以与组合模式结合，将多个命令装配成一个组合命令，即宏命令。
 * 方便实现 Undo 和 Redo 操作。命令模式可以与后面介绍的备忘录模式结合，实现命令的撤销与恢复。
 * 可以在现有命令的基础上，增加额外功能。比如日志记录，结合装饰器模式会更加灵活。
 * <p>
 * 其缺点是：
 * 可能产生大量具体的命令类。因为每一个具体操作都需要设计一个具体命令类，这会增加系统的复杂性。
 * 命令模式的结果其实就是接收方的执行结果，但是为了以命令的形式进行架构、解耦请求与实现，引入了额外类型结构（引入了请求方与抽
 * 象命令接口），增加了理解上的困难。不过这也是设计模式的通病，抽象必然会额外增加类的数量，代码抽离肯定比代码聚合更加难理解。
 */
public class Main {
    public static void main(String[] args) {
        Command command = new ComputerCommand();
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
