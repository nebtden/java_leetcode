package wang.lvshang.blog.coupon;

import wang.lvshang.blog.GiftInterface;

/**
 * 模拟优惠券服务
 */
public class CouponService implements GiftInterface {

    public void send(){
        this.sendCoupon("111","2222","333");
    }
    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }

}
