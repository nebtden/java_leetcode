package wang.lvshang.blog;

import wang.lvshang.blog.coupon.CouponService;

public class sendObject {
    public  GiftInterface getGift(AwardReq req){
        if (req.getAwardType() == 1) {
            return new CouponService();
        }

        return null;
    }
}
