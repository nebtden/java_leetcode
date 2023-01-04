package wang.lvshang.designPattern.structure.decorator;

import java.util.List;

public class DecorateText implements  Node{
    private TextNode node;


    @Override
    public Node add(Node node) {
        return null;
    }

    @Override
    public List<Node> child() {
        return null;
    }

    @Override
    public String toXml() {
        String html = this.node.toXml();
        return "<b>"+html+"</b>";
    }
}
