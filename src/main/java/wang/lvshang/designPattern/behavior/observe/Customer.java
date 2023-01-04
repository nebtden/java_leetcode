package wang.lvshang.designPattern.behavior.observe;

public class Customer implements User{

    @Override
    public void onPublish(Product product){
        System.out.println("admin begin ");
        System.out.println(product.getName());
    }
}
