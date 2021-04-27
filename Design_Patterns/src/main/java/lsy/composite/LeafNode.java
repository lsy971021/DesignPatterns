package lsy.composite;

/**
 * @author lsy
 */
public class LeafNode extends Node{
    String value;
    public LeafNode() {
    }

    public LeafNode(String value) {
        this.value = value;
        //System.out.println(value);
    }

    @Override
    public void out() {
        System.out.println(value);
    }
}
