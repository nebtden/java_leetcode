package wang.lvshang.three.service;

import wang.lvshang.three.Matter;

/**
 * 装修物料
 */
public interface Building {

    /**
     * 场景；地板、地砖、涂料、吊顶
     */
    void setCeiling(Matter matter);

    /**
     * 品牌
     */
    void setCoat(Matter matter);
    Matter getCoat();
    Matter getCeiling();

/*    void floor();


    void tile();*/



}
