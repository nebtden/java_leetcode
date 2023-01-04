package wang.lvshang.designPattern.behavior.chain;

public class A implements People{
    @Override
    public Boolean  audit(Integer price) {
        if(price<100){

            System.out.println("A 100 success");
            return true;
        }else{
            System.out.println("A 200 fail");
            return null;
        }
    }
}
