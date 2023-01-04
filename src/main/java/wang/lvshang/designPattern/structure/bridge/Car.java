package wang.lvshang.designPattern.structure.bridge;

public class Car {

    // 引用Engine:
    protected Engine engine;
    protected String brand;

    public Car(Engine engine) {
        this.engine = engine;
    }
    public  void drive(){
        System.out.println(this.brand+" :品牌");
        System.out.println(this.engine.name+" :引擎");
    };

}
