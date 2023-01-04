package wang.lvshang.blog;

import java.time.LocalDate;

public class LocalDateFactory {

    public static  LocalDate fromInt(int yyyyMMdd) {
        String date = String.valueOf(yyyyMMdd);
        String year = date.substring(0,4);
        String money = date.substring(4,6);
        String day = date.substring(6,8);
        LocalDate td = LocalDate.parse(year+"-"+money+"-"+day);
        System.out.println(td);
        return td;

    }
}