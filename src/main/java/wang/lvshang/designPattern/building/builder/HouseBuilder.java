package wang.lvshang.designPattern.building.builder;



public class HouseBuilder {
   private House house;
   public HouseBuilder( ) {
      this.house = new House();
   }



   public HouseBuilder createChair() {
      this.house.setChair(new ChairGood());
      return this;
   }


   public HouseBuilder createDesk(){
      this.house.setDesk(new DeskGood());
      return this;
   };

   public House getHouse(){
      return this.house;
   }
}
