package lsy.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lsy
 */
public class Branch extends Node{
    String v;

    public Branch(String v) {
        this.v = v;
        //System.out.println(v);
    }

    List<Node> root = new ArrayList<>();


    @Override
    public void out() {
        System.out.println(v);
    }

    public void add(Node node){
        root.add(node);
    }
    public List<Node> nodes(){
        return root;
    }
}
