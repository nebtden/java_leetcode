package wang.lvshang.designPattern.building.prototypeDesign;

public abstract class Shape implements  Cloneable{

    protected Integer id;
    protected String name;

    public Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }

}
