package wang.lvshang.designPattern.building.abstractFactory;

public class Application {
    public static void main(String[] args){
        FurnitureInterface furniture = new GoodFurniture();
        ChairInterface  chair= furniture.createChair();
        DeskInterface   desk = furniture.createDesk();
    }
}


