package lsy.composite;

/**
 * @Author lsy
 * 组合模式有时又叫作整体-部分（Part-Whole）模式，它是一种将对象组合成树状的层次结构的模式，
 * 用来表示“整体-部分”的关系
 *
 * 组合模式一般用来描述整体与部分的关系，它将对象组织到树形结构中，顶层的节点被称为根节点，根
 * 节点下面可以包含树枝节点和叶子节点，树枝节点下面又可以包含树枝节点和叶子节点
 *
 * 根节点和树枝节点本质上属于同一种数据类型，可以作为容器使用；而叶子节点与树枝节点在语义上不属
 * 于用一种类型。但是在组合模式中，会把树枝节点和叶子节点看作属于同一种数据类型（用统一接口定义），
 * 让它们具备一致行为。
 */
public class Main {
    public static void main(String[] args) {
        Branch branch = new Branch("branch");
        Branch branch01 = new Branch("branch01");
        Branch branch02 = new Branch("branch02");
        LeafNode leafNode01 = new LeafNode("001");
        LeafNode leafNode02 = new LeafNode("002");
        LeafNode leafNode03 = new LeafNode("003");
        branch01.add(leafNode01);
        branch02.add(leafNode02);
        branch02.add(leafNode03);
        branch.add(branch01);
        branch.add(branch02);
        /**
         * 遍历root
         */
        all(branch,0);
    }

    public static void all(Node node,int depth){
        for (int i = 0; i < depth; i++) System.out.print("--");
        node.out();
        if(node instanceof Branch){
            for (Node n : ((Branch) node).nodes()){
                all(n,depth+1);
            }
        }
    }
}
