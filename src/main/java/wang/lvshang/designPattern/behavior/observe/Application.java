package wang.lvshang.designPattern.behavior.observe;

public class Application {
    public static void main(String[] args){
        //更新处理


        Observer observer = new Observer();
        observer.addObserver(new Admin());
        observer.addObserver(new Customer());

        Product product = new Product(200.0,"desk");
        observer.onPushProduct(product);

    }

}




