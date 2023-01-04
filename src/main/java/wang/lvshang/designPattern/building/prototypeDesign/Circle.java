package wang.lvshang.designPattern.building.prototypeDesign;

public class Circle extends  Shape{
    public Circle(String name) {
        this.id = 20;
        this.name = name;
    }

    public Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }
}
