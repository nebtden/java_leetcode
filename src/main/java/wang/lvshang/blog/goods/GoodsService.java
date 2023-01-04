package wang.lvshang.blog.goods;

import com.alibaba.fastjson.JSON;
import wang.lvshang.blog.GiftInterface;

/**
 * 模拟实物商品服务
 */
public class GoodsService implements GiftInterface {

    public void send(){
        DeliverReq deliverReq = new DeliverReq();
        this.deliverGoods(deliverReq);
    }
    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }

}
