package wang.lvshang.designPattern.structure.composite;


public class Application {
    public static void main(String[] args){
        Node html = new ElementNode("li");
        String text = html.add(new TextNode("this is simon")).add(new CommentNode("this is comment")).toXml();
        System.out.println(text);
    }
}




