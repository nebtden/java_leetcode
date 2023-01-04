package wang.lvshang.designPattern.building.abstractFactory;

public class BadFurniture implements FurnitureInterface{
   @Override
   public ChairInterface createChair() {
    return new ChairBad();
   }

   @Override
   public DeskInterface createDesk(){
      return new DeskBad();
   };
}
