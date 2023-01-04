package wang.lvshang.designPattern.behavior.observe;

public class Product {
    private Double price;
    private String name;


    public Product(Double price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void  setPrice(Double price){
        this.price = price;
    }


}
