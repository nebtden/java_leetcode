package wang.lvshang.designPattern.building.abstractFactory;

public class GoodFurniture implements FurnitureInterface{
   @Override
   public ChairInterface createChair() {
    return new ChairGood();
   }

   @Override
   public DeskInterface createDesk(){
      return new DeskGood();
   };
}
