package wang.lvshang.designPattern.behavior.observe;

import java.util.HashMap;
import java.util.Map;

public class Store {
//    Customer customer;
//    Admin admin;

    private Map<String, Product> products = new HashMap<>();

    public void addNewProduct(String name, double price) {
        Product p = new Product(price, name);
        products.put(p.getName(), p);
       // observer
    }

    public void setProductPrice(String name, double price) {
        Product p = products.get(name);
        p.setPrice(price);
        // 通知用户:
        //customer.onPriceChanged(p);
        // 通知管理员:
       // admin.onPriceChanged(p);
    }
}
