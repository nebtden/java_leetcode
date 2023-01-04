package wang.lvshang.designPattern.structure.decorator;

import java.util.List;

public class DecorateNode extends   DecorateText{
    private TextNode node;

    public DecorateNode(TextNode node) {
        this.node = node;
    }

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
        String html = node.toXml();
        return "<b>"+html+"</b>";
    }
}
