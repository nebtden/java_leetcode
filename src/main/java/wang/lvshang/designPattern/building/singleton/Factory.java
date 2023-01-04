package wang.lvshang.designPattern.building.singleton;

public class Factory {

    private Factory(){
        System.out.println("first factory");
    }
    private static Factory factory = new Factory();
    public static Factory getFactory(){
        return factory;
    }
}
