package wang.lvshang.designPattern.behavior.observe;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    private List<User> obsersers = new ArrayList<>();

    public void addObserver(User user){
        obsersers.add(user);
    }

    public void onPushProduct(Product product){
        for (User user:obsersers){
            System.out.println("user start");
            user.onPublish(product);

        }

    }
}
