package lsy.visitor;

/**
 * @author lsy
 */
public interface Visitor {
    void visitCpu(CPU cpu);
    void visitMemory(Memory memory);
    void visitBoard(Board board);
}
