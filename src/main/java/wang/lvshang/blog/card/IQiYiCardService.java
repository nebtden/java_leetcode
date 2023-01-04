package wang.lvshang.blog.card;

import wang.lvshang.blog.GiftInterface;

/**
 * 模拟爱奇艺会员卡服务
 */
public class IQiYiCardService implements GiftInterface {

    public void send(){
        this.grantToken("111","2222");
    }

    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
    }

}
