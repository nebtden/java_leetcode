package wang.lvshang.designPattern.structure.decorator;

import java.util.List;

public class TextNode implements Node {

    private String text;

    public  TextNode(String text) {
        this.text =text;
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
        return text;
    }
}
