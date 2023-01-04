package wang.lvshang.blog;

public interface NumberFactory {
    Number parse(String s);

    // 获取工厂实例:
    static NumberFactory getFactory() {
        return impl;
    }

    static NumberFactory impl = new wang.lvshang.blog.NumberFactoryImpl();
}