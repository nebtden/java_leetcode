package wang.lvshang.designPattern.behavior.chain;

public class Application {
    public static void main(String[] args){

        // 构造责任链:
//        HandlerChain chain = new HandlerChain();
//        chain.addHandler(new ManagerHandler());
//        chain.addHandler(new DirectorHandler());
//        chain.addHandler(new CEOHandler());
//// 处理请求:
//        chain.process(new Request("Bob", new BigDecimal("123.45")));
//        chain.process(new Request("Alice", new BigDecimal("1234.56")));
//        chain.process(new Request("Bill", new BigDecimal("12345.67")));
//        chain.process(new Request("John", new BigDecimal("123456.78")));
//
        //责任链添加
        PeopleChain chain = new PeopleChain();
        chain.add(new A());
        chain.add(new B());
        chain.add(new C());

        chain.handle(new Things("eat",500));
        chain.handle(new Things("eat",500));
        chain.handle(new Things("eat",500));


    }

}



