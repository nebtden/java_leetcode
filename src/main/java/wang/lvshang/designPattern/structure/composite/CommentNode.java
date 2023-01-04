package wang.lvshang.designPattern.structure.composite;

import java.util.List;

public class CommentNode implements Node{

    private String text;

    public   CommentNode(String text) {
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
    public String toXml(){
        return "<--"+text+"-->";
    }
}
