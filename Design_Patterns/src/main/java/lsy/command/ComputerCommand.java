package lsy.command;

/**
 * @author lsy
 */
public class ComputerCommand implements Command{
    ShutDown shutDown;

    public ComputerCommand() {
        shutDown = new ShutDown();
    }

    @Override
    public void excute() {
        shutDown.doit();
    }
}
