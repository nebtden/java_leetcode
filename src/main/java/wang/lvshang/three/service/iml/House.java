package wang.lvshang.three.service.iml;

import wang.lvshang.three.Matter;
import wang.lvshang.three.service.Building;

public class House implements Building {

    private Matter ceiling;
    private Matter coat;

    @Override
    public void setCeiling(Matter matter) {
        this.ceiling = matter;
    }

    @Override
    public void setCoat(Matter matter) {
        this.coat =  matter;
    }

    public Matter getCoat(){
        return this.coat;
    }

    public Matter getCeiling(){
        return this.ceiling;
    }


/*    @Override
    public void floor() {
        return new DerFloor();
    }

    @Override
    public void tile() {
        return new DongPengTile();
    }*/
}
