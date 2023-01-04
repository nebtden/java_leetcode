package wang.lvshang.designPattern.structure.bridge;

public class Engine {
    protected String name;

    public void start(){
        System.out.println("engine run"+this.name);
    }
}
