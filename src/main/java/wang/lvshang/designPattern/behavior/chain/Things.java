package wang.lvshang.designPattern.behavior.chain;

public class Things {
    private String name;
    private Integer price;

    public Things(String name,Integer price) {
        this.name = name;
        this.price = price;
    }

    public Integer getPrice(){
        return price;
    }
}
