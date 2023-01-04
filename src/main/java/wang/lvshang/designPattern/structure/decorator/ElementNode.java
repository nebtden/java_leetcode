package wang.lvshang.designPattern.structure.decorator;

import java.util.ArrayList;
import java.util.List;

public class ElementNode implements Node {

    private String tag;

    public ElementNode(String tag) {
        this.tag = tag;
    }

    private List<Node> list = new ArrayList<>();

    @Override
    public Node add(Node node) {
        list.add(node);
        return this;
    }

    @Override
    public List<Node> child() {
        return list;
    }

    @Override
    public String toXml() {
        String html = "<"+tag+">";
        for (int i = 0; i < list.size(); i++) {
            String xml = list.get(i).toXml();
            html = html+ xml;
        }
        html = html+ "</"+tag+">";
        return html;
    }
}
