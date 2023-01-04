package wang.lvshang.designPattern.building.builder;

public class Application {
    public static void main(String[] args){
        HouseBuilder builder = new HouseBuilder();
        House house = builder.createChair().createDesk().getHouse();
        System.out.println(house);
    }
}




