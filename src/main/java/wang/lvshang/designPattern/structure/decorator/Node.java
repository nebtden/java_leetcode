package wang.lvshang.designPattern.structure.decorator;

import java.util.List;

public interface Node {
    Node add(Node node);

    List<Node> child();

    String toXml();

}
