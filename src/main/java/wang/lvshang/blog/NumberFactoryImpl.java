package wang.lvshang.blog;

import java.math.BigDecimal;

public class NumberFactoryImpl implements wang.lvshang.blog.NumberFactory {
    public Number parse(String s) {
        return new BigDecimal(s);
    }
}