package wang.lvshang.designPattern.structure.bridge;



public class Application {
    public static void main(String[] args){
        Car car = new BossCar( new HybridEngine());
        car.drive();
    }
}




