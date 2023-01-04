package wang.lvshang.blog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 模拟发奖服务
 */
public class Prize2Controller {

    private Logger logger = LoggerFactory.getLogger(Prize2Controller.class);


    public AwardRes awardToUser(AwardReq req) {
        sendObject send = new sendObject();
        GiftInterface gift = send.getGift(req);
        gift.send();

        return null;
    }

    private String queryUserName(String uId) {
        return "花花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }

}
