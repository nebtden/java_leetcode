package wang.lvshang.designPattern.building.prototypeDesign;

public class Application {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle("first");
        Circle circle1 =  circle.clone();
        System.out.println(circle1.id);
        System.out.println(circle.id);
    }
}


