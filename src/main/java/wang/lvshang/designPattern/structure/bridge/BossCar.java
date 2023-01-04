package wang.lvshang.designPattern.structure.bridge;



public class BossCar extends Car {
    public BossCar(Engine engine) {
        super(engine);
        this.brand ="boss";
    }
}
