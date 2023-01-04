package wang.lvshang.designPattern.building.builder;

public class House{
    public ChairInterface getChair() {
        return chair;
    }

    public void setChair(ChairInterface chair) {
        this.chair = chair;
    }

    private ChairInterface chair;

    public DeskInterface getDesk() {
        return desk;
    }

    public void setDesk(DeskInterface desk) {
        this.desk = desk;
    }

    private DeskInterface desk;
}
